package org.wade.mbus.worker.repository.impl;

import org.springframework.stereotype.Repository;
import org.wade.mbus.worker.repository.IValidateCodeRepository;
import org.wade.mbus.worker.repository.uitls.IENExternal;
import sun.misc.BASE64Encoder;

@Repository("enExValidateCodeRepositoryImpl")
public class ENExValidateCodeRespositoryImpl implements IValidateCodeRepository {
    @Override
    public String getImageText(byte[] data) {
        /*BASE64Encoder encoder = new BASE64Encoder();
        return IENExternal.Library.GetImageText2(encoder.encode(data));*/
        return null;
    }
}
