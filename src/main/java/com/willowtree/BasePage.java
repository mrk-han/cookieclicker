package com.willowtree;

import io.ddavison.conductor.Locomotive;

/***
 *
 *
 *                 ,---,
 *          ,---,,--.' |                    ,---,
 *        ,---.'||  |  :       ,---.      ,---.'|
 *        |   | ::  :  :      '   ,'\     |   | :  ,----._,.
 *        |   | |:  |  |,--. /   /   |    |   | | /   /  ' /   ,---.
 *      ,--.__| ||  :  '   |.   ; ,. :  ,--.__| ||   :     |  /     \
 *     /   ,'   ||  |   /' :'   | |: : /   ,'   ||   | .\  . /    /  |
 *    .   '  /  |'  :  | | |'   | .; :.   '  /  |.   ; ';  |.    ' / |
 *    '   ; |:  ||  |  ' | :|   :    |'   ; |:  |'   .   . |'   ;   /|
 *    |   | '/  '|  :  :_:,' \   \  / |   | '/  ' `---`-'| |'   |  / |
 *    |   :    :||  | ,'      `----'  |   :    :| .'__/\_: ||   :    |
 *     \   \  /  `--''                 \   \  /   |   :    : \   \  /
 *      `----'                          `----'     \   \  /   `----'
 *                                                  `--`-'
 */

public class BasePage {

    // CSS Selectors

    private Locomotive driver;

    public BasePage(Locomotive driver) {
        this.driver = driver;
    }

    public Locomotive getDriver() {
        return driver;
    }

}
