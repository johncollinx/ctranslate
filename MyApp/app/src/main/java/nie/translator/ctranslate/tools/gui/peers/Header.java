/*
 * Copyright 2016 Luca Martino.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copyFile of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nie.translator.ctranslate.tools.gui.peers;

import androidx.annotation.Nullable;

public class Header implements Listable {
    private String text;

    public Header(String text){
        this.text=text;
    }


    public String getText() {
        return text;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(obj instanceof Header){
            Header header= (Header) obj;
            return text.equals(header.getText());
        }
        return false;
    }
}
