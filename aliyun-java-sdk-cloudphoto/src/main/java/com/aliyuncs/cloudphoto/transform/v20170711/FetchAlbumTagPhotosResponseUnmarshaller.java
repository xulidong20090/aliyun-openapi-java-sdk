/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.FetchAlbumTagPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.FetchAlbumTagPhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchAlbumTagPhotosResponseUnmarshaller {

	public static FetchAlbumTagPhotosResponse unmarshall(FetchAlbumTagPhotosResponse fetchAlbumTagPhotosResponse, UnmarshallerContext context) {
		
		fetchAlbumTagPhotosResponse.setRequestId(context.stringValue("FetchAlbumTagPhotosResponse.RequestId"));
		fetchAlbumTagPhotosResponse.setCode(context.stringValue("FetchAlbumTagPhotosResponse.Code"));
		fetchAlbumTagPhotosResponse.setMessage(context.stringValue("FetchAlbumTagPhotosResponse.Message"));
		fetchAlbumTagPhotosResponse.setTotalCount(context.integerValue("FetchAlbumTagPhotosResponse.TotalCount"));
		fetchAlbumTagPhotosResponse.setAction(context.stringValue("FetchAlbumTagPhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("FetchAlbumTagPhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setPhotoId(context.longValue("FetchAlbumTagPhotosResponse.Results["+ i +"].PhotoId"));
			result.setPhotoIdStr(context.stringValue("FetchAlbumTagPhotosResponse.Results["+ i +"].PhotoIdStr"));
			result.setMtime(context.longValue("FetchAlbumTagPhotosResponse.Results["+ i +"].Mtime"));
			result.setState(context.stringValue("FetchAlbumTagPhotosResponse.Results["+ i +"].State"));

			results.add(result);
		}
		fetchAlbumTagPhotosResponse.setResults(results);
	 
	 	return fetchAlbumTagPhotosResponse;
	}
}