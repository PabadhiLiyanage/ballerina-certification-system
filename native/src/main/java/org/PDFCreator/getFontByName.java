/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.PDFCreator;

import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class getFontByName {
    public static PDType1Font getFontByName(String fontName) {
        switch (fontName.toUpperCase()) {
            case "TIMES_ROMAN":
                return PDType1Font.TIMES_ROMAN;
            case "TIMES_BOLD":
                return PDType1Font.TIMES_BOLD;
            case "TIMES_ITALIC":
                return PDType1Font.TIMES_ITALIC;
            case "TIMES_BOLD_ITALIC":
                return PDType1Font.TIMES_BOLD_ITALIC;
            case "HELVETICA":
                return PDType1Font.HELVETICA;
            case "HELVETICA_BOLD":
                return PDType1Font.HELVETICA_BOLD;
            case "HELVETICA_OBLIQUE":
                return PDType1Font.HELVETICA_OBLIQUE;
            case "HELVETICA_BOLD_OBLIQUE":
                return PDType1Font.HELVETICA_BOLD_OBLIQUE;
            case "COURIER":
                return PDType1Font.COURIER;
            case "COURIER_BOLD":
                return PDType1Font.COURIER_BOLD;
            case "COURIER_OBLIQUE":
                return PDType1Font.COURIER_OBLIQUE;
            case "COURIER_BOLD_OBLIQUE":
                return PDType1Font.COURIER_BOLD_OBLIQUE;
            case "SYMBOL":
                return PDType1Font.SYMBOL;
            case "ZAPF_DINGBATS":
                return PDType1Font.ZAPF_DINGBATS;
            default:
                throw new IllegalArgumentException("Invalid font name: " + fontName);
        }
    }
    
}
