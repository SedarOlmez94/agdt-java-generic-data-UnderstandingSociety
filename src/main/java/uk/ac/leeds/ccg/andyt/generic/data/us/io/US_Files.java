/*
 * Copyright 2018 geoagdt.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.andyt.generic.data.us.io;

import java.io.File;
import java.io.Serializable;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_Files;
import uk.ac.leeds.ccg.andyt.generic.data.us.core.US_Strings;

/**
 *
 * @author geoagdt
 */
public class US_Files extends Generic_Files implements Serializable {

    /**
     *
     * @param s
     * @param dir
     */
    public US_Files(US_Strings s, File dir) {
        super(s, dir);
    }

    public File getInputDataDir(String s) {
        return new File(getInputDataDir(), s);
    }

    public File getUSInputDir() {
        File r;
        r = getInputDataDir();
        //r = new File(getInputDataDir(Strings), "US");
        r = new File(r, "UKDA-6614-tab");
        r = new File(r, "tab");
        return r;
    }

    public File getGeneratedUSDir() {
//        File dir;
//        dir = getGeneratedDataDir(Strings);
//        File f;
//        f = new File(dir, "US");
//        f.mkdirs();
//        return f;
        return getGeneratedDataDir();
    }
    
    public File getGeneratedUSSubsetsDir() {
        File dir;
        dir = getGeneratedUSDir();
        File f;
        f = new File(dir, "Subsets");
        f.mkdirs();
        return f;
    }

    public File getEnvDataFile() {
        return new File(getGeneratedDataDir(), "Env.dat");
    }
}
