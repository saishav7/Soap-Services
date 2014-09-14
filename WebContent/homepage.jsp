<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Market Data Services</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/imgeffect.css" />
<script src="js/jquery.min.js"></script>
<!-- start gallery Script -->
	<script type="text/javascript" src="js/jquery.easing.min.js"></script>	
	<script type="text/javascript" src="js/jquery.mixitup.min.js"></script>
				<script type="text/javascript">
				$(function () {
					
					var filterList = {
					
						init: function () {
						
							// MixItUp plugin
							// http://mixitup.io
							$('#portfoliolist').mixitup({
								targetSelector: '.portfolio',
								filterSelector: '.filter',
								effects: ['fade'],
								easing: 'snap',
								// call the hover effect
								onMixEnd: filterList.hoverEffect()
							});				
						
						},
						
						hoverEffect: function () {
						
							// Simple parallax effect
							$('#portfoliolist .portfolio').hover(
								function () {
									$(this).find('.label').stop().animate({bottom: 0}, 200, 'easeOutQuad');
									$(this).find('img').stop().animate({top: 0}, 500, 'easeOutQuad');				
								},
								function () {
									$(this).find('.label').stop().animate({bottom: 0}, 200, 'easeInQuad');
									$(this).find('img').stop().animate({top: 0}, 300, 'easeOutQuad');								
								}		
							);				
						
						}
			
					};
					
					// Run the show!
					filterList.init();
					
					
				});	
				</script>
				<!-- Add fancyBox main JS and CSS files -->
				<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
				<link href="css/magnific-popup.css" rel="stylesheet" type="text/css">
						<script>
							$(document).ready(function() {
								$('.popup-with-zoom-anim').magnificPopup({
									type: 'inline',
									fixedContentPos: false,
									fixedBgPos: true,
									overflowY: 'auto',
									closeBtnInside: true,
									preloader: false,
									midClick: true,
									removalDelay: 300,
									mainClass: 'my-mfp-zoom-in'
							});
						});
						</script>
				<script type="text/javascript" src="js/move-top.js"></script>
				<script type="text/javascript" src="js/easing.js"></script>
				<!----end gallery----------->
				
		   	<script type="text/javascript">
				jQuery(document).ready(function($) {
					$(".scroll").click(function(event){		
						event.preventDefault();
						$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
					});
				});
			</script>
</head>

<body>
		<!----start-header----------->
				<div class="header_bg">
					<div class="wrap">
						<div class="header">
							<!--------start-logo------>
						
							<!--------end-logo--------->
							<!----start-nav-------->	
							<div class="nav">
								<ul>
								   <li class="active"><a href="#home" class="scroll">Home</a></li>
								   <li><a href="#import" class="scroll">Import And Download</a></li>
								   <li><a href="#summary" class="scroll">Data Summary</a></li>
								   <li><a href="#currency" class="scroll">Currency Converter</a></li>
								 <div class="clear"> </div>
								 </ul>
							</div>
							<!-----end-nav-------->
							<div class="clear"> </div>
						</div>
					</div>
				</div>
		<!------end-header------------>
		<!-- start slider -->
<div class="slider_bg">
		<div class="wrap">
				<!---start-da-slider----->
						<div class="da-slide">
								<h2><span>Market Data</span>Services</h2>
									<p>We offer market-data related web services for customers </p>
									<a href="#" class="da-link">Learnmore</a>
									<p>Click on the arrow below and try the Demo now!</p>
									<a href="#import" class="scroll"><span class="da-img"> </span> </a>
								</div>
				<!---//End-da-slider----->
		</div>
</div>
<!-----end-slider-------->
<!--start ImportDownload------>
	<div class="wrap" id="import">
				<div class="main">
					<!-- start galle -->
							<div class="gallery1">
					<!--start-mfp -->	
						<div id="paramsInfo" class="mfp-hide">
							<div class="pop_up">
							<p class="para">Following are the parameters involved in the web services:-</p>
							<table cellspacing="10">
								<thead>
								<tr>
									<th>NAME</th>
									<th>TYPE</th>
									<th>DESCRIPTION</th>
									<th>EXAMPLE</th>
								</tr>
								</thead>
								<tbody>
								<tr>
									<td>sec</td>
									<td>String</td>
									<td>The security code of the financial instrument (i.e., stock). 
										All data rows in the Market Data file having a security code that 
										matches this parameter should be included in the output Market Data file.</td>
									<td>WSSS, ZXQ</td>
								</tr>
								<tr>
									<td>startDate</td>
									<td>dateTime</td>
									<td>The earliest timestamp (i.e., the first line) in the Market Data file associated with the eventSetID. 
										Rows that have a timestamp on or after (i.e., inclusive) this parameter 
										and also satisfy the condition for endDate, are included in the output Market Data file</td>
									<td>2002-04-08T16:59:00.000 (yyyy-MM-ddTHH:mm:ss.SSS)</td>
								</tr>
								<tr>
									<td>endDate</td>
									<td>dateTime</td>
									<td>The latest timestamp (i.e., the last line) in the Market Data file associated with the eventSetID. 
										Rows that have a timestamp on or before (i.e., inclusive) this parameter and also satisfy the 
										condition for startDate, are included in the output Market Data file</td>
									<td>2002-04-09T17:48:00.000 (yyyy-MM-ddTHH:mm:ss.SSS)</td>
								</tr>
								<tr>
									<td>dataSource</td>
									<td>anyURI</td>
									<td>This is a http:// URL that points to the input Market Data file. It is the location of the input file for performing the service on.</td>
									<td>http://adage.cse.unsw.edu.au:8080/MarketData03.csv</td>
								</tr>
								<tr>
									<td>eventSetId</td>
									<td>String</td>
									<td>A reference that refers to the output Market Data file (also called an event set: 
										because it stores an ordered set of events). It is a number between 1-1000000</td>
									<td>12345, 3456678</td>
								</tr>
								<tr>
									<td>targetCurrency</td>
									<td>String</td>
									<td>It is the currency to which the market-data file is to be converted</td>
									<td>USD, JPY, INR, AUD</td>
								</tr>
								</tbody>
							</table>
							</div>
						</div>
						<div id="errorCodes" class="mfp-hide">
							<div class="pop_up">
							<p class="para">Following are the errors that might occour:-</p>
							<table cellspacing="10">
								<thead>
								<tr>
									<th>CODE</th>
									<th>DESCRIPTION</th>
								</tr>
								</thead>
								<tbody>
								<tr>
									<td>InvalidEventSetId</td>
									<td>The event set id entered is incorrect. This 
										could possibly be because a file corresponding to the
										entered eventSetId does not exist.</td>
								</tr>
								<tr>
									<td>InvalidURL</td>
									<td>The URL entered is incorrect. This 
										could possibly be because a file corresponding to the
										entered URL does not exist or does not contain a valid file.</td>
								</tr>
								<tr>
									<td>InvalidSECCode</td>
									<td>This error code implies that the SEC code entered does not match
										with the SEC code provided in the data file.</td>
								</tr>
								<tr>
									<td>InvalidTargetCurrency</td>
									<td>The target currency can only be a three letter code(GPB, JPY, AUD etc)from the list of world currencies.
										This code implies that the target currency code is not valid, hence
										the service cannot convert values to this currency type.</td>
								</tr>
								<tr>
									<td>PriceAlreadyConverted</td>
									<td>This code implies that the prices in the data file are already in the targetted currency format.
										Please choose another target currency, to test this service.</td>
								</tr>
								<tr>
									<td>ProgramError</td>
									<td>This error arises when there is an issue with the service such as http request errors.</td>
								</tr>
								</tbody>
							</table>
							</div>
						</div>
					<!--end-mfp -->	
			<!---start-content----->
			<div class="gallery">
					<div class="clear"> </div>
					<div class="container">
					<div class="contact-form">
						<h2>Import and Download</h2>
						<p>
						This service enables customers to import market-data files, which is done by
						filtering the data file using four parameters namely <b>sec</b>, <b>startDate</b>, 
						<b>endDate</b> and <b>dataSourceURL</b>. On clicking submit, the output file will be created
						and an <b>eventSetId</b> will be generated, which is essentially a reference to the required file.
						The file call be downloaded by clicking on the download button.
						</p>
						<div id="portfoliolist">
						<div class="portfolio-wrapper">	
						<p><a href="http://localhost:8080/axis2/services/ImportDownloadServices?wsdl" target="_blank">LINK TO WSDL</a></p>
						<p><a class="popup-with-zoom-anim" href="#paramsInfo">Click here</a> for more details about the parameters used.</p>
						<p><a class="popup-with-zoom-anim" href="#errorCodes">Error Codes</a></p>
							<div class="clear"> </div>
							<form method="post" action="#">
						    	<input type="text" class="textbox" value="sec" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Sec';}">
							   	<input type="text" class="textbox" value="startDate" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Start Date';}">
							   	<input type="text" class="textbox" value="endDate" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter End Date';}">
							   	<input type="text" class="textbox" value="dataSourceURL" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Data Source URL';}">
							   	<input type="submit" class="" value="Submit">
							</form>
						</div>
						<div class="clear"> </div>
						<div class="contact-form">
						<div class="clear"> </div>
							<form method="post" action="#">
								<input type="text" class="textbox" value="eventSetId" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Event Set Id';}">
							   	<input type="submit" class="" value="Download">
							</form>
						</div>
						</div>
						</div>
	</div><!-- container -->
	<script type="text/javascript" src="js/fliplightbox.min.js"></script>
	<script type="text/javascript">$('body').flipLightBox()</script>
	<div class="clear"> </div>
	</div>
	</div>
	</div>
</div>
<!---End-ImportDownload----->
<!--Start Summary------>
	<div class="wrap" id="summary">
				<div class="main">
					<!-- start galle -->
							<div class="gallery1">
			<!---start-content----->
			<div class="gallery">
					<div class="clear"> </div>
					<div class="container">
					<div class="contact-form">
						<h2 style="color:#fff;">Market Data Summary</h2>
						<p style="color:#fff;">
						This service allows customers to get details of a market-data file. It expects
						an <b>eventTypeId</b> as input and gives the details of the file which includes <b>eventSetId</b>,
						 <b>startDate</b>, <b>endDate</b>, <b>marketType</b>, <b>currencyCode</b> and <b>fileSize</b>.
						</p>
						<div id="portfoliolist">
						<div class="portfolio-wrapper">	
						<p style="color:#fff;"><a href="http://localhost:8080/axis2/services/SummaryMarketDataService?wsdl" target="_blank">LINK TO WSDL</a></p>
						<p style="color:#fff;"><a class="popup-with-zoom-anim" href="#paramsInfo">Click here</a> for more details about the parameters used.</p>
						<p style="color:#fff;"><a class="popup-with-zoom-anim" href="#errorCodes">Error Codes</a></p>
						<div class="clear"> </div>
							<form method="post" action="#">
						    	<input type="text" class="textbox" value="eventSetId" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Event Set Id';}">
							   	<input type="submit" class="" value="Submit">
							   	<div class="clear"> </div>
							</form>
						</div>
						<div class="contact-form">
						<div class="clear"> </div>
							<h3>OUTPUT </h3>
							<h3 style="color:#fff;">eventSetId: </h3>
							<h3 style="color:#fff;">startDate: </h3>
							<h3 style="color:#fff;">endDate: </h3>
							<h3 style="color:#fff;">marketType: </h3>
							<h3 style="color:#fff;">currencyCode: </h3>
							<h3 style="color:#fff;">fileSize: </h3>
						</div>
	</div><!-- container -->
	<script type="text/javascript" src="js/fliplightbox.min.js"></script>
	<script type="text/javascript">$('body').flipLightBox()</script>
	</div>
	</div>
	</div>
	</div>
	</div>
</div>
<!---End-Summary----->
<!---Start-Currency----->
<div class="wrap" id="currency">
			<div class="main">
					<!-- start galle -->
							<div class="gallery1">
			<!---start-content----->
			<div class="gallery">
					<div class="clear"> </div>
					<div class="container">
					<div class="contact-form">
						<h2>Currency Converter</h2>
						<p>
						This services allows customers to convert the currency of the market-data files to
						the desired type(USD, GBP, EUR etc). Note that the default currency is AUD. If the input file
						does not have any currency prefix (e.g. USD14.45), the service will consider the prices to be in AUD.
						The service creates a new file containing the converted currency values. An <b>eventSetId</b>
						is returned, which is a reference to the output file. The output file changes the currency to the target currency
						for the columns Price, Bid Price and Ask Price respectively.
						
						</p>
						<div id="portfoliolist">
						<div class="portfolio-wrapper">	
						<p><a href="http://localhost:8080/axis2/services/CurrencyConvertServices?wsdl" target="_blank">LINK TO WSDL</a></p>
						<p><a class="popup-with-zoom-anim" href="#paramsInfo">Click here</a> for more details about the parameters used.</p>
						<p><a class="popup-with-zoom-anim" href="#errorCodes">Error Codes</a></p>
						<div class="clear"> </div>
							<form method="get">
						    	<input type="text" class="textbox" name="eventSetId" value="eventSetId" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Event Set Id';}">
							   	<input type="text" class="textbox" name="targetCurrency" value="targetCurrency" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Target Currency';}">
							    <input type="hidden" name="currencyService" value="true">
							   	<input type="submit" class="" value="Submit">
							</form>
						</div>
						<div class="clear"> </div>
						<div class="contact-form">
						<div class="clear"> </div>
							<h3>OUTPUT </h3>
							<h3>${outputEventSetId}</h3>
						</div>
	</div><!-- container -->
	<script type="text/javascript" src="js/fliplightbox.min.js"></script>
	<script type="text/javascript">$('body').flipLightBox()</script>
	<div class="clear"> </div>
	</div>
	</div>
	</div>
</div>
<!---End-Currency----->
     <div class="footer-bottom">
     	<div class="wrap">
     	<div class="copy">
		    <p class="copy"> <a>By: Hariharen Veerakumar and Saishav Agarwal</a> </p>
		</div>
		<script type="text/javascript">
							$(document).ready(function() {
								
								var defaults = {
						  			containerID: 'toTop', // fading element id
									containerHoverID: 'toTopHover', // fading element hover id
									scrollSpeed: 1200,
									easingType: 'linear' 
						 		};
								
								
								$().UItoTop({ easingType: 'easeOutQuart' });
								
							});
						</script>
		 <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"> </span></a>
		 <script src="js/jquery.scrollTo.js"></script>
		</div>
	</div>
</body>
</html>