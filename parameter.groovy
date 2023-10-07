parameters {
        extendedChoice(description: '', multiSelectDelimiter: ',', name: 'subsidiary', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'SCB,SCB Plus,SCBPT,SCBAM,SCBS,SCBJBTH,SCBJBSG,PPV-Purple Venture,Tech X,Card X,MONIX,ABACUS,SCBTC,MHS (Mahitsorn),RAMC,SCB Myanmar,CCB,SCB10X,Digital Venture,Buzz,SCB Leasing,SCB LIFE ,TOKEN X ,SCB FOUNDATION', visibleItemCount: 24)
        string(defaultValue: 'P12345-05' , description: '***REQUIRE_FIELD*** - if no, please contact your IT project manager ', name: 'URnumber')
        string(defaultValue: 'SAT2020_00161' , description: '***REQUIRE_FIELD*** In case project doesn\'t have SAT ticket please contact: SATteam@scb.co.th example: SAT20xx_00000 ', name: 'SATticket')
        string(defaultValue: 'MockupRA' , description: '***REQUIRE_FIELD*** **Avoid using space and special characters only allow - and _**  example: devsecops', name: 'projectName')
        string(defaultValue: 'MockupRA-master' , description: '***REQUIRE_FIELD*** **Avoid using space and special characters only allow - and _** example: Jan2020', name: 'release')
        string(defaultValue: 'pakawoot@mfec.co.th' , description: '***REQUIRE_FIELD*** Recipient: usage separate by ,', name: 'email')
        text defaultValue: '''git@gitdop.se.scb.co.th:s89346/dso-spring.git;noLibrary
        git@gitdop.se.scb.co.th:s89346/dso-spring.git;master''', description: '***REQUIRE_FIELD*** Support only git ssh. Insert multiple git by newline. example: git@gitdop.se.scb.co.th:project/microservice.git;branch', name: 'gitURL'  
        extendedChoice(description: '', multiSelectDelimiter: ',', name: 'devOpsEnv', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'gitdop, easy2easiest', visibleItemCount: 2)
        extendedChoice(description: '', multiSelectDelimiter: ',', name: 'toolSelector', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'Coverity, None', visibleItemCount: 3)
        extendedChoice(description: 'A : Little or no appropriate Security control available\nB : Appropriate Security controls available such as Firewall Rules, WAF, EDR etc.', multiSelectDelimiter: ',', name: 'availAbility', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'A, B', visibleItemCount: 2)
        extendedChoice(description: 'Low : App Level 3,4 Internal Zone\nMedium : App Level 1, 2 Internal Zone\nHigh : Internet facing App(Every App Level), Special App : MAS, TRM, PCI/DSS, Biometrics, SWIFT, App which related to CII ', multiSelectDelimiter: ',', name: 'assetImportance', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'LOW, Medium,HIGH', visibleItemCount: 3)
        extendedChoice(description: '', multiSelectDelimiter: ',', name: 'blackduckEnv', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'brixton,streatham', visibleItemCount: 2)
        extendedChoice(description: '', multiSelectDelimiter: ',', name: 'harborEnv', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', value: 'harbordev.se.scb.co.th, harbordev-az.se.scb.co.th, robinhood-ecr-non-prd, robinhood-ecr-prd', visibleItemCount: 4)
        text defaultValue: '', description: 'Multiple images scan is available separate by enter', name: 'imageName'
        //string(defaultValue: 'devsecops_poc/dso-spring:latest,devsecops_poc/dso-spring:latest' , description: 'Image name for aquasec. Multiple images scan is available. Images: usage separate by ,', name: 'imageName')
        booleanParam defaultValue: false, description: '', name: 'exception'    
        booleanParam defaultValue: true, description: '', name: 'scanBD'    
        text defaultValue: '', description: 'Reason for request exception build', name: 'reason'
    }
