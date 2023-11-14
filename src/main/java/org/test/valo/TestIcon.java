package org.test.valo;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;

import java.util.ArrayList;
import java.util.List;

public class TestIcon {

    int iconCount = 0;

    public TestIcon(int startIndex) {
        iconCount = startIndex;
    }

    public Resource get() {
        return get(false, 32);
    }

    public Resource get(boolean isImage) {
        return get(isImage, 32);
    }

    public Resource get(boolean isImage, int imageSize) {
        if (!isImage) {
            if (++iconCount >= ICONS.size()) {
                iconCount = 0;
            }
            return ICONS.get(iconCount);
        }
        return new ThemeResource(
                "../runo/icons/" + imageSize + "/document.png");
    }

    static List<FontAwesome> ICONS = new ArrayList<>();
    static {
        ICONS.add(FontAwesome.ADJUST);
        ICONS.add(FontAwesome.ADN);
        ICONS.add(FontAwesome.ALIGN_CENTER);
        ICONS.add(FontAwesome.ALIGN_JUSTIFY);
        ICONS.add(FontAwesome.ALIGN_LEFT);
        ICONS.add(FontAwesome.ALIGN_RIGHT);
        ICONS.add(FontAwesome.AMBULANCE);
        ICONS.add(FontAwesome.ANCHOR);
        ICONS.add(FontAwesome.ANDROID);
        ICONS.add(FontAwesome.ANGLE_DOUBLE_DOWN);
        ICONS.add(FontAwesome.ANGLE_DOUBLE_LEFT);
        ICONS.add(FontAwesome.ANGLE_DOUBLE_RIGHT);
        ICONS.add(FontAwesome.ANGLE_DOUBLE_UP);
        ICONS.add(FontAwesome.ANGLE_DOWN);
        ICONS.add(FontAwesome.ANGLE_LEFT);
        ICONS.add(FontAwesome.ANGLE_RIGHT);
        ICONS.add(FontAwesome.ANGLE_UP);
        ICONS.add(FontAwesome.APPLE);
        ICONS.add(FontAwesome.ARCHIVE);
        ICONS.add(FontAwesome.ARROW_CIRCLE_DOWN);
        ICONS.add(FontAwesome.ARROW_CIRCLE_LEFT);
        ICONS.add(FontAwesome.ARROW_CIRCLE_O_DOWN);
        ICONS.add(FontAwesome.ARROW_CIRCLE_O_LEFT);
        ICONS.add(FontAwesome.ARROW_CIRCLE_O_RIGHT);
        ICONS.add(FontAwesome.ARROW_CIRCLE_O_UP);
        ICONS.add(FontAwesome.ARROW_CIRCLE_RIGHT);
        ICONS.add(FontAwesome.ARROW_CIRCLE_UP);
        ICONS.add(FontAwesome.ARROW_DOWN);
        ICONS.add(FontAwesome.ARROW_LEFT);
        ICONS.add(FontAwesome.ARROW_RIGHT);
        ICONS.add(FontAwesome.ARROW_UP);
        ICONS.add(FontAwesome.ARROWS);
        ICONS.add(FontAwesome.ARROWS_ALT);
        ICONS.add(FontAwesome.ARROWS_H);
        ICONS.add(FontAwesome.ARROWS_V);
        ICONS.add(FontAwesome.ASTERISK);
        ICONS.add(FontAwesome.AUTOMOBILE);
        ICONS.add(FontAwesome.BACKWARD);
        ICONS.add(FontAwesome.BAN);
        ICONS.add(FontAwesome.BANK);
        ICONS.add(FontAwesome.BAR_CHART_O);
        ICONS.add(FontAwesome.BARCODE);
        ICONS.add(FontAwesome.BARS);
        ICONS.add(FontAwesome.BEER);
        ICONS.add(FontAwesome.BEHANCE);
        ICONS.add(FontAwesome.BEHANCE_SQUARE);
        ICONS.add(FontAwesome.BELL);
        ICONS.add(FontAwesome.BELL_O);
        ICONS.add(FontAwesome.BITBUCKET);
        ICONS.add(FontAwesome.BITBUCKET_SQUARE);
        ICONS.add(FontAwesome.BITCOIN);
        ICONS.add(FontAwesome.BOLD);
        ICONS.add(FontAwesome.BOLT);
        ICONS.add(FontAwesome.BOMB);
        ICONS.add(FontAwesome.BOOK);
        ICONS.add(FontAwesome.BOOKMARK);
        ICONS.add(FontAwesome.BOOKMARK_O);
        ICONS.add(FontAwesome.BRIEFCASE);
        ICONS.add(FontAwesome.BTC);
        ICONS.add(FontAwesome.BUG);
        ICONS.add(FontAwesome.BUILDING);
        ICONS.add(FontAwesome.BUILDING_O);
        ICONS.add(FontAwesome.BULLHORN);
        ICONS.add(FontAwesome.BULLSEYE);
        ICONS.add(FontAwesome.CAB);
        ICONS.add(FontAwesome.CALENDAR);
        ICONS.add(FontAwesome.CALENDAR_O);
        ICONS.add(FontAwesome.CAMERA);
        ICONS.add(FontAwesome.CAMERA_RETRO);
        ICONS.add(FontAwesome.CAR);
        ICONS.add(FontAwesome.CARET_DOWN);
        ICONS.add(FontAwesome.CARET_LEFT);
        ICONS.add(FontAwesome.CARET_RIGHT);
        ICONS.add(FontAwesome.CARET_SQUARE_O_DOWN);
        ICONS.add(FontAwesome.CARET_SQUARE_O_LEFT);
        ICONS.add(FontAwesome.CARET_SQUARE_O_RIGHT);
        ICONS.add(FontAwesome.CARET_SQUARE_O_UP);
        ICONS.add(FontAwesome.CARET_UP);
        ICONS.add(FontAwesome.CERTIFICATE);
        ICONS.add(FontAwesome.CHAIN);
        ICONS.add(FontAwesome.CHAIN_BROKEN);
        ICONS.add(FontAwesome.CHECK);
        ICONS.add(FontAwesome.CHECK_CIRCLE);
        ICONS.add(FontAwesome.CHECK_CIRCLE_O);
        ICONS.add(FontAwesome.CHECK_SQUARE);
        ICONS.add(FontAwesome.CHECK_SQUARE_O);
        ICONS.add(FontAwesome.CHEVRON_CIRCLE_DOWN);
        ICONS.add(FontAwesome.CHEVRON_CIRCLE_LEFT);
        ICONS.add(FontAwesome.CHEVRON_CIRCLE_RIGHT);
        ICONS.add(FontAwesome.CHEVRON_CIRCLE_UP);
        ICONS.add(FontAwesome.CHEVRON_DOWN);
        ICONS.add(FontAwesome.CHEVRON_LEFT);
        ICONS.add(FontAwesome.CHEVRON_RIGHT);
        ICONS.add(FontAwesome.CHEVRON_UP);
        ICONS.add(FontAwesome.CHILD);
        ICONS.add(FontAwesome.CIRCLE);
        ICONS.add(FontAwesome.CIRCLE_O);
        ICONS.add(FontAwesome.CIRCLE_O_NOTCH);
        ICONS.add(FontAwesome.CIRCLE_THIN);
        ICONS.add(FontAwesome.CLIPBOARD);
        ICONS.add(FontAwesome.CLOCK_O);
        ICONS.add(FontAwesome.CLOUD);
        ICONS.add(FontAwesome.CLOUD_DOWNLOAD);
        ICONS.add(FontAwesome.CLOUD_UPLOAD);
        ICONS.add(FontAwesome.CNY);
        ICONS.add(FontAwesome.CODE);
        ICONS.add(FontAwesome.CODE_FORK);
        ICONS.add(FontAwesome.CODEPEN);
        ICONS.add(FontAwesome.COFFEE);
        ICONS.add(FontAwesome.COG);
        ICONS.add(FontAwesome.COGS);
        ICONS.add(FontAwesome.COLUMNS);
        ICONS.add(FontAwesome.COMMENT);
        ICONS.add(FontAwesome.COMMENT_O);
        ICONS.add(FontAwesome.COMMENTS);
        ICONS.add(FontAwesome.COMMENTS_O);
        ICONS.add(FontAwesome.COMPASS);
        ICONS.add(FontAwesome.COMPRESS);
        ICONS.add(FontAwesome.COPY);
        ICONS.add(FontAwesome.CREDIT_CARD);
        ICONS.add(FontAwesome.CROP);
        ICONS.add(FontAwesome.CROSSHAIRS);
        ICONS.add(FontAwesome.CSS3);
        ICONS.add(FontAwesome.CUBE);
        ICONS.add(FontAwesome.CUBES);
        ICONS.add(FontAwesome.CUT);
        ICONS.add(FontAwesome.CUTLERY);
        ICONS.add(FontAwesome.DASHBOARD);
        ICONS.add(FontAwesome.DATABASE);
        ICONS.add(FontAwesome.DEDENT);
        ICONS.add(FontAwesome.DELICIOUS);
        ICONS.add(FontAwesome.DESKTOP);
        ICONS.add(FontAwesome.DEVIANTART);
        ICONS.add(FontAwesome.DIGG);
        ICONS.add(FontAwesome.DOLLAR);
        ICONS.add(FontAwesome.DOT_CIRCLE_O);
        ICONS.add(FontAwesome.DOWNLOAD);
        ICONS.add(FontAwesome.DRIBBBLE);
        ICONS.add(FontAwesome.DROPBOX);
        ICONS.add(FontAwesome.DRUPAL);
        ICONS.add(FontAwesome.EDIT);
        ICONS.add(FontAwesome.EJECT);
        ICONS.add(FontAwesome.ELLIPSIS_H);
        ICONS.add(FontAwesome.ELLIPSIS_V);
        ICONS.add(FontAwesome.EMPIRE);
        ICONS.add(FontAwesome.ENVELOPE);
        ICONS.add(FontAwesome.ENVELOPE_O);
        ICONS.add(FontAwesome.ENVELOPE_SQUARE);
        ICONS.add(FontAwesome.ERASER);
        ICONS.add(FontAwesome.EUR);
        ICONS.add(FontAwesome.EURO);
        ICONS.add(FontAwesome.EXCHANGE);
        ICONS.add(FontAwesome.EXCLAMATION);
        ICONS.add(FontAwesome.EXCLAMATION_CIRCLE);
        ICONS.add(FontAwesome.EXCLAMATION_TRIANGLE);
        ICONS.add(FontAwesome.EXPAND);
        ICONS.add(FontAwesome.EXTERNAL_LINK);
        ICONS.add(FontAwesome.EXTERNAL_LINK_SQUARE);
        ICONS.add(FontAwesome.EYE);
        ICONS.add(FontAwesome.EYE_SLASH);
        ICONS.add(FontAwesome.FACEBOOK);
        ICONS.add(FontAwesome.FACEBOOK_SQUARE);
        ICONS.add(FontAwesome.FAST_BACKWARD);
        ICONS.add(FontAwesome.FAST_FORWARD);
        ICONS.add(FontAwesome.FAX);
        ICONS.add(FontAwesome.FEMALE);
        ICONS.add(FontAwesome.FIGHTER_JET);
        ICONS.add(FontAwesome.FILE);
        ICONS.add(FontAwesome.FILE_ARCHIVE_O);
        ICONS.add(FontAwesome.FILE_AUDIO_O);
        ICONS.add(FontAwesome.FILE_CODE_O);
        ICONS.add(FontAwesome.FILE_EXCEL_O);
        ICONS.add(FontAwesome.FILE_IMAGE_O);
        ICONS.add(FontAwesome.FILE_MOVIE_O);
        ICONS.add(FontAwesome.FILE_O);
        ICONS.add(FontAwesome.FILE_PDF_O);
        ICONS.add(FontAwesome.FILE_PHOTO_O);
        ICONS.add(FontAwesome.FILE_PICTURE_O);
        ICONS.add(FontAwesome.FILE_POWERPOINT_O);
        ICONS.add(FontAwesome.FILE_SOUND_O);
        ICONS.add(FontAwesome.FILE_TEXT);
        ICONS.add(FontAwesome.FILE_TEXT_O);
        ICONS.add(FontAwesome.FILE_VIDEO_O);
        ICONS.add(FontAwesome.FILE_WORD_O);
        ICONS.add(FontAwesome.FILE_ZIP_O);
        ICONS.add(FontAwesome.FILES_O);
        ICONS.add(FontAwesome.FILM);
        ICONS.add(FontAwesome.FILTER);
        ICONS.add(FontAwesome.FIRE);
        ICONS.add(FontAwesome.FIRE_EXTINGUISHER);
        ICONS.add(FontAwesome.FLAG);
        ICONS.add(FontAwesome.FLAG_CHECKERED);
        ICONS.add(FontAwesome.FLAG_O);
        ICONS.add(FontAwesome.FLASH);
        ICONS.add(FontAwesome.FLASK);
        ICONS.add(FontAwesome.FLICKR);
        ICONS.add(FontAwesome.FLOPPY_O);
        ICONS.add(FontAwesome.FOLDER);
        ICONS.add(FontAwesome.FOLDER_O);
        ICONS.add(FontAwesome.FOLDER_OPEN);
        ICONS.add(FontAwesome.FOLDER_OPEN_O);
        ICONS.add(FontAwesome.FONT);
        ICONS.add(FontAwesome.FORWARD);
        ICONS.add(FontAwesome.FOURSQUARE);
        ICONS.add(FontAwesome.FROWN_O);
        ICONS.add(FontAwesome.GAMEPAD);
        ICONS.add(FontAwesome.GAVEL);
        ICONS.add(FontAwesome.GBP);
        ICONS.add(FontAwesome.GE);
        ICONS.add(FontAwesome.GEAR);
        ICONS.add(FontAwesome.GEARS);
        ICONS.add(FontAwesome.GIFT);
        ICONS.add(FontAwesome.GIT);
        ICONS.add(FontAwesome.GIT_SQUARE);
        ICONS.add(FontAwesome.GITHUB);
        ICONS.add(FontAwesome.GITHUB_ALT);
        ICONS.add(FontAwesome.GITHUB_SQUARE);
        ICONS.add(FontAwesome.GITTIP);
        ICONS.add(FontAwesome.GLASS);
        ICONS.add(FontAwesome.GLOBE);
        ICONS.add(FontAwesome.GOOGLE);
        ICONS.add(FontAwesome.GOOGLE_PLUS);
        ICONS.add(FontAwesome.GOOGLE_PLUS_SQUARE);
        ICONS.add(FontAwesome.GRADUATION_CAP);
        ICONS.add(FontAwesome.GROUP);
        ICONS.add(FontAwesome.H_SQUARE);
        ICONS.add(FontAwesome.HACKER_NEWS);
        ICONS.add(FontAwesome.HAND_O_DOWN);
        ICONS.add(FontAwesome.HAND_O_LEFT);
        ICONS.add(FontAwesome.HAND_O_RIGHT);
        ICONS.add(FontAwesome.HAND_O_UP);
        ICONS.add(FontAwesome.HDD_O);
        ICONS.add(FontAwesome.HEADER);
        ICONS.add(FontAwesome.HEADPHONES);
        ICONS.add(FontAwesome.HEART);
        ICONS.add(FontAwesome.HEART_O);
        ICONS.add(FontAwesome.HISTORY);
        ICONS.add(FontAwesome.HOME);
        ICONS.add(FontAwesome.HOSPITAL_O);
        ICONS.add(FontAwesome.HTML5);
        ICONS.add(FontAwesome.IMAGE);
        ICONS.add(FontAwesome.INBOX);
        ICONS.add(FontAwesome.INDENT);
        ICONS.add(FontAwesome.INFO);
        ICONS.add(FontAwesome.INFO_CIRCLE);
        ICONS.add(FontAwesome.INR);
        ICONS.add(FontAwesome.INSTAGRAM);
        ICONS.add(FontAwesome.INSTITUTION);
        ICONS.add(FontAwesome.ITALIC);
        ICONS.add(FontAwesome.JOOMLA);
        ICONS.add(FontAwesome.JPY);
        ICONS.add(FontAwesome.JSFIDDLE);
        ICONS.add(FontAwesome.KEY);
        ICONS.add(FontAwesome.KEYBOARD_O);
        ICONS.add(FontAwesome.KRW);
        ICONS.add(FontAwesome.LANGUAGE);
        ICONS.add(FontAwesome.LAPTOP);
        ICONS.add(FontAwesome.LEAF);
        ICONS.add(FontAwesome.LEGAL);
        ICONS.add(FontAwesome.LEMON_O);
        ICONS.add(FontAwesome.LEVEL_DOWN);
        ICONS.add(FontAwesome.LEVEL_UP);
        ICONS.add(FontAwesome.LIFE_BOUY);
        ICONS.add(FontAwesome.LIFE_RING);
        ICONS.add(FontAwesome.LIFE_SAVER);
        ICONS.add(FontAwesome.LIGHTBULB_O);
        ICONS.add(FontAwesome.LINK);
        ICONS.add(FontAwesome.LINKEDIN);
        ICONS.add(FontAwesome.LINKEDIN_SQUARE);
        ICONS.add(FontAwesome.LINUX);
        ICONS.add(FontAwesome.LIST);
        ICONS.add(FontAwesome.LIST_ALT);
        ICONS.add(FontAwesome.LIST_OL);
        ICONS.add(FontAwesome.LIST_UL);
        ICONS.add(FontAwesome.LOCATION_ARROW);
        ICONS.add(FontAwesome.LOCK);
        ICONS.add(FontAwesome.LONG_ARROW_DOWN);
        ICONS.add(FontAwesome.LONG_ARROW_LEFT);
        ICONS.add(FontAwesome.LONG_ARROW_RIGHT);
        ICONS.add(FontAwesome.LONG_ARROW_UP);
        ICONS.add(FontAwesome.MAGIC);
        ICONS.add(FontAwesome.MAGNET);
        ICONS.add(FontAwesome.MAIL_FORWARD);
        ICONS.add(FontAwesome.MAIL_REPLY);
        ICONS.add(FontAwesome.MAIL_REPLY_ALL);
        ICONS.add(FontAwesome.MALE);
        ICONS.add(FontAwesome.MAP_MARKER);
        ICONS.add(FontAwesome.MAXCDN);
        ICONS.add(FontAwesome.MEDKIT);
        ICONS.add(FontAwesome.MEH_O);
        ICONS.add(FontAwesome.MICROPHONE);
        ICONS.add(FontAwesome.MICROPHONE_SLASH);
        ICONS.add(FontAwesome.MINUS);
        ICONS.add(FontAwesome.MINUS_CIRCLE);
        ICONS.add(FontAwesome.MINUS_SQUARE);
        ICONS.add(FontAwesome.MINUS_SQUARE_O);
        ICONS.add(FontAwesome.MOBILE);
        ICONS.add(FontAwesome.MOBILE_PHONE);
        ICONS.add(FontAwesome.MONEY);
        ICONS.add(FontAwesome.MOON_O);
        ICONS.add(FontAwesome.MORTAR_BOARD);
        ICONS.add(FontAwesome.MUSIC);
        ICONS.add(FontAwesome.NAVICON);
        ICONS.add(FontAwesome.OPENID);
        ICONS.add(FontAwesome.OUTDENT);
        ICONS.add(FontAwesome.PAGELINES);
        ICONS.add(FontAwesome.PAPER_PLANE);
        ICONS.add(FontAwesome.PAPER_PLANE_O);
        ICONS.add(FontAwesome.PAPERCLIP);
        ICONS.add(FontAwesome.PARAGRAPH);
        ICONS.add(FontAwesome.PASTE);
        ICONS.add(FontAwesome.PAUSE);
        ICONS.add(FontAwesome.PAW);
        ICONS.add(FontAwesome.PENCIL);
        ICONS.add(FontAwesome.PENCIL_SQUARE);
        ICONS.add(FontAwesome.PENCIL_SQUARE_O);
        ICONS.add(FontAwesome.PHONE);
        ICONS.add(FontAwesome.PHONE_SQUARE);
        ICONS.add(FontAwesome.PHOTO);
        ICONS.add(FontAwesome.PICTURE_O);
        ICONS.add(FontAwesome.PIED_PIPER);
        ICONS.add(FontAwesome.PIED_PIPER_ALT);
        ICONS.add(FontAwesome.PIED_PIPER);
        ICONS.add(FontAwesome.PINTEREST);
        ICONS.add(FontAwesome.PINTEREST_SQUARE);
        ICONS.add(FontAwesome.PLANE);
        ICONS.add(FontAwesome.PLAY);
        ICONS.add(FontAwesome.PLAY_CIRCLE);
        ICONS.add(FontAwesome.PLAY_CIRCLE_O);
        ICONS.add(FontAwesome.PLUS);
        ICONS.add(FontAwesome.PLUS_CIRCLE);
        ICONS.add(FontAwesome.PLUS_SQUARE);
        ICONS.add(FontAwesome.PLUS_SQUARE_O);
        ICONS.add(FontAwesome.POWER_OFF);
        ICONS.add(FontAwesome.PRINT);
        ICONS.add(FontAwesome.PUZZLE_PIECE);
        ICONS.add(FontAwesome.QQ);
        ICONS.add(FontAwesome.QRCODE);
        ICONS.add(FontAwesome.QUESTION);
        ICONS.add(FontAwesome.QUESTION_CIRCLE);
        ICONS.add(FontAwesome.QUOTE_LEFT);
        ICONS.add(FontAwesome.QUOTE_RIGHT);
        ICONS.add(FontAwesome.RA);
        ICONS.add(FontAwesome.RANDOM);
        ICONS.add(FontAwesome.REBEL);
        ICONS.add(FontAwesome.RECYCLE);
        ICONS.add(FontAwesome.REDDIT);
        ICONS.add(FontAwesome.REDDIT_SQUARE);
        ICONS.add(FontAwesome.REFRESH);
        ICONS.add(FontAwesome.RENREN);
        ICONS.add(FontAwesome.REORDER);
        ICONS.add(FontAwesome.REPEAT);
        ICONS.add(FontAwesome.REPLY);
        ICONS.add(FontAwesome.REPLY_ALL);
        ICONS.add(FontAwesome.RETWEET);
        ICONS.add(FontAwesome.RMB);
        ICONS.add(FontAwesome.ROAD);
        ICONS.add(FontAwesome.ROCKET);
        ICONS.add(FontAwesome.ROTATE_LEFT);
        ICONS.add(FontAwesome.ROTATE_RIGHT);
        ICONS.add(FontAwesome.ROUBLE);
        ICONS.add(FontAwesome.RSS);
        ICONS.add(FontAwesome.RSS_SQUARE);
        ICONS.add(FontAwesome.RUB);
        ICONS.add(FontAwesome.RUBLE);
        ICONS.add(FontAwesome.RUPEE);
        ICONS.add(FontAwesome.SAVE);
        ICONS.add(FontAwesome.SCISSORS);
        ICONS.add(FontAwesome.SEARCH);
        ICONS.add(FontAwesome.SEARCH_MINUS);
        ICONS.add(FontAwesome.SEARCH_PLUS);
        ICONS.add(FontAwesome.SEND);
        ICONS.add(FontAwesome.SEND_O);
        ICONS.add(FontAwesome.SHARE);
        ICONS.add(FontAwesome.SHARE_ALT);
        ICONS.add(FontAwesome.SHARE_ALT_SQUARE);
        ICONS.add(FontAwesome.SHARE_SQUARE);
        ICONS.add(FontAwesome.SHARE_SQUARE_O);
        ICONS.add(FontAwesome.SHIELD);
        ICONS.add(FontAwesome.SHOPPING_CART);
        ICONS.add(FontAwesome.SIGN_IN);
        ICONS.add(FontAwesome.SIGN_OUT);
        ICONS.add(FontAwesome.SIGNAL);
        ICONS.add(FontAwesome.SITEMAP);
        ICONS.add(FontAwesome.SKYPE);
        ICONS.add(FontAwesome.SLACK);
        ICONS.add(FontAwesome.SLIDERS);
        ICONS.add(FontAwesome.SMILE_O);
        ICONS.add(FontAwesome.SORT);
        ICONS.add(FontAwesome.SORT_ALPHA_ASC);
        ICONS.add(FontAwesome.SORT_ALPHA_DESC);
        ICONS.add(FontAwesome.SORT_AMOUNT_ASC);
        ICONS.add(FontAwesome.SORT_AMOUNT_DESC);
        ICONS.add(FontAwesome.SORT_ASC);
        ICONS.add(FontAwesome.SORT_DESC);
        ICONS.add(FontAwesome.SORT_DOWN);
        ICONS.add(FontAwesome.SORT_NUMERIC_ASC);
        ICONS.add(FontAwesome.SORT_NUMERIC_DESC);
        ICONS.add(FontAwesome.SORT_UP);
        ICONS.add(FontAwesome.SOUNDCLOUD);
        ICONS.add(FontAwesome.SPACE_SHUTTLE);
        ICONS.add(FontAwesome.SPINNER);
        ICONS.add(FontAwesome.SPOON);
        ICONS.add(FontAwesome.SPOTIFY);
        ICONS.add(FontAwesome.SQUARE);
        ICONS.add(FontAwesome.SQUARE_O);
        ICONS.add(FontAwesome.STACK_EXCHANGE);
        ICONS.add(FontAwesome.STACK_OVERFLOW);
        ICONS.add(FontAwesome.STAR);
        ICONS.add(FontAwesome.STAR_HALF);
        ICONS.add(FontAwesome.STAR_HALF_EMPTY);
        ICONS.add(FontAwesome.STAR_HALF_FULL);
        ICONS.add(FontAwesome.STAR_HALF_O);
        ICONS.add(FontAwesome.STAR_O);
        ICONS.add(FontAwesome.STEAM);
        ICONS.add(FontAwesome.STEAM_SQUARE);
        ICONS.add(FontAwesome.STEP_BACKWARD);
        ICONS.add(FontAwesome.STEP_FORWARD);
        ICONS.add(FontAwesome.STETHOSCOPE);
        ICONS.add(FontAwesome.STOP);
        ICONS.add(FontAwesome.STRIKETHROUGH);
        ICONS.add(FontAwesome.STUMBLEUPON);
        ICONS.add(FontAwesome.STUMBLEUPON_CIRCLE);
        ICONS.add(FontAwesome.SUBSCRIPT);
        ICONS.add(FontAwesome.SUITCASE);
        ICONS.add(FontAwesome.SUN_O);
        ICONS.add(FontAwesome.SUPERSCRIPT);
        ICONS.add(FontAwesome.SUPPORT);
        ICONS.add(FontAwesome.TABLE);
        ICONS.add(FontAwesome.TABLET);
        ICONS.add(FontAwesome.TACHOMETER);
        ICONS.add(FontAwesome.TAG);
        ICONS.add(FontAwesome.TAGS);
        ICONS.add(FontAwesome.TASKS);
        ICONS.add(FontAwesome.TAXI);
        ICONS.add(FontAwesome.TENCENT_WEIBO);
        ICONS.add(FontAwesome.TERMINAL);
        ICONS.add(FontAwesome.TEXT_HEIGHT);
        ICONS.add(FontAwesome.TEXT_WIDTH);
        ICONS.add(FontAwesome.TH);
        ICONS.add(FontAwesome.TH_LARGE);
        ICONS.add(FontAwesome.TH_LIST);
        ICONS.add(FontAwesome.THUMB_TACK);
        ICONS.add(FontAwesome.THUMBS_DOWN);
        ICONS.add(FontAwesome.THUMBS_O_DOWN);
        ICONS.add(FontAwesome.THUMBS_O_UP);
        ICONS.add(FontAwesome.THUMBS_UP);
        ICONS.add(FontAwesome.TICKET);
        ICONS.add(FontAwesome.TIMES);
        ICONS.add(FontAwesome.TIMES_CIRCLE);
        ICONS.add(FontAwesome.TIMES_CIRCLE_O);
        ICONS.add(FontAwesome.TINT);
        ICONS.add(FontAwesome.TOGGLE_DOWN);
        ICONS.add(FontAwesome.TOGGLE_LEFT);
        ICONS.add(FontAwesome.TOGGLE_RIGHT);
        ICONS.add(FontAwesome.TOGGLE_UP);
        ICONS.add(FontAwesome.TRASH_O);
        ICONS.add(FontAwesome.TREE);
        ICONS.add(FontAwesome.TRELLO);
        ICONS.add(FontAwesome.TROPHY);
        ICONS.add(FontAwesome.TRUCK);
        ICONS.add(FontAwesome.TRY);
        ICONS.add(FontAwesome.TUMBLR);
        ICONS.add(FontAwesome.TUMBLR_SQUARE);
        ICONS.add(FontAwesome.TURKISH_LIRA);
        ICONS.add(FontAwesome.TWITTER);
        ICONS.add(FontAwesome.TWITTER_SQUARE);
        ICONS.add(FontAwesome.UMBRELLA);
        ICONS.add(FontAwesome.UNDERLINE);
        ICONS.add(FontAwesome.UNDO);
        ICONS.add(FontAwesome.UNIVERSITY);
        ICONS.add(FontAwesome.UNLINK);
        ICONS.add(FontAwesome.UNLOCK);
        ICONS.add(FontAwesome.UNLOCK_ALT);
        ICONS.add(FontAwesome.UNSORTED);
        ICONS.add(FontAwesome.UPLOAD);
        ICONS.add(FontAwesome.USD);
        ICONS.add(FontAwesome.USER);
        ICONS.add(FontAwesome.USER_MD);
        ICONS.add(FontAwesome.USERS);
        ICONS.add(FontAwesome.VIDEO_CAMERA);
        ICONS.add(FontAwesome.VIMEO_SQUARE);
        ICONS.add(FontAwesome.VINE);
        ICONS.add(FontAwesome.VK);
        ICONS.add(FontAwesome.VOLUME_DOWN);
        ICONS.add(FontAwesome.VOLUME_OFF);
        ICONS.add(FontAwesome.VOLUME_UP);
        ICONS.add(FontAwesome.WARNING);
        ICONS.add(FontAwesome.WECHAT);
        ICONS.add(FontAwesome.WEIBO);
        ICONS.add(FontAwesome.WEIXIN);
        ICONS.add(FontAwesome.WHEELCHAIR);
        ICONS.add(FontAwesome.WINDOWS);
        ICONS.add(FontAwesome.WON);
        ICONS.add(FontAwesome.WORDPRESS);
        ICONS.add(FontAwesome.WRENCH);
        ICONS.add(FontAwesome.XING);
        ICONS.add(FontAwesome.XING_SQUARE);
        ICONS.add(FontAwesome.YAHOO);
        ICONS.add(FontAwesome.YEN);
        ICONS.add(FontAwesome.YOUTUBE);
        ICONS.add(FontAwesome.YOUTUBE_PLAY);
        ICONS.add(FontAwesome.YOUTUBE_SQUARE);
    }
}
