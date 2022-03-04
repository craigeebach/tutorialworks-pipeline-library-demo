import com.cleverbuilder.GlobalVars

def call(Map config=[:]) {
    if (config.type == "slack") {
        echo GlobalVars.SLACK_MESSAGE
        echo config.message
    } else {
        echo GlobalVars.EMAIL_MESSAGE
        echo config.message
    }
}
