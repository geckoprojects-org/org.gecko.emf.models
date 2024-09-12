/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.kml;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractColorStyleGroup <em>Abstract Color Style Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractSubStyleGroup <em>Abstract Sub Style Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractObjectGroup <em>Abstract Object Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractColorStyleObjectExtensionGroup <em>Abstract Color Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractColorStyleSimpleExtensionGroup <em>Abstract Color Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractContainerGroup <em>Abstract Container Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractContainerObjectExtensionGroup <em>Abstract Container Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractContainerSimpleExtensionGroup <em>Abstract Container Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractFeatureObjectExtensionGroup <em>Abstract Feature Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractFeatureSimpleExtensionGroup <em>Abstract Feature Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractGeometryObjectExtensionGroup <em>Abstract Geometry Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractGeometrySimpleExtensionGroup <em>Abstract Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractLatLonBoxObjectExtensionGroup <em>Abstract Lat Lon Box Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractLatLonBoxSimpleExtensionGroup <em>Abstract Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractOverlayGroup <em>Abstract Overlay Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractOverlayObjectExtensionGroup <em>Abstract Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractOverlaySimpleExtensionGroup <em>Abstract Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractStyleSelectorObjectExtensionGroup <em>Abstract Style Selector Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractStyleSelectorSimpleExtensionGroup <em>Abstract Style Selector Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractSubStyleObjectExtensionGroup <em>Abstract Sub Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractSubStyleSimpleExtensionGroup <em>Abstract Sub Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveObjectExtensionGroup <em>Abstract Time Primitive Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveSimpleExtensionGroup <em>Abstract Time Primitive Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractViewGroup <em>Abstract View Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractViewObjectExtensionGroup <em>Abstract View Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAbstractViewSimpleExtensionGroup <em>Abstract View Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAliasObjectExtensionGroup <em>Alias Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAliasSimpleExtensionGroup <em>Alias Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBalloonStyleObjectExtensionGroup <em>Balloon Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBalloonStyleSimpleExtensionGroup <em>Balloon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBasicLinkObjectExtensionGroup <em>Basic Link Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBasicLinkSimpleExtensionGroup <em>Basic Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBottomFov <em>Bottom Fov</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBoundaryObjectExtensionGroup <em>Boundary Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getBoundarySimpleExtensionGroup <em>Boundary Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getCamera <em>Camera</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getCameraObjectExtensionGroup <em>Camera Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getCameraSimpleExtensionGroup <em>Camera Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getChange <em>Change</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getCookie <em>Cookie</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getCreate <em>Create</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getData <em>Data</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDataExtension <em>Data Extension</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDelete <em>Delete</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDocument <em>Document</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDocumentObjectExtensionGroup <em>Document Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDocumentSimpleExtensionGroup <em>Document Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getDrawOrder <em>Draw Order</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getEast <em>East</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getExpires <em>Expires</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isFill <em>Fill</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getFolder <em>Folder</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getFolderObjectExtensionGroup <em>Folder Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getFolderSimpleExtensionGroup <em>Folder Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getGridOrigin <em>Grid Origin</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getGroundOverlay <em>Ground Overlay</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getGroundOverlayObjectExtensionGroup <em>Ground Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getGroundOverlaySimpleExtensionGroup <em>Ground Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getHotSpot <em>Hot Spot</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getHttpQuery <em>Http Query</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getIcon <em>Icon</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getIconStyleObjectExtensionGroup <em>Icon Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getIconStyleSimpleExtensionGroup <em>Icon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getImagePyramid <em>Image Pyramid</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getImagePyramidObjectExtensionGroup <em>Image Pyramid Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getImagePyramidSimpleExtensionGroup <em>Image Pyramid Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getItemIcon <em>Item Icon</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getItemIconObjectExtensionGroup <em>Item Icon Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getItemIconSimpleExtensionGroup <em>Item Icon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getKey <em>Key</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getKml <em>Kml</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getKmlObjectExtensionGroup <em>Kml Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getKmlSimpleExtensionGroup <em>Kml Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLabelStyleObjectExtensionGroup <em>Label Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLabelStyleSimpleExtensionGroup <em>Label Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatLonAltBoxObjectExtensionGroup <em>Lat Lon Alt Box Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatLonAltBoxSimpleExtensionGroup <em>Lat Lon Alt Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatLonBox <em>Lat Lon Box</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatLonBoxObjectExtensionGroup <em>Lat Lon Box Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLatLonBoxSimpleExtensionGroup <em>Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLeftFov <em>Left Fov</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinearRingObjectExtensionGroup <em>Linear Ring Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinearRingSimpleExtensionGroup <em>Linear Ring Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLineString <em>Line String</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLineStringObjectExtensionGroup <em>Line String Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLineStringSimpleExtensionGroup <em>Line String Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLineStyleObjectExtensionGroup <em>Line Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLineStyleSimpleExtensionGroup <em>Line Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinkDescription <em>Link Description</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinkObjectExtensionGroup <em>Link Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinkSimpleExtensionGroup <em>Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLinkSnippet <em>Link Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getListItemType <em>List Item Type</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getListStyle <em>List Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getListStyleObjectExtensionGroup <em>List Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getListStyleSimpleExtensionGroup <em>List Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLocationObjectExtensionGroup <em>Location Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLocationSimpleExtensionGroup <em>Location Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLodObjectExtensionGroup <em>Lod Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLodSimpleExtensionGroup <em>Lod Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLookAt <em>Look At</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLookAtObjectExtensionGroup <em>Look At Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getLookAtSimpleExtensionGroup <em>Look At Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxSessionLength <em>Max Session Length</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxSnippetLines <em>Max Snippet Lines</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMessage <em>Message</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMinRefreshPeriod <em>Min Refresh Period</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getModel <em>Model</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getModelObjectExtensionGroup <em>Model Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getModelSimpleExtensionGroup <em>Model Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMultiGeometryObjectExtensionGroup <em>Multi Geometry Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getMultiGeometrySimpleExtensionGroup <em>Multi Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNear <em>Near</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNetworkLink <em>Network Link</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNetworkLinkControl <em>Network Link Control</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNetworkLinkControlObjectExtensionGroup <em>Network Link Control Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNetworkLinkControlSimpleExtensionGroup <em>Network Link Control Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNetworkLinkObjectExtensionGroup <em>Network Link Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNetworkLinkSimpleExtensionGroup <em>Network Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getNorth <em>North</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getObjectSimpleExtensionGroup <em>Object Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isOpen <em>Open</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getOrientationObjectExtensionGroup <em>Orientation Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getOrientationSimpleExtensionGroup <em>Orientation Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isOutline <em>Outline</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPair <em>Pair</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPairObjectExtensionGroup <em>Pair Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPairSimpleExtensionGroup <em>Pair Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPhotoOverlay <em>Photo Overlay</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPhotoOverlayObjectExtensionGroup <em>Photo Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPhotoOverlaySimpleExtensionGroup <em>Photo Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPlacemark <em>Placemark</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPlacemarkObjectExtensionGroup <em>Placemark Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPlacemarkSimpleExtensionGroup <em>Placemark Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPointObjectExtensionGroup <em>Point Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPointSimpleExtensionGroup <em>Point Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPolygonObjectExtensionGroup <em>Polygon Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPolygonSimpleExtensionGroup <em>Polygon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPolyStyleObjectExtensionGroup <em>Poly Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getPolyStyleSimpleExtensionGroup <em>Poly Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRange <em>Range</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRegionObjectExtensionGroup <em>Region Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRegionSimpleExtensionGroup <em>Region Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getResourceMap <em>Resource Map</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getResourceMapObjectExtensionGroup <em>Resource Map Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getResourceMapSimpleExtensionGroup <em>Resource Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRightFov <em>Right Fov</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getRotationXY <em>Rotation XY</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScale1 <em>Scale1</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScaleObjectExtensionGroup <em>Scale Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScaleSimpleExtensionGroup <em>Scale Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSchema <em>Schema</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSchemaData <em>Schema Data</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSchemaDataExtension <em>Schema Data Extension</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSchemaExtension <em>Schema Extension</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScreenOverlay <em>Screen Overlay</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScreenOverlayObjectExtensionGroup <em>Screen Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScreenOverlaySimpleExtensionGroup <em>Screen Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getShape <em>Shape</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSimpleData <em>Simple Data</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSimpleField <em>Simple Field</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSimpleFieldExtension <em>Simple Field Extension</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSize <em>Size</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSnippet1 <em>Snippet1</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSourceHref <em>Source Href</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getSouth <em>South</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getState <em>State</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyleMap <em>Style Map</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyleMapObjectExtensionGroup <em>Style Map Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyleMapSimpleExtensionGroup <em>Style Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyleObjectExtensionGroup <em>Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyleSimpleExtensionGroup <em>Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTileSize <em>Tile Size</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTimeSpan <em>Time Span</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTimeSpanObjectExtensionGroup <em>Time Span Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTimeSpanSimpleExtensionGroup <em>Time Span Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTimeStampObjectExtensionGroup <em>Time Stamp Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTimeStampSimpleExtensionGroup <em>Time Stamp Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getTopFov <em>Top Fov</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getUpdate <em>Update</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getUpdateExtensionGroup <em>Update Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getUpdateOpExtensionGroup <em>Update Op Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getUrl <em>Url</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewVolume <em>View Volume</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewVolumeObjectExtensionGroup <em>View Volume Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getViewVolumeSimpleExtensionGroup <em>View Volume Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getWest <em>West</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getWhen <em>When</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getWidth <em>Width</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getX <em>X</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getY <em>Y</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentRoot#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractColorStyleGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractColorStyleGroup' namespace='##targetNamespace' affiliation='AbstractSubStyleGroup'"
	 * @generated
	 */
	AbstractColorStyleType getAbstractColorStyleGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractSubStyleGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSubStyleGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractSubStyleType getAbstractSubStyleGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Object Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractObjectGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractObjectGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractObjectType getAbstractObjectGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractColorStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractColorStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractColorStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Color Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractColorStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractColorStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractColorStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Container Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractContainerGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractContainerGroup' namespace='##targetNamespace' affiliation='AbstractFeatureGroup'"
	 * @generated
	 */
	AbstractContainerType getAbstractContainerGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractFeatureGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractFeatureType getAbstractFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Container Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractContainerObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractContainerObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractContainerObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Container Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractContainerSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractContainerSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractContainerSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractFeatureObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractFeatureObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractFeatureSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractFeatureSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractGeometryGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometryGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractGeometryType getAbstractGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractGeometryObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometryObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractGeometryObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractGeometrySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometrySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractGeometrySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Lat Lon Box Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Lat Lon Box Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractLatLonBoxObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractLatLonBoxObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractLatLonBoxObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Lat Lon Box Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Lat Lon Box Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractLatLonBoxSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractLatLonBoxSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractLatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractOverlayGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractOverlayGroup' namespace='##targetNamespace' affiliation='AbstractFeatureGroup'"
	 * @generated
	 */
	AbstractOverlayType getAbstractOverlayGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractOverlayObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractOverlayObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractOverlayObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractOverlaySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractStyleSelectorGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractStyleSelectorType getAbstractStyleSelectorGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractStyleSelectorObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractStyleSelectorObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractStyleSelectorSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractStyleSelectorSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractSubStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSubStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractSubStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractSubStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSubStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractSubStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Time Primitive Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractTimePrimitiveGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimePrimitiveGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractTimePrimitiveType getAbstractTimePrimitiveGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Time Primitive Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Time Primitive Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractTimePrimitiveObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimePrimitiveObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractTimePrimitiveObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Time Primitive Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Time Primitive Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractTimePrimitiveSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimePrimitiveSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractTimePrimitiveSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractViewGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractViewType getAbstractViewGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractViewObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAbstractViewObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AbstractViewSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAbstractViewSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Address()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(AliasType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Alias()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Alias' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AliasType getAlias();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(AliasType value);

	/**
	 * Returns the value of the '<em><b>Alias Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AliasObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getAliasObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Alias Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AliasSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAliasSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Altitude()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Altitude Mode</b></em>' attribute.
	 * The default value is <code>"clampToGround"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.AltitudeModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode</em>' attribute.
	 * @see net.opengis.kml.AltitudeModeEnumType
	 * @see #setAltitudeMode(AltitudeModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AltitudeMode()
	 * @model default="clampToGround" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeMode' namespace='##targetNamespace' affiliation='altitudeModeGroup'"
	 * @generated
	 */
	AltitudeModeEnumType getAltitudeMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Mode</em>' attribute.
	 * @see net.opengis.kml.AltitudeModeEnumType
	 * @see #getAltitudeMode()
	 * @generated
	 */
	void setAltitudeMode(AltitudeModeEnumType value);

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_AltitudeModeGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style</em>' containment reference.
	 * @see #setBalloonStyle(BalloonStyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BalloonStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BalloonStyle' namespace='##targetNamespace' affiliation='AbstractSubStyleGroup'"
	 * @generated
	 */
	BalloonStyleType getBalloonStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getBalloonStyle <em>Balloon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balloon Style</em>' containment reference.
	 * @see #getBalloonStyle()
	 * @generated
	 */
	void setBalloonStyle(BalloonStyleType value);

	/**
	 * Returns the value of the '<em><b>Balloon Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BalloonStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BalloonStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getBalloonStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Balloon Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BalloonStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BalloonStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBalloonStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Basic Link Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Link Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BasicLinkObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BasicLinkObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getBasicLinkObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Basic Link Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Link Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BasicLinkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BasicLinkSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBasicLinkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Begin()
	 * @model unique="false" dataType="net.opengis.kml.DateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='begin' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBegin();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #setBgColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BgColor()
	 * @model default="ffffffff" unique="false" dataType="net.opengis.kml.ColorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bgColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBgColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(byte[] value);

	/**
	 * Returns the value of the '<em><b>Bottom Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Fov</em>' attribute.
	 * @see #setBottomFov(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BottomFov()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle90Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bottomFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBottomFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getBottomFov <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Fov</em>' attribute.
	 * @see #getBottomFov()
	 * @generated
	 */
	void setBottomFov(double value);

	/**
	 * Returns the value of the '<em><b>Boundary Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BoundaryObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundaryObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getBoundaryObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Boundary Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_BoundarySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundarySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBoundarySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera</em>' containment reference.
	 * @see #setCamera(CameraType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Camera()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Camera' namespace='##targetNamespace' affiliation='AbstractViewGroup'"
	 * @generated
	 */
	CameraType getCamera();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getCamera <em>Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' containment reference.
	 * @see #getCamera()
	 * @generated
	 */
	void setCamera(CameraType value);

	/**
	 * Returns the value of the '<em><b>Camera Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_CameraObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CameraObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getCameraObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Camera Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_CameraSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CameraSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCameraSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference.
	 * @see #setChange(ChangeType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Change()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Change' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeType getChange();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ChangeType value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Color()
	 * @model default="ffffffff" unique="false" dataType="net.opengis.kml.ColorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(byte[] value);

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ColorModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see net.opengis.kml.ColorModeEnumType
	 * @see #setColorMode(ColorModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ColorMode()
	 * @model default="normal" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colorMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorModeEnumType getColorMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see net.opengis.kml.ColorModeEnumType
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorModeEnumType value);

	/**
	 * Returns the value of the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie</em>' attribute.
	 * @see #setCookie(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Cookie()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cookie' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCookie();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getCookie <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie</em>' attribute.
	 * @see #getCookie()
	 * @generated
	 */
	void setCookie(String value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(List)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Coordinates()
	 * @model unique="false" dataType="net.opengis.kml.CoordinatesType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(List<String> value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference.
	 * @see #setCreate(CreateType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Create()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Create' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateType getCreate();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getCreate <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' containment reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(CreateType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Data()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Data' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	DataType getData();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataType value);

	/**
	 * Returns the value of the '<em><b>Data Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Extension</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_DataExtension()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDataExtension();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(DeleteType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Delete()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Delete' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteType getDelete();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(DeleteType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Display Mode</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.DisplayModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Mode</em>' attribute.
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @see #setDisplayMode(DisplayModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_DisplayMode()
	 * @model default="default" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='displayMode' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayModeEnumType getDisplayMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getDisplayMode <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Mode</em>' attribute.
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @see #getDisplayMode()
	 * @generated
	 */
	void setDisplayMode(DisplayModeEnumType value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_DisplayName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(DocumentType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Document()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace' affiliation='AbstractContainerGroup'"
	 * @generated
	 */
	DocumentType getDocument();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Document Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_DocumentObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getDocumentObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Document Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_DocumentSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDocumentSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Draw Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw Order</em>' attribute.
	 * @see #setDrawOrder(int)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_DrawOrder()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='drawOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDrawOrder();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getDrawOrder <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw Order</em>' attribute.
	 * @see #getDrawOrder()
	 * @generated
	 */
	void setDrawOrder(int value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' attribute.
	 * The default value is <code>"180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' attribute.
	 * @see #setEast(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_East()
	 * @model default="180.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='east' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEast();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' attribute.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(double value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_End()
	 * @model unique="false" dataType="net.opengis.kml.DateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Expires()
	 * @model unique="false" dataType="net.opengis.kml.DateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expires' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpires();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' containment reference.
	 * @see #setExtendedData(ExtendedDataType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ExtendedData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtendedData' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedDataType getExtendedData();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getExtendedData <em>Extended Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Data</em>' containment reference.
	 * @see #getExtendedData()
	 * @generated
	 */
	void setExtendedData(ExtendedDataType value);

	/**
	 * Returns the value of the '<em><b>Extrude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrude</em>' attribute.
	 * @see #setExtrude(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Extrude()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extrude' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' attribute.
	 * @see #isExtrude()
	 * @generated
	 */
	void setExtrude(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Fill()
	 * @model default="1" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fill' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Fly To View</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fly To View</em>' attribute.
	 * @see #setFlyToView(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_FlyToView()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flyToView' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFlyToView();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isFlyToView <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fly To View</em>' attribute.
	 * @see #isFlyToView()
	 * @generated
	 */
	void setFlyToView(boolean value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference.
	 * @see #setFolder(FolderType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Folder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace' affiliation='AbstractContainerGroup'"
	 * @generated
	 */
	FolderType getFolder();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getFolder <em>Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' containment reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(FolderType value);

	/**
	 * Returns the value of the '<em><b>Folder Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_FolderObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FolderObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getFolderObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Folder Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_FolderSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FolderSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFolderSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Grid Origin</b></em>' attribute.
	 * The default value is <code>"lowerLeft"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.GridOriginEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Origin</em>' attribute.
	 * @see net.opengis.kml.GridOriginEnumType
	 * @see #setGridOrigin(GridOriginEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_GridOrigin()
	 * @model default="lowerLeft" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gridOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	GridOriginEnumType getGridOrigin();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getGridOrigin <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Origin</em>' attribute.
	 * @see net.opengis.kml.GridOriginEnumType
	 * @see #getGridOrigin()
	 * @generated
	 */
	void setGridOrigin(GridOriginEnumType value);

	/**
	 * Returns the value of the '<em><b>Ground Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay</em>' containment reference.
	 * @see #setGroundOverlay(GroundOverlayType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_GroundOverlay()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundOverlay' namespace='##targetNamespace' affiliation='AbstractOverlayGroup'"
	 * @generated
	 */
	GroundOverlayType getGroundOverlay();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getGroundOverlay <em>Ground Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Overlay</em>' containment reference.
	 * @see #getGroundOverlay()
	 * @generated
	 */
	void setGroundOverlay(GroundOverlayType value);

	/**
	 * Returns the value of the '<em><b>Ground Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_GroundOverlayObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundOverlayObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getGroundOverlayObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Ground Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_GroundOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundOverlaySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getGroundOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Heading()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle360Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

	/**
	 * Returns the value of the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot</em>' containment reference.
	 * @see #setHotSpot(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_HotSpot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hotSpot' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getHotSpot();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getHotSpot <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot</em>' containment reference.
	 * @see #getHotSpot()
	 * @generated
	 */
	void setHotSpot(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not anyURI due to $[x] substitution in
	 *       PhotoOverlay
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Href()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Query</em>' attribute.
	 * @see #setHttpQuery(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_HttpQuery()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='httpQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpQuery();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getHttpQuery <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Query</em>' attribute.
	 * @see #getHttpQuery()
	 * @generated
	 */
	void setHttpQuery(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(LinkType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Icon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LinkType getIcon();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(LinkType value);

	/**
	 * Returns the value of the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style</em>' containment reference.
	 * @see #setIconStyle(IconStyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_IconStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IconStyle' namespace='##targetNamespace' affiliation='AbstractColorStyleGroup'"
	 * @generated
	 */
	IconStyleType getIconStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getIconStyle <em>Icon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Style</em>' containment reference.
	 * @see #getIconStyle()
	 * @generated
	 */
	void setIconStyle(IconStyleType value);

	/**
	 * Returns the value of the '<em><b>Icon Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_IconStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IconStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getIconStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Icon Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_IconStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IconStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getIconStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Image Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid</em>' containment reference.
	 * @see #setImagePyramid(ImagePyramidType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ImagePyramid()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePyramid' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	ImagePyramidType getImagePyramid();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getImagePyramid <em>Image Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pyramid</em>' containment reference.
	 * @see #getImagePyramid()
	 * @generated
	 */
	void setImagePyramid(ImagePyramidType value);

	/**
	 * Returns the value of the '<em><b>Image Pyramid Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ImagePyramidObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePyramidObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getImagePyramidObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Image Pyramid Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ImagePyramidSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePyramidSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getImagePyramidSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Inner Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Boundary Is</em>' containment reference.
	 * @see #setInnerBoundaryIs(BoundaryType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_InnerBoundaryIs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='innerBoundaryIs' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundaryType getInnerBoundaryIs();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getInnerBoundaryIs <em>Inner Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Boundary Is</em>' containment reference.
	 * @see #getInnerBoundaryIs()
	 * @generated
	 */
	void setInnerBoundaryIs(BoundaryType value);

	/**
	 * Returns the value of the '<em><b>Item Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon</em>' containment reference.
	 * @see #setItemIcon(ItemIconType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ItemIcon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemIcon' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	ItemIconType getItemIcon();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getItemIcon <em>Item Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Icon</em>' containment reference.
	 * @see #getItemIcon()
	 * @generated
	 */
	void setItemIcon(ItemIconType value);

	/**
	 * Returns the value of the '<em><b>Item Icon Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ItemIconObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemIconObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getItemIconObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Item Icon Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ItemIconSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemIconSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getItemIconSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.StyleStateEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see net.opengis.kml.StyleStateEnumType
	 * @see #setKey(StyleStateEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Key()
	 * @model default="normal" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleStateEnumType getKey();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see net.opengis.kml.StyleStateEnumType
	 * @see #getKey()
	 * @generated
	 */
	void setKey(StyleStateEnumType value);

	/**
	 * Returns the value of the '<em><b>Kml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *       <kml> is the root element.
	 * 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kml</em>' containment reference.
	 * @see #setKml(KmlType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Kml()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kml' namespace='##targetNamespace'"
	 * @generated
	 */
	KmlType getKml();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getKml <em>Kml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kml</em>' containment reference.
	 * @see #getKml()
	 * @generated
	 */
	void setKml(KmlType value);

	/**
	 * Returns the value of the '<em><b>Kml Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_KmlObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KmlObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getKmlObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Kml Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_KmlSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KmlSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getKmlSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference.
	 * @see #setLabelStyle(LabelStyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LabelStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabelStyle' namespace='##targetNamespace' affiliation='AbstractColorStyleGroup'"
	 * @generated
	 */
	LabelStyleType getLabelStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLabelStyle <em>Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' containment reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(LabelStyleType value);

	/**
	 * Returns the value of the '<em><b>Label Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LabelStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabelStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLabelStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Label Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LabelStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabelStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLabelStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Latitude()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle90Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #setLatLonAltBox(LatLonAltBoxType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LatLonAltBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBox' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LatLonAltBoxType getLatLonAltBox();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLatLonAltBox <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	void setLatLonAltBox(LatLonAltBoxType value);

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LatLonAltBoxObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBoxObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLatLonAltBoxObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LatLonAltBoxSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBoxSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLatLonAltBoxSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #setLatLonBox(LatLonBoxType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LatLonBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonBox' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LatLonBoxType getLatLonBox();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLatLonBox <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #getLatLonBox()
	 * @generated
	 */
	void setLatLonBox(LatLonBoxType value);

	/**
	 * Returns the value of the '<em><b>Lat Lon Box Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LatLonBoxObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonBoxObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLatLonBoxObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Box Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LatLonBoxSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonBoxSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Left Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Fov</em>' attribute.
	 * @see #setLeftFov(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LeftFov()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='leftFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLeftFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLeftFov <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Fov</em>' attribute.
	 * @see #getLeftFov()
	 * @generated
	 */
	void setLeftFov(double value);

	/**
	 * Returns the value of the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Ring</em>' containment reference.
	 * @see #setLinearRing(LinearRingType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinearRing()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearRing' namespace='##targetNamespace' affiliation='AbstractGeometryGroup'"
	 * @generated
	 */
	LinearRingType getLinearRing();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLinearRing <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Ring</em>' containment reference.
	 * @see #getLinearRing()
	 * @generated
	 */
	void setLinearRing(LinearRingType value);

	/**
	 * Returns the value of the '<em><b>Linear Ring Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Ring Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinearRingObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearRingObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLinearRingObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Linear Ring Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Ring Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinearRingSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearRingSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLinearRingSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Line String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String</em>' containment reference.
	 * @see #setLineString(LineStringType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LineString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineString' namespace='##targetNamespace' affiliation='AbstractGeometryGroup'"
	 * @generated
	 */
	LineStringType getLineString();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLineString <em>Line String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line String</em>' containment reference.
	 * @see #getLineString()
	 * @generated
	 */
	void setLineString(LineStringType value);

	/**
	 * Returns the value of the '<em><b>Line String Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LineStringObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStringObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLineStringObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Line String Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LineStringSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStringSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLineStringSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' containment reference.
	 * @see #setLineStyle(LineStyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LineStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStyle' namespace='##targetNamespace' affiliation='AbstractColorStyleGroup'"
	 * @generated
	 */
	LineStyleType getLineStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLineStyle <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' containment reference.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyleType value);

	/**
	 * Returns the value of the '<em><b>Line Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LineStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLineStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Line Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LineStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLineStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Link()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Link Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Description</em>' attribute.
	 * @see #setLinkDescription(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinkDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linkDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinkDescription();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLinkDescription <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Description</em>' attribute.
	 * @see #getLinkDescription()
	 * @generated
	 */
	void setLinkDescription(String value);

	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinkName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linkName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Link Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinkObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinkObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLinkObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Link Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinkSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLinkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Link Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Snippet</em>' containment reference.
	 * @see #setLinkSnippet(SnippetType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LinkSnippet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linkSnippet' namespace='##targetNamespace'"
	 * @generated
	 */
	SnippetType getLinkSnippet();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLinkSnippet <em>Link Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Snippet</em>' containment reference.
	 * @see #getLinkSnippet()
	 * @generated
	 */
	void setLinkSnippet(SnippetType value);

	/**
	 * Returns the value of the '<em><b>List Item Type</b></em>' attribute.
	 * The default value is <code>"check"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ListItemTypeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Item Type</em>' attribute.
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @see #setListItemType(ListItemTypeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ListItemType()
	 * @model default="check" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listItemType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListItemTypeEnumType getListItemType();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getListItemType <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Item Type</em>' attribute.
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @see #getListItemType()
	 * @generated
	 */
	void setListItemType(ListItemTypeEnumType value);

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' containment reference.
	 * @see #setListStyle(ListStyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ListStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListStyle' namespace='##targetNamespace' affiliation='AbstractSubStyleGroup'"
	 * @generated
	 */
	ListStyleType getListStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getListStyle <em>List Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Style</em>' containment reference.
	 * @see #getListStyle()
	 * @generated
	 */
	void setListStyle(ListStyleType value);

	/**
	 * Returns the value of the '<em><b>List Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ListStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getListStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>List Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ListStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getListStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Returns the value of the '<em><b>Location Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LocationObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLocationObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Location Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LocationSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLocationSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' containment reference.
	 * @see #setLod(LodType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Lod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lod' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LodType getLod();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLod <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' containment reference.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(LodType value);

	/**
	 * Returns the value of the '<em><b>Lod Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LodObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LodObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLodObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lod Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LodSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LodSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLodSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Longitude()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look At</em>' containment reference.
	 * @see #setLookAt(LookAtType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LookAt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LookAt' namespace='##targetNamespace' affiliation='AbstractViewGroup'"
	 * @generated
	 */
	LookAtType getLookAt();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getLookAt <em>Look At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Look At</em>' containment reference.
	 * @see #getLookAt()
	 * @generated
	 */
	void setLookAt(LookAtType value);

	/**
	 * Returns the value of the '<em><b>Look At Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look At Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LookAtObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LookAtObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getLookAtObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Look At Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look At Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_LookAtSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LookAtSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLookAtSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Max Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Altitude</em>' attribute.
	 * @see #setMaxAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxAltitude()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Altitude</em>' attribute.
	 * @see #getMaxAltitude()
	 * @generated
	 */
	void setMaxAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Max Fade Extent</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #setMaxFadeExtent(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxFadeExtent()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxFadeExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxFadeExtent();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #getMaxFadeExtent()
	 * @generated
	 */
	void setMaxFadeExtent(double value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(int)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxHeight()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxHeight();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(int value);

	/**
	 * Returns the value of the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #setMaxLodPixels(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxLodPixels()
	 * @model default="-1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxLodPixels' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxLodPixels();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #getMaxLodPixels()
	 * @generated
	 */
	void setMaxLodPixels(double value);

	/**
	 * Returns the value of the '<em><b>Max Session Length</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Session Length</em>' attribute.
	 * @see #setMaxSessionLength(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxSessionLength()
	 * @model default="-1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxSessionLength' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxSessionLength();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxSessionLength <em>Max Session Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Session Length</em>' attribute.
	 * @see #getMaxSessionLength()
	 * @generated
	 */
	void setMaxSessionLength(double value);

	/**
	 * Returns the value of the '<em><b>Max Snippet Lines</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Snippet Lines</em>' attribute.
	 * @see #setMaxSnippetLines(int)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxSnippetLines()
	 * @model default="2" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxSnippetLines' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxSnippetLines();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxSnippetLines <em>Max Snippet Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Snippet Lines</em>' attribute.
	 * @see #getMaxSnippetLines()
	 * @generated
	 */
	void setMaxSnippetLines(int value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(int)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MaxWidth()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='maxWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxWidth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Message()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata deprecated in 2.2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Metadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Min Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Altitude</em>' attribute.
	 * @see #setMinAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MinAltitude()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMinAltitude <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Altitude</em>' attribute.
	 * @see #getMinAltitude()
	 * @generated
	 */
	void setMinAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Min Fade Extent</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #setMinFadeExtent(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MinFadeExtent()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minFadeExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinFadeExtent();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMinFadeExtent <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #getMinFadeExtent()
	 * @generated
	 */
	void setMinFadeExtent(double value);

	/**
	 * Returns the value of the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #setMinLodPixels(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MinLodPixels()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minLodPixels' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinLodPixels();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMinLodPixels <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #getMinLodPixels()
	 * @generated
	 */
	void setMinLodPixels(double value);

	/**
	 * Returns the value of the '<em><b>Min Refresh Period</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Refresh Period</em>' attribute.
	 * @see #setMinRefreshPeriod(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MinRefreshPeriod()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='minRefreshPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinRefreshPeriod();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Refresh Period</em>' attribute.
	 * @see #getMinRefreshPeriod()
	 * @generated
	 */
	void setMinRefreshPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Model()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Model' namespace='##targetNamespace' affiliation='AbstractGeometryGroup'"
	 * @generated
	 */
	ModelType getModel();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelType value);

	/**
	 * Returns the value of the '<em><b>Model Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ModelObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getModelObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Model Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ModelSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getModelSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Multi Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry</em>' containment reference.
	 * @see #setMultiGeometry(MultiGeometryType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MultiGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometry' namespace='##targetNamespace' affiliation='AbstractGeometryGroup'"
	 * @generated
	 */
	MultiGeometryType getMultiGeometry();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getMultiGeometry <em>Multi Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Geometry</em>' containment reference.
	 * @see #getMultiGeometry()
	 * @generated
	 */
	void setMultiGeometry(MultiGeometryType value);

	/**
	 * Returns the value of the '<em><b>Multi Geometry Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MultiGeometryObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometryObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getMultiGeometryObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Multi Geometry Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_MultiGeometrySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometrySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMultiGeometrySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Near</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Near</em>' attribute.
	 * @see #setNear(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Near()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='near' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNear();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getNear <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Near</em>' attribute.
	 * @see #getNear()
	 * @generated
	 */
	void setNear(double value);

	/**
	 * Returns the value of the '<em><b>Network Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link</em>' containment reference.
	 * @see #setNetworkLink(NetworkLinkType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_NetworkLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLink' namespace='##targetNamespace' affiliation='AbstractFeatureGroup'"
	 * @generated
	 */
	NetworkLinkType getNetworkLink();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getNetworkLink <em>Network Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Link</em>' containment reference.
	 * @see #getNetworkLink()
	 * @generated
	 */
	void setNetworkLink(NetworkLinkType value);

	/**
	 * Returns the value of the '<em><b>Network Link Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control</em>' containment reference.
	 * @see #setNetworkLinkControl(NetworkLinkControlType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_NetworkLinkControl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkControl' namespace='##targetNamespace'"
	 * @generated
	 */
	NetworkLinkControlType getNetworkLinkControl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getNetworkLinkControl <em>Network Link Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Link Control</em>' containment reference.
	 * @see #getNetworkLinkControl()
	 * @generated
	 */
	void setNetworkLinkControl(NetworkLinkControlType value);

	/**
	 * Returns the value of the '<em><b>Network Link Control Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_NetworkLinkControlObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkControlObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getNetworkLinkControlObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Control Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Control Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_NetworkLinkControlSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkControlSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNetworkLinkControlSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_NetworkLinkObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getNetworkLinkObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Network Link Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_NetworkLinkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLinkSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNetworkLinkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>North</b></em>' attribute.
	 * The default value is <code>"180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' attribute.
	 * @see #setNorth(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_North()
	 * @model default="180.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='north' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNorth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' attribute.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(double value);

	/**
	 * Returns the value of the '<em><b>Object Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ObjectSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getObjectSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Open()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='open' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Orientation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Orientation Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_OrientationObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrientationObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getOrientationObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Orientation Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_OrientationSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrientationSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getOrientationSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Outer Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Boundary Is</em>' containment reference.
	 * @see #setOuterBoundaryIs(BoundaryType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_OuterBoundaryIs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outerBoundaryIs' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundaryType getOuterBoundaryIs();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getOuterBoundaryIs <em>Outer Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Boundary Is</em>' containment reference.
	 * @see #getOuterBoundaryIs()
	 * @generated
	 */
	void setOuterBoundaryIs(BoundaryType value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Outline()
	 * @model default="1" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outline' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay XY</em>' containment reference.
	 * @see #setOverlayXY(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_OverlayXY()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='overlayXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getOverlayXY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getOverlayXY <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay XY</em>' containment reference.
	 * @see #getOverlayXY()
	 * @generated
	 */
	void setOverlayXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair</em>' containment reference.
	 * @see #setPair(PairType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Pair()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Pair' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	PairType getPair();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPair <em>Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pair</em>' containment reference.
	 * @see #getPair()
	 * @generated
	 */
	void setPair(PairType value);

	/**
	 * Returns the value of the '<em><b>Pair Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PairObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PairObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getPairObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Pair Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PairSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PairSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPairSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PhoneNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phoneNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Photo Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay</em>' containment reference.
	 * @see #setPhotoOverlay(PhotoOverlayType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PhotoOverlay()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhotoOverlay' namespace='##targetNamespace' affiliation='AbstractOverlayGroup'"
	 * @generated
	 */
	PhotoOverlayType getPhotoOverlay();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPhotoOverlay <em>Photo Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo Overlay</em>' containment reference.
	 * @see #getPhotoOverlay()
	 * @generated
	 */
	void setPhotoOverlay(PhotoOverlayType value);

	/**
	 * Returns the value of the '<em><b>Photo Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PhotoOverlayObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhotoOverlayObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getPhotoOverlayObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Photo Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PhotoOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhotoOverlaySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPhotoOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Placemark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark</em>' containment reference.
	 * @see #setPlacemark(PlacemarkType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Placemark()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Placemark' namespace='##targetNamespace' affiliation='AbstractFeatureGroup'"
	 * @generated
	 */
	PlacemarkType getPlacemark();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPlacemark <em>Placemark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placemark</em>' containment reference.
	 * @see #getPlacemark()
	 * @generated
	 */
	void setPlacemark(PlacemarkType value);

	/**
	 * Returns the value of the '<em><b>Placemark Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PlacemarkObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlacemarkObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getPlacemarkObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Placemark Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PlacemarkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlacemarkSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPlacemarkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Point()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace' affiliation='AbstractGeometryGroup'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

	/**
	 * Returns the value of the '<em><b>Point Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PointObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getPointObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Point Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PointSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPointSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Polygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Polygon' namespace='##targetNamespace' affiliation='AbstractGeometryGroup'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Polygon Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PolygonObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolygonObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getPolygonObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Polygon Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PolygonSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolygonSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPolygonSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style</em>' containment reference.
	 * @see #setPolyStyle(PolyStyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PolyStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyStyle' namespace='##targetNamespace' affiliation='AbstractColorStyleGroup'"
	 * @generated
	 */
	PolyStyleType getPolyStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getPolyStyle <em>Poly Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poly Style</em>' containment reference.
	 * @see #getPolyStyle()
	 * @generated
	 */
	void setPolyStyle(PolyStyleType value);

	/**
	 * Returns the value of the '<em><b>Poly Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PolyStyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyStyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getPolyStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Poly Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_PolyStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyStyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPolyStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Range()
	 * @model default="0.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRange();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(double value);

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RefreshInterval()
	 * @model default="4.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refreshInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRefreshInterval();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(double value);

	/**
	 * Returns the value of the '<em><b>Refresh Mode</b></em>' attribute.
	 * The default value is <code>"onChange"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.RefreshModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @see #setRefreshMode(RefreshModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RefreshMode()
	 * @model default="onChange" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refreshMode' namespace='##targetNamespace'"
	 * @generated
	 */
	RefreshModeEnumType getRefreshMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRefreshMode <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @see #getRefreshMode()
	 * @generated
	 */
	void setRefreshMode(RefreshModeEnumType value);

	/**
	 * Returns the value of the '<em><b>Refresh Visibility</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #setRefreshVisibility(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RefreshVisibility()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='refreshVisibility' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRefreshVisibility();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isRefreshVisibility <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #isRefreshVisibility()
	 * @generated
	 */
	void setRefreshVisibility(boolean value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(RegionType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Region()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	RegionType getRegion();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(RegionType value);

	/**
	 * Returns the value of the '<em><b>Region Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RegionObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegionObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getRegionObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Region Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RegionSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegionSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getRegionSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Resource Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map</em>' containment reference.
	 * @see #setResourceMap(ResourceMapType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ResourceMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceMap' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	ResourceMapType getResourceMap();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getResourceMap <em>Resource Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Map</em>' containment reference.
	 * @see #getResourceMap()
	 * @generated
	 */
	void setResourceMap(ResourceMapType value);

	/**
	 * Returns the value of the '<em><b>Resource Map Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ResourceMapObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceMapObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getResourceMapObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Resource Map Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ResourceMapSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceMapSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getResourceMapSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Right Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Fov</em>' attribute.
	 * @see #setRightFov(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RightFov()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rightFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRightFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRightFov <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Fov</em>' attribute.
	 * @see #getRightFov()
	 * @generated
	 */
	void setRightFov(double value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Roll()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='roll' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Rotation()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

	/**
	 * Returns the value of the '<em><b>Rotation XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation XY</em>' containment reference.
	 * @see #setRotationXY(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_RotationXY()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rotationXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getRotationXY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getRotationXY <em>Rotation XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation XY</em>' containment reference.
	 * @see #getRotationXY()
	 * @generated
	 */
	void setRotationXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Scale()
	 * @model default="1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Returns the value of the '<em><b>Scale1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale1</em>' containment reference.
	 * @see #setScale1(ScaleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Scale1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	ScaleType getScale1();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getScale1 <em>Scale1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale1</em>' containment reference.
	 * @see #getScale1()
	 * @generated
	 */
	void setScale1(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Scale Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ScaleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScaleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getScaleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Scale Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ScaleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScaleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getScaleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(SchemaType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Schema()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Schema' namespace='##targetNamespace'"
	 * @generated
	 */
	SchemaType getSchema();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(SchemaType value);

	/**
	 * Returns the value of the '<em><b>Schema Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Data</em>' containment reference.
	 * @see #setSchemaData(SchemaDataType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SchemaData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchemaData' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	SchemaDataType getSchemaData();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSchemaData <em>Schema Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Data</em>' containment reference.
	 * @see #getSchemaData()
	 * @generated
	 */
	void setSchemaData(SchemaDataType value);

	/**
	 * Returns the value of the '<em><b>Schema Data Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Data Extension</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SchemaDataExtension()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchemaDataExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSchemaDataExtension();

	/**
	 * Returns the value of the '<em><b>Schema Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Extension</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SchemaExtension()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchemaExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSchemaExtension();

	/**
	 * Returns the value of the '<em><b>Screen Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay</em>' containment reference.
	 * @see #setScreenOverlay(ScreenOverlayType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ScreenOverlay()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScreenOverlay' namespace='##targetNamespace' affiliation='AbstractOverlayGroup'"
	 * @generated
	 */
	ScreenOverlayType getScreenOverlay();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getScreenOverlay <em>Screen Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Overlay</em>' containment reference.
	 * @see #getScreenOverlay()
	 * @generated
	 */
	void setScreenOverlay(ScreenOverlayType value);

	/**
	 * Returns the value of the '<em><b>Screen Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ScreenOverlayObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScreenOverlayObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getScreenOverlayObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Screen Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ScreenOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScreenOverlaySimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getScreenOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen XY</em>' containment reference.
	 * @see #setScreenXY(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ScreenXY()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='screenXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getScreenXY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getScreenXY <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen XY</em>' containment reference.
	 * @see #getScreenXY()
	 * @generated
	 */
	void setScreenXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"rectangle"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ShapeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see net.opengis.kml.ShapeEnumType
	 * @see #setShape(ShapeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Shape()
	 * @model default="rectangle" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shape' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeEnumType getShape();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see net.opengis.kml.ShapeEnumType
	 * @see #getShape()
	 * @generated
	 */
	void setShape(ShapeEnumType value);

	/**
	 * Returns the value of the '<em><b>Simple Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Data</em>' containment reference.
	 * @see #setSimpleData(SimpleDataType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SimpleData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleData' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleDataType getSimpleData();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSimpleData <em>Simple Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Data</em>' containment reference.
	 * @see #getSimpleData()
	 * @generated
	 */
	void setSimpleData(SimpleDataType value);

	/**
	 * Returns the value of the '<em><b>Simple Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Field</em>' containment reference.
	 * @see #setSimpleField(SimpleFieldType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SimpleField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleField' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleFieldType getSimpleField();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSimpleField <em>Simple Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Field</em>' containment reference.
	 * @see #getSimpleField()
	 * @generated
	 */
	void setSimpleField(SimpleFieldType value);

	/**
	 * Returns the value of the '<em><b>Simple Field Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Field Extension</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SimpleFieldExtension()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleFieldExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSimpleFieldExtension();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Size()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getSize();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet</em>' attribute.
	 * @see #setSnippet(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Snippet()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='snippet' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSnippet();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSnippet <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet</em>' attribute.
	 * @see #getSnippet()
	 * @generated
	 */
	void setSnippet(String value);

	/**
	 * Returns the value of the '<em><b>Snippet1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet1</em>' containment reference.
	 * @see #setSnippet1(SnippetType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Snippet1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Snippet' namespace='##targetNamespace'"
	 * @generated
	 */
	SnippetType getSnippet1();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSnippet1 <em>Snippet1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet1</em>' containment reference.
	 * @see #getSnippet1()
	 * @generated
	 */
	void setSnippet1(SnippetType value);

	/**
	 * Returns the value of the '<em><b>Source Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Href</em>' attribute.
	 * @see #setSourceHref(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_SourceHref()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sourceHref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSourceHref <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Href</em>' attribute.
	 * @see #getSourceHref()
	 * @generated
	 */
	void setSourceHref(String value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' attribute.
	 * @see #setSouth(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_South()
	 * @model default="-180.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='south' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSouth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' attribute.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(double value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(List)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_State()
	 * @model unique="false" dataType="net.opengis.kml.ItemIconStateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ItemIconStateEnumType> getState();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(List<ItemIconStateEnumType> value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(StyleType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Style' namespace='##targetNamespace' affiliation='AbstractStyleSelectorGroup'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Returns the value of the '<em><b>Style Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map</em>' containment reference.
	 * @see #setStyleMap(StyleMapType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_StyleMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleMap' namespace='##targetNamespace' affiliation='AbstractStyleSelectorGroup'"
	 * @generated
	 */
	StyleMapType getStyleMap();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getStyleMap <em>Style Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Map</em>' containment reference.
	 * @see #getStyleMap()
	 * @generated
	 */
	void setStyleMap(StyleMapType value);

	/**
	 * Returns the value of the '<em><b>Style Map Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_StyleMapObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleMapObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getStyleMapObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Style Map Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_StyleMapSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleMapSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStyleMapSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_StyleObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getStyleObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_StyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_StyleUrl()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='styleUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

	/**
	 * Returns the value of the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Href</em>' attribute.
	 * @see #setTargetHref(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TargetHref()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='targetHref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTargetHref <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Href</em>' attribute.
	 * @see #getTargetHref()
	 * @generated
	 */
	void setTargetHref(String value);

	/**
	 * Returns the value of the '<em><b>Tessellate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tessellate</em>' attribute.
	 * @see #setTessellate(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Tessellate()
	 * @model default="0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tessellate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTessellate();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isTessellate <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tessellate</em>' attribute.
	 * @see #isTessellate()
	 * @generated
	 */
	void setTessellate(boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Text()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The default value is <code>"ff000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TextColor()
	 * @model default="ff000000" unique="false" dataType="net.opengis.kml.ColorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getTextColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(byte[] value);

	/**
	 * Returns the value of the '<em><b>Tile Size</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size</em>' attribute.
	 * @see #setTileSize(int)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TileSize()
	 * @model default="256" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tileSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTileSize();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTileSize <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size</em>' attribute.
	 * @see #getTileSize()
	 * @generated
	 */
	void setTileSize(int value);

	/**
	 * Returns the value of the '<em><b>Tilt</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt</em>' attribute.
	 * @see #setTilt(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Tilt()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Anglepos180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tilt' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt</em>' attribute.
	 * @see #getTilt()
	 * @generated
	 */
	void setTilt(double value);

	/**
	 * Returns the value of the '<em><b>Time Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span</em>' containment reference.
	 * @see #setTimeSpan(TimeSpanType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TimeSpan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeSpan' namespace='##targetNamespace' affiliation='AbstractTimePrimitiveGroup'"
	 * @generated
	 */
	TimeSpanType getTimeSpan();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTimeSpan <em>Time Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Span</em>' containment reference.
	 * @see #getTimeSpan()
	 * @generated
	 */
	void setTimeSpan(TimeSpanType value);

	/**
	 * Returns the value of the '<em><b>Time Span Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TimeSpanObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeSpanObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getTimeSpanObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Time Span Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TimeSpanSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeSpanSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTimeSpanSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(TimeStampType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TimeStamp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace' affiliation='AbstractTimePrimitiveGroup'"
	 * @generated
	 */
	TimeStampType getTimeStamp();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(TimeStampType value);

	/**
	 * Returns the value of the '<em><b>Time Stamp Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TimeStampObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeStampObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getTimeStampObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Time Stamp Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TimeStampSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeStampSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTimeStampSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Top Fov</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Fov</em>' attribute.
	 * @see #setTopFov(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_TopFov()
	 * @model default="0.0" unique="false" dataType="net.opengis.kml.Angle90Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='topFov' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTopFov();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getTopFov <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Fov</em>' attribute.
	 * @see #getTopFov()
	 * @generated
	 */
	void setTopFov(double value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(UpdateType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Update()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Update' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdate();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(UpdateType value);

	/**
	 * Returns the value of the '<em><b>Update Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_UpdateExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUpdateExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Update Op Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Op Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_UpdateOpExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateOpExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUpdateOpExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Url deprecated in 2.2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(LinkType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Url()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Url' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	LinkType getUrl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(LinkType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>View Bound Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Bound Scale</em>' attribute.
	 * @see #setViewBoundScale(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewBoundScale()
	 * @model default="1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewBoundScale' namespace='##targetNamespace'"
	 * @generated
	 */
	double getViewBoundScale();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getViewBoundScale <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Bound Scale</em>' attribute.
	 * @see #getViewBoundScale()
	 * @generated
	 */
	void setViewBoundScale(double value);

	/**
	 * Returns the value of the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Format</em>' attribute.
	 * @see #setViewFormat(String)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewFormat()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getViewFormat();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getViewFormat <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Format</em>' attribute.
	 * @see #getViewFormat()
	 * @generated
	 */
	void setViewFormat(String value);

	/**
	 * Returns the value of the '<em><b>View Refresh Mode</b></em>' attribute.
	 * The default value is <code>"never"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ViewRefreshModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @see #setViewRefreshMode(ViewRefreshModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewRefreshMode()
	 * @model default="never" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewRefreshMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewRefreshModeEnumType getViewRefreshMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getViewRefreshMode <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Mode</em>' attribute.
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @see #getViewRefreshMode()
	 * @generated
	 */
	void setViewRefreshMode(ViewRefreshModeEnumType value);

	/**
	 * Returns the value of the '<em><b>View Refresh Time</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Time</em>' attribute.
	 * @see #setViewRefreshTime(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewRefreshTime()
	 * @model default="4.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='viewRefreshTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getViewRefreshTime();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getViewRefreshTime <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Time</em>' attribute.
	 * @see #getViewRefreshTime()
	 * @generated
	 */
	void setViewRefreshTime(double value);

	/**
	 * Returns the value of the '<em><b>View Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume</em>' containment reference.
	 * @see #setViewVolume(ViewVolumeType)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewVolume()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewVolume' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	ViewVolumeType getViewVolume();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getViewVolume <em>View Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Volume</em>' containment reference.
	 * @see #getViewVolume()
	 * @generated
	 */
	void setViewVolume(ViewVolumeType value);

	/**
	 * Returns the value of the '<em><b>View Volume Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume Object Extension Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewVolumeObjectExtensionGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewVolumeObjectExtensionGroup' namespace='##targetNamespace' affiliation='AbstractObjectGroup'"
	 * @generated
	 */
	AbstractObjectType getViewVolumeObjectExtensionGroup();

	/**
	 * Returns the value of the '<em><b>View Volume Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume Simple Extension Group</em>' attribute.
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_ViewVolumeSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ViewVolumeSimpleExtensionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getViewVolumeSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(boolean)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Visibility()
	 * @model default="1" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVisibility();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#isVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #isVisibility()
	 * @generated
	 */
	void setVisibility(boolean value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' attribute.
	 * @see #setWest(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_West()
	 * @model default="-180.0" unique="false" dataType="net.opengis.kml.Angle180Type" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='west' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWest();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' attribute.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(double value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_When()
	 * @model unique="false" dataType="net.opengis.kml.DateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWhen();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Width()
	 * @model default="1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_X()
	 * @model default="1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Y()
	 * @model default="1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see net.opengis.kml.KMLPackage#getDocumentRoot_Z()
	 * @model default="1.0" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link net.opengis.kml.DocumentRoot#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // DocumentRoot
