package main.com.dao;

import main.com.entity.PersistentLogin;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Repository("tokenRepositoryDao")
@Transactional
public class HibernateTokenRepositoryImpl extends AbstractDao<String, PersistentLogin>
        implements PersistentTokenRepository {

    private static final Logger LOG = Logger.getLogger(HibernateTokenRepositoryImpl.class);


    @Override
    public void createNewToken(PersistentRememberMeToken token) {
        LOG.info("Creating Token for user : " + token.getUsername());
        PersistentLogin persistentLogin = new PersistentLogin();
        persistentLogin.setUserName(token.getUsername());
        persistentLogin.setSeries(token.getSeries());
        persistentLogin.setToken(token.getTokenValue());
        persistentLogin.setLastUsed(token.getDate());
        persist(persistentLogin);
    }

    @Override
    public void updateToken(String seriesId, String tokenValue, Date lastUsed) {
        LOG.info("Updating Token for seriesId : " + seriesId);
        PersistentLogin persistentLogin = getByKey(seriesId);
        persistentLogin.setToken(tokenValue);
        persistentLogin.setLastUsed(lastUsed);
        update(persistentLogin);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        LOG.info("Fetch Token if any for seriesId : " + seriesId);
        try {
            Criteria crit = createEntityCriteria();
            crit.add(Restrictions.eq("series", seriesId));
            PersistentLogin persistentLogin = (PersistentLogin) crit.uniqueResult();

            return new PersistentRememberMeToken(persistentLogin.getUserName(), persistentLogin.getSeries(),
                    persistentLogin.getToken(), persistentLogin.getLastUsed());
        } catch (Exception e) {
            LOG.info("Token not found..." + e.getMessage());
            return null;
        }
    }

    @Override
    public void removeUserTokens(String username) {
        LOG.info("Removing Token if any for user : " + username);
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("username", username));
        PersistentLogin persistentLogin = (PersistentLogin) crit.uniqueResult();
        if (persistentLogin != null) {
            LOG.info("rememberMe was selected");
            delete(persistentLogin);
        }
    }

}
