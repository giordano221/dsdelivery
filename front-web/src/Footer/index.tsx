import './styles.css';
import {ReactComponent as YoutubeIcon} from './youtube.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';
import {ReactComponent as LinkdinIcon} from './linkedin.svg';
function Footer(){
    return(
        <footer className="main-footer">
            App desenvolvido por Giordano M Galdino - FullStack Sistemas

            <div className="footer-icons">
                
                <a href="/" target="_new">
                    <YoutubeIcon/>
                </a>

                <a href="/" target="_new">
                    <LinkdinIcon/>
                </a>

                <a href="/" target="_new">
                    <InstagramIcon/>
                </a>

            </div>

        </footer>
    )
}

export default Footer;