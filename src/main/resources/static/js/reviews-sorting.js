/**
 * Created by ggere on 08.11.2017.
 */
function sortReviews(type) {
	$.ajax({
		url: '/sorting-reviews?sorting=' + type
	}).then(function (data) {
		$('.reviews').html(data)
	})
}
sortReviews('newest')