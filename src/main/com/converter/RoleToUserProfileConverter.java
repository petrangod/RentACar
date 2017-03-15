package main.com.converter;

import main.com.entity.UserProfile;
import main.com.service.UserProfileService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */
@Component
public class RoleToUserProfileConverter implements Converter {

    private static final Logger LOG = Logger.getLogger(RoleToUserProfileConverter.class);

    @Autowired
    UserProfileService userProfileService;

    @Override
    public UserProfile convert(Object source) {
        Integer id = Integer.parseInt((String)source);
        UserProfile profile= userProfileService.findById(id);
        LOG.info("Profile : " + profile);
        return profile;
    }
}
