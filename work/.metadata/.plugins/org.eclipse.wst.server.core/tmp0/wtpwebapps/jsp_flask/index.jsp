<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<style>
		#box{
			width: 400px;
			height: 200px;
			border: 1px solid black;
		}
	</style>
</head>
<body>
	<div id='wrap'>
		<header>
			<h1>Flask 연동 연습</h1>
		</header>
		<article>
			<div>
				<button type='button' id='btn'> call flask</button>
			</div>
			<div id='box'></div>
		</article>
		
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script>
	$(function(){
		$( '#btn' ).bind( 'click', function(){
			$.ajax({
				url : 'http://localhost:5000/t2',
				type: 'get',
				
			}).done( function( res ){
				$( '#box' ).html( res );
			});
		});
	});
	</script>
</body>
</html>