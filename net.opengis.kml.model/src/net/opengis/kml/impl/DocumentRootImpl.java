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
package net.opengis.kml.impl;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.kml.AbstractColorStyleType;
import net.opengis.kml.AbstractContainerType;
import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.AbstractGeometryType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.AbstractOverlayType;
import net.opengis.kml.AbstractStyleSelectorType;
import net.opengis.kml.AbstractSubStyleType;
import net.opengis.kml.AbstractTimePrimitiveType;
import net.opengis.kml.AbstractViewType;
import net.opengis.kml.AliasType;
import net.opengis.kml.AltitudeModeEnumType;
import net.opengis.kml.BalloonStyleType;
import net.opengis.kml.BoundaryType;
import net.opengis.kml.CameraType;
import net.opengis.kml.ChangeType;
import net.opengis.kml.ColorModeEnumType;
import net.opengis.kml.CreateType;
import net.opengis.kml.DataType;
import net.opengis.kml.DeleteType;
import net.opengis.kml.DisplayModeEnumType;
import net.opengis.kml.DocumentRoot;
import net.opengis.kml.DocumentType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.FolderType;
import net.opengis.kml.GridOriginEnumType;
import net.opengis.kml.GroundOverlayType;
import net.opengis.kml.IconStyleType;
import net.opengis.kml.ImagePyramidType;
import net.opengis.kml.ItemIconStateEnumType;
import net.opengis.kml.ItemIconType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.KmlType;
import net.opengis.kml.LabelStyleType;
import net.opengis.kml.LatLonAltBoxType;
import net.opengis.kml.LatLonBoxType;
import net.opengis.kml.LineStringType;
import net.opengis.kml.LineStyleType;
import net.opengis.kml.LinearRingType;
import net.opengis.kml.LinkType;
import net.opengis.kml.ListItemTypeEnumType;
import net.opengis.kml.ListStyleType;
import net.opengis.kml.LocationType;
import net.opengis.kml.LodType;
import net.opengis.kml.LookAtType;
import net.opengis.kml.MetadataType;
import net.opengis.kml.ModelType;
import net.opengis.kml.MultiGeometryType;
import net.opengis.kml.NetworkLinkControlType;
import net.opengis.kml.NetworkLinkType;
import net.opengis.kml.OrientationType;
import net.opengis.kml.PairType;
import net.opengis.kml.PhotoOverlayType;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PointType;
import net.opengis.kml.PolyStyleType;
import net.opengis.kml.PolygonType;
import net.opengis.kml.RefreshModeEnumType;
import net.opengis.kml.RegionType;
import net.opengis.kml.ResourceMapType;
import net.opengis.kml.ScaleType;
import net.opengis.kml.SchemaDataType;
import net.opengis.kml.SchemaType;
import net.opengis.kml.ScreenOverlayType;
import net.opengis.kml.ShapeEnumType;
import net.opengis.kml.SimpleDataType;
import net.opengis.kml.SimpleFieldType;
import net.opengis.kml.SnippetType;
import net.opengis.kml.StyleMapType;
import net.opengis.kml.StyleStateEnumType;
import net.opengis.kml.StyleType;
import net.opengis.kml.TimeSpanType;
import net.opengis.kml.TimeStampType;
import net.opengis.kml.UpdateType;
import net.opengis.kml.Vec2Type;
import net.opengis.kml.ViewRefreshModeEnumType;
import net.opengis.kml.ViewVolumeType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractColorStyleGroup <em>Abstract Color Style Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractSubStyleGroup <em>Abstract Sub Style Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractObjectGroup <em>Abstract Object Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractColorStyleObjectExtensionGroup <em>Abstract Color Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractColorStyleSimpleExtensionGroup <em>Abstract Color Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractContainerGroup <em>Abstract Container Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractContainerObjectExtensionGroup <em>Abstract Container Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractContainerSimpleExtensionGroup <em>Abstract Container Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractFeatureObjectExtensionGroup <em>Abstract Feature Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractFeatureSimpleExtensionGroup <em>Abstract Feature Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractGeometryObjectExtensionGroup <em>Abstract Geometry Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractGeometrySimpleExtensionGroup <em>Abstract Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractLatLonBoxObjectExtensionGroup <em>Abstract Lat Lon Box Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractLatLonBoxSimpleExtensionGroup <em>Abstract Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractOverlayGroup <em>Abstract Overlay Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractOverlayObjectExtensionGroup <em>Abstract Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractOverlaySimpleExtensionGroup <em>Abstract Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractStyleSelectorObjectExtensionGroup <em>Abstract Style Selector Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractStyleSelectorSimpleExtensionGroup <em>Abstract Style Selector Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractSubStyleObjectExtensionGroup <em>Abstract Sub Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractSubStyleSimpleExtensionGroup <em>Abstract Sub Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractTimePrimitiveObjectExtensionGroup <em>Abstract Time Primitive Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractTimePrimitiveSimpleExtensionGroup <em>Abstract Time Primitive Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractViewGroup <em>Abstract View Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractViewObjectExtensionGroup <em>Abstract View Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAbstractViewSimpleExtensionGroup <em>Abstract View Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAliasObjectExtensionGroup <em>Alias Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAliasSimpleExtensionGroup <em>Alias Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBalloonStyleObjectExtensionGroup <em>Balloon Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBalloonStyleSimpleExtensionGroup <em>Balloon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBasicLinkObjectExtensionGroup <em>Basic Link Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBasicLinkSimpleExtensionGroup <em>Basic Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBottomFov <em>Bottom Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBoundaryObjectExtensionGroup <em>Boundary Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getBoundarySimpleExtensionGroup <em>Boundary Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getCameraObjectExtensionGroup <em>Camera Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getCameraSimpleExtensionGroup <em>Camera Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getChange <em>Change</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getCookie <em>Cookie</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDataExtension <em>Data Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDocumentObjectExtensionGroup <em>Document Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDocumentSimpleExtensionGroup <em>Document Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getDrawOrder <em>Draw Order</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getEast <em>East</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getFolderObjectExtensionGroup <em>Folder Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getFolderSimpleExtensionGroup <em>Folder Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getGridOrigin <em>Grid Origin</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getGroundOverlay <em>Ground Overlay</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getGroundOverlayObjectExtensionGroup <em>Ground Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getGroundOverlaySimpleExtensionGroup <em>Ground Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getHotSpot <em>Hot Spot</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getHttpQuery <em>Http Query</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getIconStyleObjectExtensionGroup <em>Icon Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getIconStyleSimpleExtensionGroup <em>Icon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getImagePyramid <em>Image Pyramid</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getImagePyramidObjectExtensionGroup <em>Image Pyramid Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getImagePyramidSimpleExtensionGroup <em>Image Pyramid Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getItemIcon <em>Item Icon</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getItemIconObjectExtensionGroup <em>Item Icon Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getItemIconSimpleExtensionGroup <em>Item Icon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getKml <em>Kml</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getKmlObjectExtensionGroup <em>Kml Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getKmlSimpleExtensionGroup <em>Kml Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLabelStyleObjectExtensionGroup <em>Label Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLabelStyleSimpleExtensionGroup <em>Label Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatLonAltBoxObjectExtensionGroup <em>Lat Lon Alt Box Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatLonAltBoxSimpleExtensionGroup <em>Lat Lon Alt Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatLonBox <em>Lat Lon Box</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatLonBoxObjectExtensionGroup <em>Lat Lon Box Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLatLonBoxSimpleExtensionGroup <em>Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLeftFov <em>Left Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinearRingObjectExtensionGroup <em>Linear Ring Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinearRingSimpleExtensionGroup <em>Linear Ring Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLineString <em>Line String</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLineStringObjectExtensionGroup <em>Line String Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLineStringSimpleExtensionGroup <em>Line String Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLineStyleObjectExtensionGroup <em>Line Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLineStyleSimpleExtensionGroup <em>Line Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinkDescription <em>Link Description</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinkObjectExtensionGroup <em>Link Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinkSimpleExtensionGroup <em>Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLinkSnippet <em>Link Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getListItemType <em>List Item Type</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getListStyleObjectExtensionGroup <em>List Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getListStyleSimpleExtensionGroup <em>List Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLocationObjectExtensionGroup <em>Location Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLocationSimpleExtensionGroup <em>Location Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLodObjectExtensionGroup <em>Lod Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLodSimpleExtensionGroup <em>Lod Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLookAt <em>Look At</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLookAtObjectExtensionGroup <em>Look At Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getLookAtSimpleExtensionGroup <em>Look At Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxSessionLength <em>Max Session Length</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxSnippetLines <em>Max Snippet Lines</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMinRefreshPeriod <em>Min Refresh Period</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getModelObjectExtensionGroup <em>Model Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getModelSimpleExtensionGroup <em>Model Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMultiGeometryObjectExtensionGroup <em>Multi Geometry Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getMultiGeometrySimpleExtensionGroup <em>Multi Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNear <em>Near</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNetworkLink <em>Network Link</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNetworkLinkControl <em>Network Link Control</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNetworkLinkControlObjectExtensionGroup <em>Network Link Control Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNetworkLinkControlSimpleExtensionGroup <em>Network Link Control Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNetworkLinkObjectExtensionGroup <em>Network Link Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNetworkLinkSimpleExtensionGroup <em>Network Link Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getNorth <em>North</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getObjectSimpleExtensionGroup <em>Object Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getOrientationObjectExtensionGroup <em>Orientation Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getOrientationSimpleExtensionGroup <em>Orientation Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPair <em>Pair</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPairObjectExtensionGroup <em>Pair Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPairSimpleExtensionGroup <em>Pair Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPhotoOverlay <em>Photo Overlay</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPhotoOverlayObjectExtensionGroup <em>Photo Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPhotoOverlaySimpleExtensionGroup <em>Photo Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPlacemark <em>Placemark</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPlacemarkObjectExtensionGroup <em>Placemark Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPlacemarkSimpleExtensionGroup <em>Placemark Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPointObjectExtensionGroup <em>Point Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPointSimpleExtensionGroup <em>Point Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPolygonObjectExtensionGroup <em>Polygon Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPolygonSimpleExtensionGroup <em>Polygon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPolyStyleObjectExtensionGroup <em>Poly Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getPolyStyleSimpleExtensionGroup <em>Poly Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRange <em>Range</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRegionObjectExtensionGroup <em>Region Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRegionSimpleExtensionGroup <em>Region Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getResourceMap <em>Resource Map</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getResourceMapObjectExtensionGroup <em>Resource Map Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getResourceMapSimpleExtensionGroup <em>Resource Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRightFov <em>Right Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getRotationXY <em>Rotation XY</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScale1 <em>Scale1</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScaleObjectExtensionGroup <em>Scale Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScaleSimpleExtensionGroup <em>Scale Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSchemaData <em>Schema Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSchemaDataExtension <em>Schema Data Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSchemaExtension <em>Schema Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScreenOverlay <em>Screen Overlay</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScreenOverlayObjectExtensionGroup <em>Screen Overlay Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScreenOverlaySimpleExtensionGroup <em>Screen Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSimpleData <em>Simple Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSimpleField <em>Simple Field</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSimpleFieldExtension <em>Simple Field Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSize <em>Size</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSnippet1 <em>Snippet1</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSourceHref <em>Source Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getSouth <em>South</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getState <em>State</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyleMap <em>Style Map</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyleMapObjectExtensionGroup <em>Style Map Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyleMapSimpleExtensionGroup <em>Style Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyleObjectExtensionGroup <em>Style Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyleSimpleExtensionGroup <em>Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTileSize <em>Tile Size</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTimeSpan <em>Time Span</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTimeSpanObjectExtensionGroup <em>Time Span Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTimeSpanSimpleExtensionGroup <em>Time Span Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTimeStampObjectExtensionGroup <em>Time Stamp Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTimeStampSimpleExtensionGroup <em>Time Stamp Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getTopFov <em>Top Fov</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getUpdateExtensionGroup <em>Update Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getUpdateOpExtensionGroup <em>Update Op Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewVolume <em>View Volume</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewVolumeObjectExtensionGroup <em>View Volume Object Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getViewVolumeSimpleExtensionGroup <em>View Volume Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getWest <em>West</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getWhen <em>When</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getX <em>X</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentRootImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAbstractColorStyleSimpleExtensionGroup() <em>Abstract Color Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractColorStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractContainerSimpleExtensionGroup() <em>Abstract Container Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractContainerSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractFeatureSimpleExtensionGroup() <em>Abstract Feature Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractGeometrySimpleExtensionGroup() <em>Abstract Geometry Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractGeometrySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractLatLonBoxSimpleExtensionGroup() <em>Abstract Lat Lon Box Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractLatLonBoxSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractOverlaySimpleExtensionGroup() <em>Abstract Overlay Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractOverlaySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractStyleSelectorSimpleExtensionGroup() <em>Abstract Style Selector Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractStyleSelectorSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractSubStyleSimpleExtensionGroup() <em>Abstract Sub Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSubStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractTimePrimitiveSimpleExtensionGroup() <em>Abstract Time Primitive Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTimePrimitiveSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAbstractViewSimpleExtensionGroup() <em>Abstract View Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractViewSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAliasSimpleExtensionGroup() <em>Alias Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ALIAS_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAltitudeMode() <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMode()
	 * @generated
	 * @ordered
	 */
	protected static final AltitudeModeEnumType ALTITUDE_MODE_EDEFAULT = AltitudeModeEnumType.CLAMP_TO_GROUND;

	/**
	 * The default value of the '{@link #getBalloonStyleSimpleExtensionGroup() <em>Balloon Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalloonStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBasicLinkSimpleExtensionGroup() <em>Basic Link Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicLinkSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object BASIC_LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BG_COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The default value of the '{@link #getBottomFov() <em>Bottom Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomFov()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_FOV_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getBoundarySimpleExtensionGroup() <em>Boundary Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundarySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object BOUNDARY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCameraSimpleExtensionGroup() <em>Camera Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object CAMERA_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorModeEnumType COLOR_MODE_EDEFAULT = ColorModeEnumType.NORMAL;

	/**
	 * The default value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected static final String COOKIE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> COORDINATES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDisplayMode() <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayModeEnumType DISPLAY_MODE_EDEFAULT = DisplayModeEnumType.DEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocumentSimpleExtensionGroup() <em>Document Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object DOCUMENT_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDrawOrder() <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAW_ORDER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected static final double EAST_EDEFAULT = 180.0;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTRUDE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLY_TO_VIEW_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getFolderSimpleExtensionGroup() <em>Folder Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object FOLDER_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGridOrigin() <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final GridOriginEnumType GRID_ORIGIN_EDEFAULT = GridOriginEnumType.LOWER_LEFT;

	/**
	 * The default value of the '{@link #getGroundOverlaySimpleExtensionGroup() <em>Ground Overlay Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundOverlaySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final double HEADING_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_QUERY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIconStyleSimpleExtensionGroup() <em>Icon Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ICON_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImagePyramidSimpleExtensionGroup() <em>Image Pyramid Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePyramidSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getItemIconSimpleExtensionGroup() <em>Item Icon Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIconSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ITEM_ICON_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final StyleStateEnumType KEY_EDEFAULT = StyleStateEnumType.NORMAL;

	/**
	 * The default value of the '{@link #getKmlSimpleExtensionGroup() <em>Kml Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmlSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object KML_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabelStyleSimpleExtensionGroup() <em>Label Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LABEL_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLatLonAltBoxSimpleExtensionGroup() <em>Lat Lon Alt Box Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonAltBoxSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLatLonBoxSimpleExtensionGroup() <em>Lat Lon Box Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonBoxSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLeftFov() <em>Left Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFov()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_FOV_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLinearRingSimpleExtensionGroup() <em>Linear Ring Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearRingSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINEAR_RING_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineStringSimpleExtensionGroup() <em>Line String Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStringSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINE_STRING_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineStyleSimpleExtensionGroup() <em>Line Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINE_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLinkDescription() <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLinkSimpleExtensionGroup() <em>Link Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getListItemType() <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItemType()
	 * @generated
	 * @ordered
	 */
	protected static final ListItemTypeEnumType LIST_ITEM_TYPE_EDEFAULT = ListItemTypeEnumType.CHECK;

	/**
	 * The default value of the '{@link #getListStyleSimpleExtensionGroup() <em>List Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LIST_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocationSimpleExtensionGroup() <em>Location Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOCATION_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLodSimpleExtensionGroup() <em>Lod Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLodSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOD_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLookAtSimpleExtensionGroup() <em>Look At Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookAtSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOOK_AT_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_FADE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_LOD_PIXELS_EDEFAULT = -1.0;

	/**
	 * The default value of the '{@link #getMaxSessionLength() <em>Max Session Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSessionLength()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SESSION_LENGTH_EDEFAULT = -1.0;

	/**
	 * The default value of the '{@link #getMaxSnippetLines() <em>Max Snippet Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSnippetLines()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SNIPPET_LINES_EDEFAULT = 2;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_FADE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_LOD_PIXELS_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinRefreshPeriod() <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_REFRESH_PERIOD_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getModelSimpleExtensionGroup() <em>Model Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODEL_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMultiGeometrySimpleExtensionGroup() <em>Multi Geometry Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiGeometrySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNear() <em>Near</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNear()
	 * @generated
	 * @ordered
	 */
	protected static final double NEAR_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getNetworkLinkControlSimpleExtensionGroup() <em>Network Link Control Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkControlSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNetworkLinkSimpleExtensionGroup() <em>Network Link Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object NETWORK_LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected static final double NORTH_EDEFAULT = 180.0;

	/**
	 * The default value of the '{@link #getObjectSimpleExtensionGroup() <em>Object Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getOrientationSimpleExtensionGroup() <em>Orientation Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object ORIENTATION_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getPairSimpleExtensionGroup() <em>Pair Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object PAIR_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPhotoOverlaySimpleExtensionGroup() <em>Photo Overlay Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotoOverlaySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlacemarkSimpleExtensionGroup() <em>Placemark Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacemarkSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object PLACEMARK_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPointSimpleExtensionGroup() <em>Point Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object POINT_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPolygonSimpleExtensionGroup() <em>Polygon Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object POLYGON_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPolyStyleSimpleExtensionGroup() <em>Poly Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object POLY_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double REFRESH_INTERVAL_EDEFAULT = 4.0;

	/**
	 * The default value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final RefreshModeEnumType REFRESH_MODE_EDEFAULT = RefreshModeEnumType.ON_CHANGE;

	/**
	 * The default value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_VISIBILITY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getRegionSimpleExtensionGroup() <em>Region Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object REGION_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResourceMapSimpleExtensionGroup() <em>Resource Map Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMapSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRightFov() <em>Right Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightFov()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_FOV_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The default value of the '{@link #getScaleSimpleExtensionGroup() <em>Scale Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCALE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScreenOverlaySimpleExtensionGroup() <em>Screen Overlay Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenOverlaySimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final ShapeEnumType SHAPE_EDEFAULT = ShapeEnumType.RECTANGLE;

	/**
	 * The default value of the '{@link #getSnippet() <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected static final String SNIPPET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceHref() <em>Source Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHref()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_HREF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected static final double SOUTH_EDEFAULT = -180.0;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final List<ItemIconStateEnumType> STATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStyleMapSimpleExtensionGroup() <em>Style Map Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleMapSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object STYLE_MAP_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStyleSimpleExtensionGroup() <em>Style Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HREF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESSELLATE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] TEXT_COLOR_EDEFAULT = { (byte)0xff, 0x00, 0x00, 0x00 };

	/**
	 * The default value of the '{@link #getTileSize() <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_SIZE_EDEFAULT = 256;

	/**
	 * The default value of the '{@link #getTilt() <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTilt()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getTimeSpanSimpleExtensionGroup() <em>Time Span Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpanSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object TIME_SPAN_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimeStampSimpleExtensionGroup() <em>Time Stamp Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStampSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object TIME_STAMP_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTopFov() <em>Top Fov</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFov()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_FOV_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected static final double VIEW_BOUND_SCALE_EDEFAULT = 1.0;

	/**
	 * The default value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final ViewRefreshModeEnumType VIEW_REFRESH_MODE_EDEFAULT = ViewRefreshModeEnumType.NEVER;

	/**
	 * The default value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected static final double VIEW_REFRESH_TIME_EDEFAULT = 4.0;

	/**
	 * The default value of the '{@link #getViewVolumeSimpleExtensionGroup() <em>View Volume Simple Extension Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewVolumeSimpleExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Object VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBILITY_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected static final double WEST_EDEFAULT = -180.0;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WHEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 1.0;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 1.0;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 1.0;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final double Z_EDEFAULT = 1.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, KMLPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, KMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, KMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractColorStyleType getAbstractColorStyleGroup() {
		return (AbstractColorStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractColorStyleGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractColorStyleGroup(AbstractColorStyleType newAbstractColorStyleGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractColorStyleGroup(), newAbstractColorStyleGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSubStyleType getAbstractSubStyleGroup() {
		return (AbstractSubStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractSubStyleGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSubStyleGroup(AbstractSubStyleType newAbstractSubStyleGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractSubStyleGroup(), newAbstractSubStyleGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractObjectGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractObjectGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObjectGroup(AbstractObjectType newAbstractObjectGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractObjectGroup(), newAbstractObjectGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractColorStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractColorStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractColorStyleObjectExtensionGroup(AbstractObjectType newAbstractColorStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractColorStyleObjectExtensionGroup(), newAbstractColorStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractColorStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractColorStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractContainerType getAbstractContainerGroup() {
		return (AbstractContainerType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractContainerGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractContainerGroup(AbstractContainerType newAbstractContainerGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractContainerGroup(), newAbstractContainerGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractFeatureType getAbstractFeatureGroup() {
		return (AbstractFeatureType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractFeatureGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFeatureGroup(AbstractFeatureType newAbstractFeatureGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractFeatureGroup(), newAbstractFeatureGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractContainerObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractContainerObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractContainerObjectExtensionGroup(AbstractObjectType newAbstractContainerObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractContainerObjectExtensionGroup(), newAbstractContainerObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractContainerSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractContainerSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractFeatureObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractFeatureObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFeatureObjectExtensionGroup(AbstractObjectType newAbstractFeatureObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractFeatureObjectExtensionGroup(), newAbstractFeatureObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractFeatureSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractFeatureSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeometryType getAbstractGeometryGroup() {
		return (AbstractGeometryType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractGeometryGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometryGroup(AbstractGeometryType newAbstractGeometryGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractGeometryGroup(), newAbstractGeometryGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractGeometryObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractGeometryObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeometryObjectExtensionGroup(AbstractObjectType newAbstractGeometryObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractGeometryObjectExtensionGroup(), newAbstractGeometryObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractGeometrySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractGeometrySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractLatLonBoxObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractLatLonBoxObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractLatLonBoxObjectExtensionGroup(AbstractObjectType newAbstractLatLonBoxObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractLatLonBoxObjectExtensionGroup(), newAbstractLatLonBoxObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractLatLonBoxSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractLatLonBoxSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractOverlayType getAbstractOverlayGroup() {
		return (AbstractOverlayType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractOverlayGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractOverlayGroup(AbstractOverlayType newAbstractOverlayGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractOverlayGroup(), newAbstractOverlayGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractOverlayObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractOverlayObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractOverlayObjectExtensionGroup(AbstractObjectType newAbstractOverlayObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractOverlayObjectExtensionGroup(), newAbstractOverlayObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractOverlaySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractOverlaySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractStyleSelectorType getAbstractStyleSelectorGroup() {
		return (AbstractStyleSelectorType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractStyleSelectorGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStyleSelectorGroup(AbstractStyleSelectorType newAbstractStyleSelectorGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractStyleSelectorGroup(), newAbstractStyleSelectorGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractStyleSelectorObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractStyleSelectorObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStyleSelectorObjectExtensionGroup(AbstractObjectType newAbstractStyleSelectorObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractStyleSelectorObjectExtensionGroup(), newAbstractStyleSelectorObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractStyleSelectorSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractStyleSelectorSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractSubStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractSubStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSubStyleObjectExtensionGroup(AbstractObjectType newAbstractSubStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractSubStyleObjectExtensionGroup(), newAbstractSubStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractSubStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractSubStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTimePrimitiveType getAbstractTimePrimitiveGroup() {
		return (AbstractTimePrimitiveType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractTimePrimitiveGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimePrimitiveGroup(AbstractTimePrimitiveType newAbstractTimePrimitiveGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractTimePrimitiveGroup(), newAbstractTimePrimitiveGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractTimePrimitiveObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractTimePrimitiveObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTimePrimitiveObjectExtensionGroup(AbstractObjectType newAbstractTimePrimitiveObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractTimePrimitiveObjectExtensionGroup(), newAbstractTimePrimitiveObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractTimePrimitiveSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractTimePrimitiveSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractViewType getAbstractViewGroup() {
		return (AbstractViewType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractViewGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractViewGroup(AbstractViewType newAbstractViewGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractViewGroup(), newAbstractViewGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAbstractViewObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractViewObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractViewObjectExtensionGroup(AbstractObjectType newAbstractViewObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AbstractViewObjectExtensionGroup(), newAbstractViewObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAbstractViewSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AbstractViewSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Address(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Address(), newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AliasType getAlias() {
		return (AliasType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Alias(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(AliasType newAlias, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Alias(), newAlias, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(AliasType newAlias) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Alias(), newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getAliasObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AliasObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasObjectExtensionGroup(AbstractObjectType newAliasObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AliasObjectExtensionGroup(), newAliasObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAliasSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AliasSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAltitude() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Altitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltitude(double newAltitude) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Altitude(), newAltitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltitudeModeEnumType getAltitudeMode() {
		return (AltitudeModeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AltitudeMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltitudeMode(AltitudeModeEnumType newAltitudeMode) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_AltitudeMode(), newAltitudeMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAltitudeModeGroup() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_AltitudeModeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeModeGroup(EObject newAltitudeModeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_AltitudeModeGroup(), newAltitudeModeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BalloonStyleType getBalloonStyle() {
		return (BalloonStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BalloonStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalloonStyle(BalloonStyleType newBalloonStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_BalloonStyle(), newBalloonStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalloonStyle(BalloonStyleType newBalloonStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_BalloonStyle(), newBalloonStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getBalloonStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BalloonStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalloonStyleObjectExtensionGroup(AbstractObjectType newBalloonStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_BalloonStyleObjectExtensionGroup(), newBalloonStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBalloonStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BalloonStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getBasicLinkObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BasicLinkObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicLinkObjectExtensionGroup(AbstractObjectType newBasicLinkObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_BasicLinkObjectExtensionGroup(), newBasicLinkObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBasicLinkSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BasicLinkSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBegin() {
		return (XMLGregorianCalendar)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Begin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(XMLGregorianCalendar newBegin) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Begin(), newBegin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getBgColor() {
		return (byte[])getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BgColor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBgColor(byte[] newBgColor) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_BgColor(), newBgColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBottomFov() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BottomFov(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBottomFov(double newBottomFov) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_BottomFov(), newBottomFov);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getBoundaryObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BoundaryObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryObjectExtensionGroup(AbstractObjectType newBoundaryObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_BoundaryObjectExtensionGroup(), newBoundaryObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getBoundarySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_BoundarySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CameraType getCamera() {
		return (CameraType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Camera(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamera(CameraType newCamera, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Camera(), newCamera, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCamera(CameraType newCamera) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Camera(), newCamera);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getCameraObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_CameraObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraObjectExtensionGroup(AbstractObjectType newCameraObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_CameraObjectExtensionGroup(), newCameraObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCameraSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_CameraSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeType getChange() {
		return (ChangeType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Change(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChange(ChangeType newChange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Change(), newChange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChange(ChangeType newChange) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Change(), newChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getColor() {
		return (byte[])getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Color(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(byte[] newColor) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Color(), newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorModeEnumType getColorMode() {
		return (ColorModeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ColorMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorModeEnumType newColorMode) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ColorMode(), newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookie() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Cookie(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookie(String newCookie) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Cookie(), newCookie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getCoordinates() {
		return (List<String>)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Coordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinates(List<String> newCoordinates) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Coordinates(), newCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateType getCreate() {
		return (CreateType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Create(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreate(CreateType newCreate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Create(), newCreate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreate(CreateType newCreate) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Create(), newCreate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getData() {
		return (DataType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Data(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataType newData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Data(), newData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(DataType newData) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Data(), newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getDataExtension() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_DataExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExtension(EObject newDataExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_DataExtension(), newDataExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteType getDelete() {
		return (DeleteType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Delete(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(DeleteType newDelete, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Delete(), newDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelete(DeleteType newDelete) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Delete(), newDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayModeEnumType getDisplayMode() {
		return (DisplayModeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_DisplayMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayMode(DisplayModeEnumType newDisplayMode) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_DisplayMode(), newDisplayMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_DisplayName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_DisplayName(), newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType getDocument() {
		return (DocumentType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Document(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(DocumentType newDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Document(), newDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocument(DocumentType newDocument) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Document(), newDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getDocumentObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_DocumentObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentObjectExtensionGroup(AbstractObjectType newDocumentObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_DocumentObjectExtensionGroup(), newDocumentObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDocumentSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_DocumentSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDrawOrder() {
		return (Integer)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_DrawOrder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrawOrder(int newDrawOrder) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_DrawOrder(), newDrawOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEast() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_East(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEast(double newEast) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_East(), newEast);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEnd() {
		return (XMLGregorianCalendar)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_End(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(XMLGregorianCalendar newEnd) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_End(), newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getExpires() {
		return (XMLGregorianCalendar)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Expires(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(XMLGregorianCalendar newExpires) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Expires(), newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedDataType getExtendedData() {
		return (ExtendedDataType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ExtendedData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedData(ExtendedDataType newExtendedData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ExtendedData(), newExtendedData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedData(ExtendedDataType newExtendedData) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ExtendedData(), newExtendedData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExtrude() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Extrude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtrude(boolean newExtrude) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Extrude(), newExtrude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFill() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Fill(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFill(boolean newFill) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Fill(), newFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlyToView() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_FlyToView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlyToView(boolean newFlyToView) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_FlyToView(), newFlyToView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderType getFolder() {
		return (FolderType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Folder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(FolderType newFolder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Folder(), newFolder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolder(FolderType newFolder) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Folder(), newFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getFolderObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_FolderObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolderObjectExtensionGroup(AbstractObjectType newFolderObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_FolderObjectExtensionGroup(), newFolderObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFolderSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_FolderSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridOriginEnumType getGridOrigin() {
		return (GridOriginEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_GridOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGridOrigin(GridOriginEnumType newGridOrigin) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_GridOrigin(), newGridOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundOverlayType getGroundOverlay() {
		return (GroundOverlayType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_GroundOverlay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundOverlay(GroundOverlayType newGroundOverlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_GroundOverlay(), newGroundOverlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroundOverlay(GroundOverlayType newGroundOverlay) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_GroundOverlay(), newGroundOverlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getGroundOverlayObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_GroundOverlayObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundOverlayObjectExtensionGroup(AbstractObjectType newGroundOverlayObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_GroundOverlayObjectExtensionGroup(), newGroundOverlayObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getGroundOverlaySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_GroundOverlaySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeading() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Heading(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeading(double newHeading) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Heading(), newHeading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getHotSpot() {
		return (Vec2Type)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_HotSpot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHotSpot(Vec2Type newHotSpot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_HotSpot(), newHotSpot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHotSpot(Vec2Type newHotSpot) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_HotSpot(), newHotSpot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Href(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Href(), newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpQuery() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_HttpQuery(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpQuery(String newHttpQuery) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_HttpQuery(), newHttpQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getIcon() {
		return (LinkType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Icon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(LinkType newIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Icon(), newIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(LinkType newIcon) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Icon(), newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IconStyleType getIconStyle() {
		return (IconStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_IconStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconStyle(IconStyleType newIconStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_IconStyle(), newIconStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconStyle(IconStyleType newIconStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_IconStyle(), newIconStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getIconStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_IconStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconStyleObjectExtensionGroup(AbstractObjectType newIconStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_IconStyleObjectExtensionGroup(), newIconStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getIconStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_IconStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagePyramidType getImagePyramid() {
		return (ImagePyramidType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ImagePyramid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePyramid(ImagePyramidType newImagePyramid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ImagePyramid(), newImagePyramid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagePyramid(ImagePyramidType newImagePyramid) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ImagePyramid(), newImagePyramid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getImagePyramidObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ImagePyramidObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePyramidObjectExtensionGroup(AbstractObjectType newImagePyramidObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ImagePyramidObjectExtensionGroup(), newImagePyramidObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImagePyramidSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ImagePyramidSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType getInnerBoundaryIs() {
		return (BoundaryType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBoundaryIs(BoundaryType newInnerBoundaryIs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(), newInnerBoundaryIs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerBoundaryIs(BoundaryType newInnerBoundaryIs) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(), newInnerBoundaryIs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIconType getItemIcon() {
		return (ItemIconType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ItemIcon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemIcon(ItemIconType newItemIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ItemIcon(), newItemIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIcon(ItemIconType newItemIcon) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ItemIcon(), newItemIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getItemIconObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ItemIconObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemIconObjectExtensionGroup(AbstractObjectType newItemIconObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ItemIconObjectExtensionGroup(), newItemIconObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getItemIconSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ItemIconSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleStateEnumType getKey() {
		return (StyleStateEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Key(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(StyleStateEnumType newKey) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Key(), newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KmlType getKml() {
		return (KmlType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Kml(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKml(KmlType newKml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Kml(), newKml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKml(KmlType newKml) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Kml(), newKml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getKmlObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_KmlObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKmlObjectExtensionGroup(AbstractObjectType newKmlObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_KmlObjectExtensionGroup(), newKmlObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getKmlSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_KmlSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyleType getLabelStyle() {
		return (LabelStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LabelStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle(LabelStyleType newLabelStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LabelStyle(), newLabelStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelStyle(LabelStyleType newLabelStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LabelStyle(), newLabelStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLabelStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LabelStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyleObjectExtensionGroup(AbstractObjectType newLabelStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LabelStyleObjectExtensionGroup(), newLabelStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLabelStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LabelStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLatitude() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Latitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(double newLatitude) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Latitude(), newLatitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLonAltBoxType getLatLonAltBox() {
		return (LatLonAltBoxType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LatLonAltBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonAltBox(LatLonAltBoxType newLatLonAltBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LatLonAltBox(), newLatLonAltBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatLonAltBox(LatLonAltBoxType newLatLonAltBox) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LatLonAltBox(), newLatLonAltBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLatLonAltBoxObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LatLonAltBoxObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonAltBoxObjectExtensionGroup(AbstractObjectType newLatLonAltBoxObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LatLonAltBoxObjectExtensionGroup(), newLatLonAltBoxObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLatLonAltBoxSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LatLonAltBoxSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLonBoxType getLatLonBox() {
		return (LatLonBoxType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LatLonBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonBox(LatLonBoxType newLatLonBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LatLonBox(), newLatLonBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatLonBox(LatLonBoxType newLatLonBox) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LatLonBox(), newLatLonBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLatLonBoxObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LatLonBoxObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonBoxObjectExtensionGroup(AbstractObjectType newLatLonBoxObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LatLonBoxObjectExtensionGroup(), newLatLonBoxObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLatLonBoxSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LatLonBoxSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLeftFov() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LeftFov(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftFov(double newLeftFov) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LeftFov(), newLeftFov);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearRingType getLinearRing() {
		return (LinearRingType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinearRing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearRing(LinearRingType newLinearRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LinearRing(), newLinearRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearRing(LinearRingType newLinearRing) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LinearRing(), newLinearRing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLinearRingObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinearRingObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearRingObjectExtensionGroup(AbstractObjectType newLinearRingObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LinearRingObjectExtensionGroup(), newLinearRingObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLinearRingSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinearRingSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringType getLineString() {
		return (LineStringType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LineString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineString(LineStringType newLineString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LineString(), newLineString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineString(LineStringType newLineString) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LineString(), newLineString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLineStringObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LineStringObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStringObjectExtensionGroup(AbstractObjectType newLineStringObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LineStringObjectExtensionGroup(), newLineStringObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLineStringSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LineStringSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyleType getLineStyle() {
		return (LineStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LineStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyle(LineStyleType newLineStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LineStyle(), newLineStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineStyle(LineStyleType newLineStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LineStyle(), newLineStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLineStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LineStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyleObjectExtensionGroup(AbstractObjectType newLineStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LineStyleObjectExtensionGroup(), newLineStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLineStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LineStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLink() {
		return (LinkType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Link(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Link(), newLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(LinkType newLink) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Link(), newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkDescription() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinkDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkDescription(String newLinkDescription) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LinkDescription(), newLinkDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkName() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinkName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkName(String newLinkName) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LinkName(), newLinkName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLinkObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinkObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkObjectExtensionGroup(AbstractObjectType newLinkObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LinkObjectExtensionGroup(), newLinkObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLinkSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinkSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnippetType getLinkSnippet() {
		return (SnippetType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LinkSnippet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkSnippet(SnippetType newLinkSnippet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LinkSnippet(), newLinkSnippet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkSnippet(SnippetType newLinkSnippet) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LinkSnippet(), newLinkSnippet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItemTypeEnumType getListItemType() {
		return (ListItemTypeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ListItemType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListItemType(ListItemTypeEnumType newListItemType) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ListItemType(), newListItemType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStyleType getListStyle() {
		return (ListStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ListStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyle(ListStyleType newListStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ListStyle(), newListStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListStyle(ListStyleType newListStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ListStyle(), newListStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getListStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ListStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyleObjectExtensionGroup(AbstractObjectType newListStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ListStyleObjectExtensionGroup(), newListStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getListStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ListStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationType getLocation() {
		return (LocationType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(LocationType newLocation) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLocationObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LocationObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationObjectExtensionGroup(AbstractObjectType newLocationObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LocationObjectExtensionGroup(), newLocationObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLocationSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LocationSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LodType getLod() {
		return (LodType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Lod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod(LodType newLod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Lod(), newLod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLod(LodType newLod) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Lod(), newLod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLodObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LodObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLodObjectExtensionGroup(AbstractObjectType newLodObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LodObjectExtensionGroup(), newLodObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLodSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LodSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLongitude() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Longitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(double newLongitude) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Longitude(), newLongitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LookAtType getLookAt() {
		return (LookAtType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LookAt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookAt(LookAtType newLookAt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LookAt(), newLookAt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLookAt(LookAtType newLookAt) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_LookAt(), newLookAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getLookAtObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LookAtObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookAtObjectExtensionGroup(AbstractObjectType newLookAtObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_LookAtObjectExtensionGroup(), newLookAtObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLookAtSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_LookAtSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxAltitude() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxAltitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAltitude(double newMaxAltitude) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxAltitude(), newMaxAltitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxFadeExtent() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxFadeExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxFadeExtent(double newMaxFadeExtent) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxFadeExtent(), newMaxFadeExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxHeight() {
		return (Integer)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHeight(int newMaxHeight) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxHeight(), newMaxHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxLodPixels() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxLodPixels(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLodPixels(double newMaxLodPixels) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxLodPixels(), newMaxLodPixels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxSessionLength() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxSessionLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSessionLength(double newMaxSessionLength) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxSessionLength(), newMaxSessionLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSnippetLines() {
		return (Integer)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxSnippetLines(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSnippetLines(int newMaxSnippetLines) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxSnippetLines(), newMaxSnippetLines);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxWidth() {
		return (Integer)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MaxWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWidth(int newMaxWidth) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MaxWidth(), newMaxWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Message(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Message(), newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType getMetadata() {
		return (MetadataType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Metadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Metadata(), newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(MetadataType newMetadata) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Metadata(), newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinAltitude() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MinAltitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAltitude(double newMinAltitude) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MinAltitude(), newMinAltitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinFadeExtent() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MinFadeExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinFadeExtent(double newMinFadeExtent) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MinFadeExtent(), newMinFadeExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinLodPixels() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MinLodPixels(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLodPixels(double newMinLodPixels) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MinLodPixels(), newMinLodPixels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinRefreshPeriod() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MinRefreshPeriod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRefreshPeriod(double newMinRefreshPeriod) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MinRefreshPeriod(), newMinRefreshPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelType getModel() {
		return (ModelType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Model(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Model(), newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(ModelType newModel) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Model(), newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getModelObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ModelObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelObjectExtensionGroup(AbstractObjectType newModelObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ModelObjectExtensionGroup(), newModelObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getModelSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ModelSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiGeometryType getMultiGeometry() {
		return (MultiGeometryType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MultiGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometry(MultiGeometryType newMultiGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_MultiGeometry(), newMultiGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiGeometry(MultiGeometryType newMultiGeometry) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_MultiGeometry(), newMultiGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getMultiGeometryObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MultiGeometryObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometryObjectExtensionGroup(AbstractObjectType newMultiGeometryObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_MultiGeometryObjectExtensionGroup(), newMultiGeometryObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMultiGeometrySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_MultiGeometrySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNear() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Near(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNear(double newNear) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Near(), newNear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLinkType getNetworkLink() {
		return (NetworkLinkType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLink(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLink(NetworkLinkType newNetworkLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLink(), newNetworkLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkLink(NetworkLinkType newNetworkLink) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLink(), newNetworkLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLinkControlType getNetworkLinkControl() {
		return (NetworkLinkControlType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkControl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLinkControl(NetworkLinkControlType newNetworkLinkControl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkControl(), newNetworkLinkControl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkLinkControl(NetworkLinkControlType newNetworkLinkControl) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkControl(), newNetworkLinkControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getNetworkLinkControlObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkControlObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLinkControlObjectExtensionGroup(AbstractObjectType newNetworkLinkControlObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkControlObjectExtensionGroup(), newNetworkLinkControlObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNetworkLinkControlSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkControlSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getNetworkLinkObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLinkObjectExtensionGroup(AbstractObjectType newNetworkLinkObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkObjectExtensionGroup(), newNetworkLinkObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNetworkLinkSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_NetworkLinkSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNorth() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_North(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNorth(double newNorth) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_North(), newNorth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getObjectSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ObjectSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOpen() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Open(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen(boolean newOpen) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Open(), newOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType getOrientation() {
		return (OrientationType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Orientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Orientation(), newOrientation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(OrientationType newOrientation) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Orientation(), newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getOrientationObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_OrientationObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationObjectExtensionGroup(AbstractObjectType newOrientationObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_OrientationObjectExtensionGroup(), newOrientationObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOrientationSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_OrientationSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType getOuterBoundaryIs() {
		return (BoundaryType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundaryIs(BoundaryType newOuterBoundaryIs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(), newOuterBoundaryIs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterBoundaryIs(BoundaryType newOuterBoundaryIs) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(), newOuterBoundaryIs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOutline() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Outline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutline(boolean newOutline) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Outline(), newOutline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getOverlayXY() {
		return (Vec2Type)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_OverlayXY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlayXY(Vec2Type newOverlayXY, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_OverlayXY(), newOverlayXY, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlayXY(Vec2Type newOverlayXY) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_OverlayXY(), newOverlayXY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PairType getPair() {
		return (PairType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Pair(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPair(PairType newPair, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Pair(), newPair, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPair(PairType newPair) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Pair(), newPair);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getPairObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PairObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPairObjectExtensionGroup(AbstractObjectType newPairObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PairObjectExtensionGroup(), newPairObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPairSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PairSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhoneNumber() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PhoneNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(String newPhoneNumber) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_PhoneNumber(), newPhoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotoOverlayType getPhotoOverlay() {
		return (PhotoOverlayType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PhotoOverlay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhotoOverlay(PhotoOverlayType newPhotoOverlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PhotoOverlay(), newPhotoOverlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhotoOverlay(PhotoOverlayType newPhotoOverlay) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_PhotoOverlay(), newPhotoOverlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getPhotoOverlayObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PhotoOverlayObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhotoOverlayObjectExtensionGroup(AbstractObjectType newPhotoOverlayObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PhotoOverlayObjectExtensionGroup(), newPhotoOverlayObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPhotoOverlaySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PhotoOverlaySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacemarkType getPlacemark() {
		return (PlacemarkType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Placemark(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacemark(PlacemarkType newPlacemark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Placemark(), newPlacemark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacemark(PlacemarkType newPlacemark) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Placemark(), newPlacemark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getPlacemarkObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PlacemarkObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacemarkObjectExtensionGroup(AbstractObjectType newPlacemarkObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PlacemarkObjectExtensionGroup(), newPlacemarkObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPlacemarkSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PlacemarkSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getPoint() {
		return (PointType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Point(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Point(), newPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoint(PointType newPoint) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Point(), newPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getPointObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PointObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointObjectExtensionGroup(AbstractObjectType newPointObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PointObjectExtensionGroup(), newPointObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPointSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PointSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Polygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getPolygonObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PolygonObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonObjectExtensionGroup(AbstractObjectType newPolygonObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PolygonObjectExtensionGroup(), newPolygonObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPolygonSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PolygonSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolyStyleType getPolyStyle() {
		return (PolyStyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PolyStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyStyle(PolyStyleType newPolyStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PolyStyle(), newPolyStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolyStyle(PolyStyleType newPolyStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_PolyStyle(), newPolyStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getPolyStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PolyStyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyStyleObjectExtensionGroup(AbstractObjectType newPolyStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_PolyStyleObjectExtensionGroup(), newPolyStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPolyStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_PolyStyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRange() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Range(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(double newRange) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Range(), newRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRefreshInterval() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RefreshInterval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshInterval(double newRefreshInterval) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_RefreshInterval(), newRefreshInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefreshModeEnumType getRefreshMode() {
		return (RefreshModeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RefreshMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshMode(RefreshModeEnumType newRefreshMode) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_RefreshMode(), newRefreshMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRefreshVisibility() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RefreshVisibility(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshVisibility(boolean newRefreshVisibility) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_RefreshVisibility(), newRefreshVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionType getRegion() {
		return (RegionType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Region(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(RegionType newRegion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Region(), newRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(RegionType newRegion) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Region(), newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getRegionObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RegionObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionObjectExtensionGroup(AbstractObjectType newRegionObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_RegionObjectExtensionGroup(), newRegionObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRegionSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RegionSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMapType getResourceMap() {
		return (ResourceMapType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ResourceMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceMap(ResourceMapType newResourceMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ResourceMap(), newResourceMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceMap(ResourceMapType newResourceMap) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ResourceMap(), newResourceMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getResourceMapObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ResourceMapObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceMapObjectExtensionGroup(AbstractObjectType newResourceMapObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ResourceMapObjectExtensionGroup(), newResourceMapObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getResourceMapSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ResourceMapSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRightFov() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RightFov(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightFov(double newRightFov) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_RightFov(), newRightFov);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRoll() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Roll(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoll(double newRoll) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Roll(), newRoll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotation() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Rotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(double newRotation) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Rotation(), newRotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getRotationXY() {
		return (Vec2Type)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_RotationXY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationXY(Vec2Type newRotationXY, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_RotationXY(), newRotationXY, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotationXY(Vec2Type newRotationXY) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_RotationXY(), newRotationXY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScale() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Scale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(double newScale) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Scale(), newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScaleType getScale1() {
		return (ScaleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Scale1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale1(ScaleType newScale1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Scale1(), newScale1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale1(ScaleType newScale1) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Scale1(), newScale1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getScaleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ScaleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleObjectExtensionGroup(AbstractObjectType newScaleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ScaleObjectExtensionGroup(), newScaleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getScaleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ScaleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaType getSchema() {
		return (SchemaType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Schema(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(SchemaType newSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Schema(), newSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(SchemaType newSchema) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Schema(), newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaDataType getSchemaData() {
		return (SchemaDataType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SchemaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaData(SchemaDataType newSchemaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_SchemaData(), newSchemaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaData(SchemaDataType newSchemaData) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_SchemaData(), newSchemaData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getSchemaDataExtension() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SchemaDataExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaDataExtension(EObject newSchemaDataExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_SchemaDataExtension(), newSchemaDataExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getSchemaExtension() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SchemaExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemaExtension(EObject newSchemaExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_SchemaExtension(), newSchemaExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenOverlayType getScreenOverlay() {
		return (ScreenOverlayType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ScreenOverlay(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenOverlay(ScreenOverlayType newScreenOverlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ScreenOverlay(), newScreenOverlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenOverlay(ScreenOverlayType newScreenOverlay) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ScreenOverlay(), newScreenOverlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getScreenOverlayObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ScreenOverlayObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenOverlayObjectExtensionGroup(AbstractObjectType newScreenOverlayObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ScreenOverlayObjectExtensionGroup(), newScreenOverlayObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getScreenOverlaySimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ScreenOverlaySimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getScreenXY() {
		return (Vec2Type)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ScreenXY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenXY(Vec2Type newScreenXY, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ScreenXY(), newScreenXY, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenXY(Vec2Type newScreenXY) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ScreenXY(), newScreenXY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShapeEnumType getShape() {
		return (ShapeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Shape(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShape(ShapeEnumType newShape) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Shape(), newShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleDataType getSimpleData() {
		return (SimpleDataType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SimpleData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleData(SimpleDataType newSimpleData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_SimpleData(), newSimpleData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleData(SimpleDataType newSimpleData) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_SimpleData(), newSimpleData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFieldType getSimpleField() {
		return (SimpleFieldType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SimpleField(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleField(SimpleFieldType newSimpleField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_SimpleField(), newSimpleField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleField(SimpleFieldType newSimpleField) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_SimpleField(), newSimpleField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getSimpleFieldExtension() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SimpleFieldExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleFieldExtension(EObject newSimpleFieldExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_SimpleFieldExtension(), newSimpleFieldExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type getSize() {
		return (Vec2Type)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Size(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Vec2Type newSize, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Size(), newSize, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Vec2Type newSize) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Size(), newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSnippet() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Snippet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnippet(String newSnippet) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Snippet(), newSnippet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnippetType getSnippet1() {
		return (SnippetType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Snippet1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnippet1(SnippetType newSnippet1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Snippet1(), newSnippet1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnippet1(SnippetType newSnippet1) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Snippet1(), newSnippet1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceHref() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_SourceHref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceHref(String newSourceHref) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_SourceHref(), newSourceHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSouth() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_South(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSouth(double newSouth) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_South(), newSouth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemIconStateEnumType> getState() {
		return (List<ItemIconStateEnumType>)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_State(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(List<ItemIconStateEnumType> newState) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_State(), newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType getStyle() {
		return (StyleType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Style(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(StyleType newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Style(), newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(StyleType newStyle) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Style(), newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleMapType getStyleMap() {
		return (StyleMapType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_StyleMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleMap(StyleMapType newStyleMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_StyleMap(), newStyleMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleMap(StyleMapType newStyleMap) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_StyleMap(), newStyleMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getStyleMapObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_StyleMapObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleMapObjectExtensionGroup(AbstractObjectType newStyleMapObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_StyleMapObjectExtensionGroup(), newStyleMapObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyleMapSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_StyleMapSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getStyleObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_StyleObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleObjectExtensionGroup(AbstractObjectType newStyleObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_StyleObjectExtensionGroup(), newStyleObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getStyleSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_StyleSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleUrl() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_StyleUrl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleUrl(String newStyleUrl) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_StyleUrl(), newStyleUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetHref() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TargetHref(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetHref(String newTargetHref) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_TargetHref(), newTargetHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTessellate() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Tessellate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTessellate(boolean newTessellate) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Tessellate(), newTessellate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Text(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Text(), newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getTextColor() {
		return (byte[])getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TextColor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(byte[] newTextColor) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_TextColor(), newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTileSize() {
		return (Integer)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TileSize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileSize(int newTileSize) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_TileSize(), newTileSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTilt() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Tilt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTilt(double newTilt) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Tilt(), newTilt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSpanType getTimeSpan() {
		return (TimeSpanType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TimeSpan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSpan(TimeSpanType newTimeSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_TimeSpan(), newTimeSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeSpan(TimeSpanType newTimeSpan) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_TimeSpan(), newTimeSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getTimeSpanObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TimeSpanObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSpanObjectExtensionGroup(AbstractObjectType newTimeSpanObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_TimeSpanObjectExtensionGroup(), newTimeSpanObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTimeSpanSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TimeSpanSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStampType getTimeStamp() {
		return (TimeStampType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TimeStamp(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(TimeStampType newTimeStamp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_TimeStamp(), newTimeStamp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(TimeStampType newTimeStamp) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_TimeStamp(), newTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getTimeStampObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TimeStampObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStampObjectExtensionGroup(AbstractObjectType newTimeStampObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_TimeStampObjectExtensionGroup(), newTimeStampObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTimeStampSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TimeStampSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTopFov() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_TopFov(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopFov(double newTopFov) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_TopFov(), newTopFov);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType getUpdate() {
		return (UpdateType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Update(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateType newUpdate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Update(), newUpdate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(UpdateType newUpdate) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Update(), newUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getUpdateExtensionGroup() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_UpdateExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateExtensionGroup(EObject newUpdateExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_UpdateExtensionGroup(), newUpdateExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getUpdateOpExtensionGroup() {
		return (EObject)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_UpdateOpExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateOpExtensionGroup(EObject newUpdateOpExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_UpdateOpExtensionGroup(), newUpdateOpExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getUrl() {
		return (LinkType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Url(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(LinkType newUrl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_Url(), newUrl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(LinkType newUrl) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Url(), newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Value(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Value(), newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getViewBoundScale() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewBoundScale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewBoundScale(double newViewBoundScale) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ViewBoundScale(), newViewBoundScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewFormat() {
		return (String)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewFormat(String newViewFormat) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ViewFormat(), newViewFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewRefreshModeEnumType getViewRefreshMode() {
		return (ViewRefreshModeEnumType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewRefreshMode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRefreshMode(ViewRefreshModeEnumType newViewRefreshMode) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ViewRefreshMode(), newViewRefreshMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getViewRefreshTime() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewRefreshTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRefreshTime(double newViewRefreshTime) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ViewRefreshTime(), newViewRefreshTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewVolumeType getViewVolume() {
		return (ViewVolumeType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewVolume(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewVolume(ViewVolumeType newViewVolume, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ViewVolume(), newViewVolume, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewVolume(ViewVolumeType newViewVolume) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_ViewVolume(), newViewVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractObjectType getViewVolumeObjectExtensionGroup() {
		return (AbstractObjectType)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewVolumeObjectExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewVolumeObjectExtensionGroup(AbstractObjectType newViewVolumeObjectExtensionGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KMLPackage.eINSTANCE.getDocumentRoot_ViewVolumeObjectExtensionGroup(), newViewVolumeObjectExtensionGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getViewVolumeSimpleExtensionGroup() {
		return getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_ViewVolumeSimpleExtensionGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisibility() {
		return (Boolean)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Visibility(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(boolean newVisibility) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Visibility(), newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWest() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_West(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWest(double newWest) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_West(), newWest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getWhen() {
		return (XMLGregorianCalendar)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_When(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(XMLGregorianCalendar newWhen) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_When(), newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Width(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Width(), newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getX() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_X(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(double newX) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_X(), newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getY() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Y(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(double newY) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Y(), newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getZ() {
		return (Double)getMixed().get(KMLPackage.eINSTANCE.getDocumentRoot_Z(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZ(double newZ) {
		((FeatureMap.Internal)getMixed()).set(KMLPackage.eINSTANCE.getDocumentRoot_Z(), newZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_GROUP:
				return basicSetAbstractColorStyleGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_GROUP:
				return basicSetAbstractSubStyleGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_GROUP:
				return basicSetAbstractObjectGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractColorStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_GROUP:
				return basicSetAbstractContainerGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_GROUP:
				return basicSetAbstractFeatureGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractContainerObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractFeatureObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_GROUP:
				return basicSetAbstractGeometryGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractGeometryObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractLatLonBoxObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_GROUP:
				return basicSetAbstractOverlayGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractOverlayObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_GROUP:
				return basicSetAbstractStyleSelectorGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractStyleSelectorObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractSubStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_GROUP:
				return basicSetAbstractTimePrimitiveGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractTimePrimitiveObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_GROUP:
				return basicSetAbstractViewGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP:
				return basicSetAbstractViewObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ALIAS:
				return basicSetAlias(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ALIAS_OBJECT_EXTENSION_GROUP:
				return basicSetAliasObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE_GROUP:
				return basicSetAltitudeModeGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE:
				return basicSetBalloonStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetBalloonStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__BASIC_LINK_OBJECT_EXTENSION_GROUP:
				return basicSetBasicLinkObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__BOUNDARY_OBJECT_EXTENSION_GROUP:
				return basicSetBoundaryObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__CAMERA:
				return basicSetCamera(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__CAMERA_OBJECT_EXTENSION_GROUP:
				return basicSetCameraObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__CHANGE:
				return basicSetChange(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__CREATE:
				return basicSetCreate(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__DATA:
				return basicSetData(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__DATA_EXTENSION:
				return basicSetDataExtension(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__DELETE:
				return basicSetDelete(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT_OBJECT_EXTENSION_GROUP:
				return basicSetDocumentObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__EXTENDED_DATA:
				return basicSetExtendedData(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__FOLDER:
				return basicSetFolder(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__FOLDER_OBJECT_EXTENSION_GROUP:
				return basicSetFolderObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY:
				return basicSetGroundOverlay(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP:
				return basicSetGroundOverlayObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__HOT_SPOT:
				return basicSetHotSpot(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ICON:
				return basicSetIcon(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE:
				return basicSetIconStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetIconStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID:
				return basicSetImagePyramid(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP:
				return basicSetImagePyramidObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				return basicSetInnerBoundaryIs(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON:
				return basicSetItemIcon(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON_OBJECT_EXTENSION_GROUP:
				return basicSetItemIconObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__KML:
				return basicSetKml(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__KML_OBJECT_EXTENSION_GROUP:
				return basicSetKmlObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE:
				return basicSetLabelStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetLabelStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				return basicSetLatLonAltBox(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP:
				return basicSetLatLonAltBoxObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX:
				return basicSetLatLonBox(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return basicSetLatLonBoxObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING:
				return basicSetLinearRing(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING_OBJECT_EXTENSION_GROUP:
				return basicSetLinearRingObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING:
				return basicSetLineString(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING_OBJECT_EXTENSION_GROUP:
				return basicSetLineStringObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE:
				return basicSetLineStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetLineStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINK:
				return basicSetLink(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINK_OBJECT_EXTENSION_GROUP:
				return basicSetLinkObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LINK_SNIPPET:
				return basicSetLinkSnippet(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE:
				return basicSetListStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetListStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LOCATION_OBJECT_EXTENSION_GROUP:
				return basicSetLocationObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LOD:
				return basicSetLod(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LOD_OBJECT_EXTENSION_GROUP:
				return basicSetLodObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT:
				return basicSetLookAt(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT_OBJECT_EXTENSION_GROUP:
				return basicSetLookAtObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__METADATA:
				return basicSetMetadata(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__MODEL_OBJECT_EXTENSION_GROUP:
				return basicSetModelObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return basicSetMultiGeometry(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return basicSetMultiGeometryObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK:
				return basicSetNetworkLink(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL:
				return basicSetNetworkLinkControl(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP:
				return basicSetNetworkLinkControlObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_OBJECT_EXTENSION_GROUP:
				return basicSetNetworkLinkObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION_OBJECT_EXTENSION_GROUP:
				return basicSetOrientationObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				return basicSetOuterBoundaryIs(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__OVERLAY_XY:
				return basicSetOverlayXY(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__PAIR:
				return basicSetPair(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__PAIR_OBJECT_EXTENSION_GROUP:
				return basicSetPairObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY:
				return basicSetPhotoOverlay(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP:
				return basicSetPhotoOverlayObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK:
				return basicSetPlacemark(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK_OBJECT_EXTENSION_GROUP:
				return basicSetPlacemarkObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__POINT:
				return basicSetPoint(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__POINT_OBJECT_EXTENSION_GROUP:
				return basicSetPointObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__POLYGON_OBJECT_EXTENSION_GROUP:
				return basicSetPolygonObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE:
				return basicSetPolyStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetPolyStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__REGION:
				return basicSetRegion(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__REGION_OBJECT_EXTENSION_GROUP:
				return basicSetRegionObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP:
				return basicSetResourceMap(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP_OBJECT_EXTENSION_GROUP:
				return basicSetResourceMapObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__ROTATION_XY:
				return basicSetRotationXY(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCALE1:
				return basicSetScale1(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCALE_OBJECT_EXTENSION_GROUP:
				return basicSetScaleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCHEMA:
				return basicSetSchema(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA:
				return basicSetSchemaData(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA_EXTENSION:
				return basicSetSchemaDataExtension(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_EXTENSION:
				return basicSetSchemaExtension(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY:
				return basicSetScreenOverlay(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP:
				return basicSetScreenOverlayObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SCREEN_XY:
				return basicSetScreenXY(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_DATA:
				return basicSetSimpleData(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD:
				return basicSetSimpleField(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD_EXTENSION:
				return basicSetSimpleFieldExtension(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SIZE:
				return basicSetSize(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__SNIPPET1:
				return basicSetSnippet1(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP:
				return basicSetStyleMap(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP_OBJECT_EXTENSION_GROUP:
				return basicSetStyleMapObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__STYLE_OBJECT_EXTENSION_GROUP:
				return basicSetStyleObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN:
				return basicSetTimeSpan(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN_OBJECT_EXTENSION_GROUP:
				return basicSetTimeSpanObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP_OBJECT_EXTENSION_GROUP:
				return basicSetTimeStampObjectExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__UPDATE:
				return basicSetUpdate(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__UPDATE_EXTENSION_GROUP:
				return basicSetUpdateExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__UPDATE_OP_EXTENSION_GROUP:
				return basicSetUpdateOpExtensionGroup(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__URL:
				return basicSetUrl(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME:
				return basicSetViewVolume(null, msgs);
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME_OBJECT_EXTENSION_GROUP:
				return basicSetViewVolumeObjectExtensionGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KMLPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case KMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case KMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_GROUP:
				return getAbstractColorStyleGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_GROUP:
				return getAbstractSubStyleGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_GROUP:
				return getAbstractObjectGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP:
				return getAbstractColorStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP:
				return getAbstractColorStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_GROUP:
				return getAbstractContainerGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP:
				return getAbstractContainerObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP:
				return getAbstractContainerSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP:
				return getAbstractFeatureObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP:
				return getAbstractFeatureSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_GROUP:
				return getAbstractGeometryGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return getAbstractGeometryObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return getAbstractGeometrySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return getAbstractLatLonBoxObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return getAbstractLatLonBoxSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_GROUP:
				return getAbstractOverlayGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getAbstractOverlayObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getAbstractOverlaySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_GROUP:
				return getAbstractStyleSelectorGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP:
				return getAbstractStyleSelectorObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP:
				return getAbstractStyleSelectorSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP:
				return getAbstractSubStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP:
				return getAbstractSubStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_GROUP:
				return getAbstractTimePrimitiveGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP:
				return getAbstractTimePrimitiveObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP:
				return getAbstractTimePrimitiveSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_GROUP:
				return getAbstractViewGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP:
				return getAbstractViewObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP:
				return getAbstractViewSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case KMLPackage.DOCUMENT_ROOT__ALIAS:
				return getAlias();
			case KMLPackage.DOCUMENT_ROOT__ALIAS_OBJECT_EXTENSION_GROUP:
				return getAliasObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ALIAS_SIMPLE_EXTENSION_GROUP:
				return getAliasSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE:
				return getAltitude();
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE:
				return getAltitudeMode();
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup();
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE:
				return getBalloonStyle();
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE_OBJECT_EXTENSION_GROUP:
				return getBalloonStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP:
				return getBalloonStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__BASIC_LINK_OBJECT_EXTENSION_GROUP:
				return getBasicLinkObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__BASIC_LINK_SIMPLE_EXTENSION_GROUP:
				return getBasicLinkSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__BEGIN:
				return getBegin();
			case KMLPackage.DOCUMENT_ROOT__BG_COLOR:
				return getBgColor();
			case KMLPackage.DOCUMENT_ROOT__BOTTOM_FOV:
				return getBottomFov();
			case KMLPackage.DOCUMENT_ROOT__BOUNDARY_OBJECT_EXTENSION_GROUP:
				return getBoundaryObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__BOUNDARY_SIMPLE_EXTENSION_GROUP:
				return getBoundarySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__CAMERA:
				return getCamera();
			case KMLPackage.DOCUMENT_ROOT__CAMERA_OBJECT_EXTENSION_GROUP:
				return getCameraObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__CAMERA_SIMPLE_EXTENSION_GROUP:
				return getCameraSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__CHANGE:
				return getChange();
			case KMLPackage.DOCUMENT_ROOT__COLOR:
				return getColor();
			case KMLPackage.DOCUMENT_ROOT__COLOR_MODE:
				return getColorMode();
			case KMLPackage.DOCUMENT_ROOT__COOKIE:
				return getCookie();
			case KMLPackage.DOCUMENT_ROOT__COORDINATES:
				return getCoordinates();
			case KMLPackage.DOCUMENT_ROOT__CREATE:
				return getCreate();
			case KMLPackage.DOCUMENT_ROOT__DATA:
				return getData();
			case KMLPackage.DOCUMENT_ROOT__DATA_EXTENSION:
				return getDataExtension();
			case KMLPackage.DOCUMENT_ROOT__DELETE:
				return getDelete();
			case KMLPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_MODE:
				return getDisplayMode();
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument();
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT_OBJECT_EXTENSION_GROUP:
				return getDocumentObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT_SIMPLE_EXTENSION_GROUP:
				return getDocumentSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__DRAW_ORDER:
				return getDrawOrder();
			case KMLPackage.DOCUMENT_ROOT__EAST:
				return getEast();
			case KMLPackage.DOCUMENT_ROOT__END:
				return getEnd();
			case KMLPackage.DOCUMENT_ROOT__EXPIRES:
				return getExpires();
			case KMLPackage.DOCUMENT_ROOT__EXTENDED_DATA:
				return getExtendedData();
			case KMLPackage.DOCUMENT_ROOT__EXTRUDE:
				return isExtrude();
			case KMLPackage.DOCUMENT_ROOT__FILL:
				return isFill();
			case KMLPackage.DOCUMENT_ROOT__FLY_TO_VIEW:
				return isFlyToView();
			case KMLPackage.DOCUMENT_ROOT__FOLDER:
				return getFolder();
			case KMLPackage.DOCUMENT_ROOT__FOLDER_OBJECT_EXTENSION_GROUP:
				return getFolderObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__FOLDER_SIMPLE_EXTENSION_GROUP:
				return getFolderSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__GRID_ORIGIN:
				return getGridOrigin();
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY:
				return getGroundOverlay();
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getGroundOverlayObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getGroundOverlaySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__HEADING:
				return getHeading();
			case KMLPackage.DOCUMENT_ROOT__HOT_SPOT:
				return getHotSpot();
			case KMLPackage.DOCUMENT_ROOT__HREF:
				return getHref();
			case KMLPackage.DOCUMENT_ROOT__HTTP_QUERY:
				return getHttpQuery();
			case KMLPackage.DOCUMENT_ROOT__ICON:
				return getIcon();
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE:
				return getIconStyle();
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE_OBJECT_EXTENSION_GROUP:
				return getIconStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE_SIMPLE_EXTENSION_GROUP:
				return getIconStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID:
				return getImagePyramid();
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP:
				return getImagePyramidObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP:
				return getImagePyramidSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs();
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON:
				return getItemIcon();
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON_OBJECT_EXTENSION_GROUP:
				return getItemIconObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON_SIMPLE_EXTENSION_GROUP:
				return getItemIconSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__KEY:
				return getKey();
			case KMLPackage.DOCUMENT_ROOT__KML:
				return getKml();
			case KMLPackage.DOCUMENT_ROOT__KML_OBJECT_EXTENSION_GROUP:
				return getKmlObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__KML_SIMPLE_EXTENSION_GROUP:
				return getKmlSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE:
				return getLabelStyle();
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE_OBJECT_EXTENSION_GROUP:
				return getLabelStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE_SIMPLE_EXTENSION_GROUP:
				return getLabelStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LATITUDE:
				return getLatitude();
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				return getLatLonAltBox();
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP:
				return getLatLonAltBoxObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP:
				return getLatLonAltBoxSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX:
				return getLatLonBox();
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return getLatLonBoxObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return getLatLonBoxSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LEFT_FOV:
				return getLeftFov();
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing();
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING_OBJECT_EXTENSION_GROUP:
				return getLinearRingObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING_SIMPLE_EXTENSION_GROUP:
				return getLinearRingSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING:
				return getLineString();
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING_OBJECT_EXTENSION_GROUP:
				return getLineStringObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING_SIMPLE_EXTENSION_GROUP:
				return getLineStringSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE:
				return getLineStyle();
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE_OBJECT_EXTENSION_GROUP:
				return getLineStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE_SIMPLE_EXTENSION_GROUP:
				return getLineStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINK:
				return getLink();
			case KMLPackage.DOCUMENT_ROOT__LINK_DESCRIPTION:
				return getLinkDescription();
			case KMLPackage.DOCUMENT_ROOT__LINK_NAME:
				return getLinkName();
			case KMLPackage.DOCUMENT_ROOT__LINK_OBJECT_EXTENSION_GROUP:
				return getLinkObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINK_SIMPLE_EXTENSION_GROUP:
				return getLinkSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LINK_SNIPPET:
				return getLinkSnippet();
			case KMLPackage.DOCUMENT_ROOT__LIST_ITEM_TYPE:
				return getListItemType();
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE:
				return getListStyle();
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE_OBJECT_EXTENSION_GROUP:
				return getListStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE_SIMPLE_EXTENSION_GROUP:
				return getListStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case KMLPackage.DOCUMENT_ROOT__LOCATION_OBJECT_EXTENSION_GROUP:
				return getLocationObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LOCATION_SIMPLE_EXTENSION_GROUP:
				return getLocationSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LOD:
				return getLod();
			case KMLPackage.DOCUMENT_ROOT__LOD_OBJECT_EXTENSION_GROUP:
				return getLodObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LOD_SIMPLE_EXTENSION_GROUP:
				return getLodSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LONGITUDE:
				return getLongitude();
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT:
				return getLookAt();
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT_OBJECT_EXTENSION_GROUP:
				return getLookAtObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT_SIMPLE_EXTENSION_GROUP:
				return getLookAtSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__MAX_ALTITUDE:
				return getMaxAltitude();
			case KMLPackage.DOCUMENT_ROOT__MAX_FADE_EXTENT:
				return getMaxFadeExtent();
			case KMLPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				return getMaxHeight();
			case KMLPackage.DOCUMENT_ROOT__MAX_LOD_PIXELS:
				return getMaxLodPixels();
			case KMLPackage.DOCUMENT_ROOT__MAX_SESSION_LENGTH:
				return getMaxSessionLength();
			case KMLPackage.DOCUMENT_ROOT__MAX_SNIPPET_LINES:
				return getMaxSnippetLines();
			case KMLPackage.DOCUMENT_ROOT__MAX_WIDTH:
				return getMaxWidth();
			case KMLPackage.DOCUMENT_ROOT__MESSAGE:
				return getMessage();
			case KMLPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata();
			case KMLPackage.DOCUMENT_ROOT__MIN_ALTITUDE:
				return getMinAltitude();
			case KMLPackage.DOCUMENT_ROOT__MIN_FADE_EXTENT:
				return getMinFadeExtent();
			case KMLPackage.DOCUMENT_ROOT__MIN_LOD_PIXELS:
				return getMinLodPixels();
			case KMLPackage.DOCUMENT_ROOT__MIN_REFRESH_PERIOD:
				return getMinRefreshPeriod();
			case KMLPackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case KMLPackage.DOCUMENT_ROOT__MODEL_OBJECT_EXTENSION_GROUP:
				return getModelObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__MODEL_SIMPLE_EXTENSION_GROUP:
				return getModelSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry();
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return getMultiGeometryObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return getMultiGeometrySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case KMLPackage.DOCUMENT_ROOT__NEAR:
				return getNear();
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK:
				return getNetworkLink();
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL:
				return getNetworkLinkControl();
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP:
				return getNetworkLinkControlObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP:
				return getNetworkLinkControlSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_OBJECT_EXTENSION_GROUP:
				return getNetworkLinkObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_SIMPLE_EXTENSION_GROUP:
				return getNetworkLinkSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__NORTH:
				return getNorth();
			case KMLPackage.DOCUMENT_ROOT__OBJECT_SIMPLE_EXTENSION_GROUP:
				return getObjectSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__OPEN:
				return isOpen();
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation();
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION_OBJECT_EXTENSION_GROUP:
				return getOrientationObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION_SIMPLE_EXTENSION_GROUP:
				return getOrientationSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs();
			case KMLPackage.DOCUMENT_ROOT__OUTLINE:
				return isOutline();
			case KMLPackage.DOCUMENT_ROOT__OVERLAY_XY:
				return getOverlayXY();
			case KMLPackage.DOCUMENT_ROOT__PAIR:
				return getPair();
			case KMLPackage.DOCUMENT_ROOT__PAIR_OBJECT_EXTENSION_GROUP:
				return getPairObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__PAIR_SIMPLE_EXTENSION_GROUP:
				return getPairSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__PHONE_NUMBER:
				return getPhoneNumber();
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY:
				return getPhotoOverlay();
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getPhotoOverlayObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getPhotoOverlaySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK:
				return getPlacemark();
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK_OBJECT_EXTENSION_GROUP:
				return getPlacemarkObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK_SIMPLE_EXTENSION_GROUP:
				return getPlacemarkSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__POINT:
				return getPoint();
			case KMLPackage.DOCUMENT_ROOT__POINT_OBJECT_EXTENSION_GROUP:
				return getPointObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__POINT_SIMPLE_EXTENSION_GROUP:
				return getPointSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case KMLPackage.DOCUMENT_ROOT__POLYGON_OBJECT_EXTENSION_GROUP:
				return getPolygonObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__POLYGON_SIMPLE_EXTENSION_GROUP:
				return getPolygonSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE:
				return getPolyStyle();
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE_OBJECT_EXTENSION_GROUP:
				return getPolyStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE_SIMPLE_EXTENSION_GROUP:
				return getPolyStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__RANGE:
				return getRange();
			case KMLPackage.DOCUMENT_ROOT__REFRESH_INTERVAL:
				return getRefreshInterval();
			case KMLPackage.DOCUMENT_ROOT__REFRESH_MODE:
				return getRefreshMode();
			case KMLPackage.DOCUMENT_ROOT__REFRESH_VISIBILITY:
				return isRefreshVisibility();
			case KMLPackage.DOCUMENT_ROOT__REGION:
				return getRegion();
			case KMLPackage.DOCUMENT_ROOT__REGION_OBJECT_EXTENSION_GROUP:
				return getRegionObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__REGION_SIMPLE_EXTENSION_GROUP:
				return getRegionSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP:
				return getResourceMap();
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP_OBJECT_EXTENSION_GROUP:
				return getResourceMapObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP:
				return getResourceMapSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__RIGHT_FOV:
				return getRightFov();
			case KMLPackage.DOCUMENT_ROOT__ROLL:
				return getRoll();
			case KMLPackage.DOCUMENT_ROOT__ROTATION:
				return getRotation();
			case KMLPackage.DOCUMENT_ROOT__ROTATION_XY:
				return getRotationXY();
			case KMLPackage.DOCUMENT_ROOT__SCALE:
				return getScale();
			case KMLPackage.DOCUMENT_ROOT__SCALE1:
				return getScale1();
			case KMLPackage.DOCUMENT_ROOT__SCALE_OBJECT_EXTENSION_GROUP:
				return getScaleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__SCALE_SIMPLE_EXTENSION_GROUP:
				return getScaleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema();
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA:
				return getSchemaData();
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA_EXTENSION:
				return getSchemaDataExtension();
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_EXTENSION:
				return getSchemaExtension();
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY:
				return getScreenOverlay();
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getScreenOverlayObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return getScreenOverlaySimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__SCREEN_XY:
				return getScreenXY();
			case KMLPackage.DOCUMENT_ROOT__SHAPE:
				return getShape();
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_DATA:
				return getSimpleData();
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD:
				return getSimpleField();
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD_EXTENSION:
				return getSimpleFieldExtension();
			case KMLPackage.DOCUMENT_ROOT__SIZE:
				return getSize();
			case KMLPackage.DOCUMENT_ROOT__SNIPPET:
				return getSnippet();
			case KMLPackage.DOCUMENT_ROOT__SNIPPET1:
				return getSnippet1();
			case KMLPackage.DOCUMENT_ROOT__SOURCE_HREF:
				return getSourceHref();
			case KMLPackage.DOCUMENT_ROOT__SOUTH:
				return getSouth();
			case KMLPackage.DOCUMENT_ROOT__STATE:
				return getState();
			case KMLPackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP:
				return getStyleMap();
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP_OBJECT_EXTENSION_GROUP:
				return getStyleMapObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP_SIMPLE_EXTENSION_GROUP:
				return getStyleMapSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__STYLE_OBJECT_EXTENSION_GROUP:
				return getStyleObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__STYLE_SIMPLE_EXTENSION_GROUP:
				return getStyleSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__STYLE_URL:
				return getStyleUrl();
			case KMLPackage.DOCUMENT_ROOT__TARGET_HREF:
				return getTargetHref();
			case KMLPackage.DOCUMENT_ROOT__TESSELLATE:
				return isTessellate();
			case KMLPackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case KMLPackage.DOCUMENT_ROOT__TEXT_COLOR:
				return getTextColor();
			case KMLPackage.DOCUMENT_ROOT__TILE_SIZE:
				return getTileSize();
			case KMLPackage.DOCUMENT_ROOT__TILT:
				return getTilt();
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN:
				return getTimeSpan();
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN_OBJECT_EXTENSION_GROUP:
				return getTimeSpanObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN_SIMPLE_EXTENSION_GROUP:
				return getTimeSpanSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP:
				return getTimeStamp();
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP_OBJECT_EXTENSION_GROUP:
				return getTimeStampObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP_SIMPLE_EXTENSION_GROUP:
				return getTimeStampSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__TOP_FOV:
				return getTopFov();
			case KMLPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate();
			case KMLPackage.DOCUMENT_ROOT__UPDATE_EXTENSION_GROUP:
				return getUpdateExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__UPDATE_OP_EXTENSION_GROUP:
				return getUpdateOpExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__URL:
				return getUrl();
			case KMLPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case KMLPackage.DOCUMENT_ROOT__VIEW_BOUND_SCALE:
				return getViewBoundScale();
			case KMLPackage.DOCUMENT_ROOT__VIEW_FORMAT:
				return getViewFormat();
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_MODE:
				return getViewRefreshMode();
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_TIME:
				return getViewRefreshTime();
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME:
				return getViewVolume();
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME_OBJECT_EXTENSION_GROUP:
				return getViewVolumeObjectExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP:
				return getViewVolumeSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_ROOT__VISIBILITY:
				return isVisibility();
			case KMLPackage.DOCUMENT_ROOT__WEST:
				return getWest();
			case KMLPackage.DOCUMENT_ROOT__WHEN:
				return getWhen();
			case KMLPackage.DOCUMENT_ROOT__WIDTH:
				return getWidth();
			case KMLPackage.DOCUMENT_ROOT__X:
				return getX();
			case KMLPackage.DOCUMENT_ROOT__Y:
				return getY();
			case KMLPackage.DOCUMENT_ROOT__Z:
				return getZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KMLPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ALIAS:
				setAlias((AliasType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE:
				setAltitudeMode((AltitudeModeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__BEGIN:
				setBegin((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__BG_COLOR:
				setBgColor((byte[])newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__BOTTOM_FOV:
				setBottomFov((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__CAMERA:
				setCamera((CameraType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__CHANGE:
				setChange((ChangeType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__COLOR:
				setColor((byte[])newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__COLOR_MODE:
				setColorMode((ColorModeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__COOKIE:
				setCookie((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__COORDINATES:
				setCoordinates((List<String>)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__CREATE:
				setCreate((CreateType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DATA:
				setData((DataType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_MODE:
				setDisplayMode((DisplayModeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DocumentType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__DRAW_ORDER:
				setDrawOrder((Integer)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__EAST:
				setEast((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__END:
				setEnd((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__EXPIRES:
				setExpires((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__EXTENDED_DATA:
				setExtendedData((ExtendedDataType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__FILL:
				setFill((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__FLY_TO_VIEW:
				setFlyToView((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__FOLDER:
				setFolder((FolderType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__GRID_ORIGIN:
				setGridOrigin((GridOriginEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY:
				setGroundOverlay((GroundOverlayType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__HEADING:
				setHeading((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__HOT_SPOT:
				setHotSpot((Vec2Type)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__HREF:
				setHref((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__HTTP_QUERY:
				setHttpQuery((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ICON:
				setIcon((LinkType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE:
				setIconStyle((IconStyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID:
				setImagePyramid((ImagePyramidType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				setInnerBoundaryIs((BoundaryType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON:
				setItemIcon((ItemIconType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__KEY:
				setKey((StyleStateEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__KML:
				setKml((KmlType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE:
				setLabelStyle((LabelStyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LEFT_FOV:
				setLeftFov((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE:
				setLineStyle((LineStyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK_DESCRIPTION:
				setLinkDescription((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK_NAME:
				setLinkName((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK_SNIPPET:
				setLinkSnippet((SnippetType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LIST_ITEM_TYPE:
				setListItemType((ListItemTypeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE:
				setListStyle((ListStyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LOD:
				setLod((LodType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT:
				setLookAt((LookAtType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_ALTITUDE:
				setMaxAltitude((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_FADE_EXTENT:
				setMaxFadeExtent((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				setMaxHeight((Integer)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_LOD_PIXELS:
				setMaxLodPixels((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_SESSION_LENGTH:
				setMaxSessionLength((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_SNIPPET_LINES:
				setMaxSnippetLines((Integer)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_WIDTH:
				setMaxWidth((Integer)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MESSAGE:
				setMessage((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_ALTITUDE:
				setMinAltitude((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_FADE_EXTENT:
				setMinFadeExtent((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_LOD_PIXELS:
				setMinLodPixels((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_REFRESH_PERIOD:
				setMinRefreshPeriod((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__NEAR:
				setNear((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK:
				setNetworkLink((NetworkLinkType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL:
				setNetworkLinkControl((NetworkLinkControlType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__NORTH:
				setNorth((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__OPEN:
				setOpen((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((BoundaryType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__OUTLINE:
				setOutline((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__OVERLAY_XY:
				setOverlayXY((Vec2Type)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__PAIR:
				setPair((PairType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY:
				setPhotoOverlay((PhotoOverlayType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK:
				setPlacemark((PlacemarkType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__POINT:
				setPoint((PointType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE:
				setPolyStyle((PolyStyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__RANGE:
				setRange((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_INTERVAL:
				setRefreshInterval((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_MODE:
				setRefreshMode((RefreshModeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_VISIBILITY:
				setRefreshVisibility((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__REGION:
				setRegion((RegionType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP:
				setResourceMap((ResourceMapType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__RIGHT_FOV:
				setRightFov((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ROLL:
				setRoll((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ROTATION:
				setRotation((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__ROTATION_XY:
				setRotationXY((Vec2Type)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCALE:
				setScale((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCALE1:
				setScale1((ScaleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((SchemaType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA:
				setSchemaData((SchemaDataType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY:
				setScreenOverlay((ScreenOverlayType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_XY:
				setScreenXY((Vec2Type)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SHAPE:
				setShape((ShapeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_DATA:
				setSimpleData((SimpleDataType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD:
				setSimpleField((SimpleFieldType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SIZE:
				setSize((Vec2Type)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SNIPPET:
				setSnippet((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SNIPPET1:
				setSnippet1((SnippetType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SOURCE_HREF:
				setSourceHref((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__SOUTH:
				setSouth((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__STATE:
				setState((List<ItemIconStateEnumType>)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP:
				setStyleMap((StyleMapType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__STYLE_URL:
				setStyleUrl((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TARGET_HREF:
				setTargetHref((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TEXT:
				setText((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TEXT_COLOR:
				setTextColor((byte[])newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TILE_SIZE:
				setTileSize((Integer)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TILT:
				setTilt((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN:
				setTimeSpan((TimeSpanType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP:
				setTimeStamp((TimeStampType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__TOP_FOV:
				setTopFov((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__URL:
				setUrl((LinkType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_BOUND_SCALE:
				setViewBoundScale((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_FORMAT:
				setViewFormat((String)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_MODE:
				setViewRefreshMode((ViewRefreshModeEnumType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_TIME:
				setViewRefreshTime((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME:
				setViewVolume((ViewVolumeType)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__VISIBILITY:
				setVisibility((Boolean)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__WEST:
				setWest((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__WHEN:
				setWhen((XMLGregorianCalendar)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__WIDTH:
				setWidth((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__X:
				setX((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__Y:
				setY((Double)newValue);
				return;
			case KMLPackage.DOCUMENT_ROOT__Z:
				setZ((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KMLPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case KMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case KMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case KMLPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ALIAS:
				setAlias((AliasType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE:
				setAltitudeMode(ALTITUDE_MODE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__BG_COLOR:
				setBgColor(BG_COLOR_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__BOTTOM_FOV:
				setBottomFov(BOTTOM_FOV_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__CAMERA:
				setCamera((CameraType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__CHANGE:
				setChange((ChangeType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__COLOR_MODE:
				setColorMode(COLOR_MODE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__COOKIE:
				setCookie(COOKIE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__COORDINATES:
				setCoordinates(COORDINATES_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__CREATE:
				setCreate((CreateType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__DATA:
				setData((DataType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__DELETE:
				setDelete((DeleteType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_MODE:
				setDisplayMode(DISPLAY_MODE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DocumentType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__DRAW_ORDER:
				setDrawOrder(DRAW_ORDER_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__EAST:
				setEast(EAST_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__END:
				setEnd(END_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__EXTENDED_DATA:
				setExtendedData((ExtendedDataType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__EXTRUDE:
				setExtrude(EXTRUDE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__FLY_TO_VIEW:
				setFlyToView(FLY_TO_VIEW_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__FOLDER:
				setFolder((FolderType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__GRID_ORIGIN:
				setGridOrigin(GRID_ORIGIN_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY:
				setGroundOverlay((GroundOverlayType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__HEADING:
				setHeading(HEADING_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__HOT_SPOT:
				setHotSpot((Vec2Type)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__HTTP_QUERY:
				setHttpQuery(HTTP_QUERY_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ICON:
				setIcon((LinkType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE:
				setIconStyle((IconStyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID:
				setImagePyramid((ImagePyramidType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				setInnerBoundaryIs((BoundaryType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON:
				setItemIcon((ItemIconType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__KML:
				setKml((KmlType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE:
				setLabelStyle((LabelStyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LEFT_FOV:
				setLeftFov(LEFT_FOV_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE:
				setLineStyle((LineStyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK_DESCRIPTION:
				setLinkDescription(LINK_DESCRIPTION_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK_NAME:
				setLinkName(LINK_NAME_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__LINK_SNIPPET:
				setLinkSnippet((SnippetType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LIST_ITEM_TYPE:
				setListItemType(LIST_ITEM_TYPE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE:
				setListStyle((ListStyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LOD:
				setLod((LodType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT:
				setLookAt((LookAtType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_ALTITUDE:
				setMaxAltitude(MAX_ALTITUDE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_FADE_EXTENT:
				setMaxFadeExtent(MAX_FADE_EXTENT_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_LOD_PIXELS:
				setMaxLodPixels(MAX_LOD_PIXELS_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_SESSION_LENGTH:
				setMaxSessionLength(MAX_SESSION_LENGTH_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_SNIPPET_LINES:
				setMaxSnippetLines(MAX_SNIPPET_LINES_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_ALTITUDE:
				setMinAltitude(MIN_ALTITUDE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_FADE_EXTENT:
				setMinFadeExtent(MIN_FADE_EXTENT_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_LOD_PIXELS:
				setMinLodPixels(MIN_LOD_PIXELS_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MIN_REFRESH_PERIOD:
				setMinRefreshPeriod(MIN_REFRESH_PERIOD_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__NEAR:
				setNear(NEAR_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK:
				setNetworkLink((NetworkLinkType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL:
				setNetworkLinkControl((NetworkLinkControlType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__NORTH:
				setNorth(NORTH_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((OrientationType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((BoundaryType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__OVERLAY_XY:
				setOverlayXY((Vec2Type)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__PAIR:
				setPair((PairType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY:
				setPhotoOverlay((PhotoOverlayType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK:
				setPlacemark((PlacemarkType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__POINT:
				setPoint((PointType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE:
				setPolyStyle((PolyStyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_INTERVAL:
				setRefreshInterval(REFRESH_INTERVAL_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_MODE:
				setRefreshMode(REFRESH_MODE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_VISIBILITY:
				setRefreshVisibility(REFRESH_VISIBILITY_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__REGION:
				setRegion((RegionType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP:
				setResourceMap((ResourceMapType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__RIGHT_FOV:
				setRightFov(RIGHT_FOV_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ROLL:
				setRoll(ROLL_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__ROTATION_XY:
				setRotationXY((Vec2Type)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCALE1:
				setScale1((ScaleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((SchemaType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA:
				setSchemaData((SchemaDataType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY:
				setScreenOverlay((ScreenOverlayType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_XY:
				setScreenXY((Vec2Type)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_DATA:
				setSimpleData((SimpleDataType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD:
				setSimpleField((SimpleFieldType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SIZE:
				setSize((Vec2Type)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SNIPPET:
				setSnippet(SNIPPET_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__SNIPPET1:
				setSnippet1((SnippetType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__SOURCE_HREF:
				setSourceHref(SOURCE_HREF_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__SOUTH:
				setSouth(SOUTH_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP:
				setStyleMap((StyleMapType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__STYLE_URL:
				setStyleUrl(STYLE_URL_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TARGET_HREF:
				setTargetHref(TARGET_HREF_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TESSELLATE:
				setTessellate(TESSELLATE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TILE_SIZE:
				setTileSize(TILE_SIZE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TILT:
				setTilt(TILT_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN:
				setTimeSpan((TimeSpanType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP:
				setTimeStamp((TimeStampType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__TOP_FOV:
				setTopFov(TOP_FOV_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__UPDATE:
				setUpdate((UpdateType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__URL:
				setUrl((LinkType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_BOUND_SCALE:
				setViewBoundScale(VIEW_BOUND_SCALE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_FORMAT:
				setViewFormat(VIEW_FORMAT_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_MODE:
				setViewRefreshMode(VIEW_REFRESH_MODE_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_TIME:
				setViewRefreshTime(VIEW_REFRESH_TIME_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME:
				setViewVolume((ViewVolumeType)null);
				return;
			case KMLPackage.DOCUMENT_ROOT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__WEST:
				setWest(WEST_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__X:
				setX(X_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__Y:
				setY(Y_EDEFAULT);
				return;
			case KMLPackage.DOCUMENT_ROOT__Z:
				setZ(Z_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KMLPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case KMLPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case KMLPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_GROUP:
				return getAbstractColorStyleGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_GROUP:
				return getAbstractSubStyleGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_GROUP:
				return getAbstractObjectGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP:
				return getAbstractColorStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractColorStyleSimpleExtensionGroup() != null : !ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractColorStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_GROUP:
				return getAbstractContainerGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP:
				return getAbstractContainerObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractContainerSimpleExtensionGroup() != null : !ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractContainerSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP:
				return getAbstractFeatureObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractFeatureSimpleExtensionGroup() != null : !ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractFeatureSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_GROUP:
				return getAbstractGeometryGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return getAbstractGeometryObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractGeometrySimpleExtensionGroup() != null : !ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractGeometrySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return getAbstractLatLonBoxObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractLatLonBoxSimpleExtensionGroup() != null : !ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractLatLonBoxSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_GROUP:
				return getAbstractOverlayGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getAbstractOverlayObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractOverlaySimpleExtensionGroup() != null : !ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractOverlaySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_GROUP:
				return getAbstractStyleSelectorGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP:
				return getAbstractStyleSelectorObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractStyleSelectorSimpleExtensionGroup() != null : !ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractStyleSelectorSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP:
				return getAbstractSubStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractSubStyleSimpleExtensionGroup() != null : !ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractSubStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_GROUP:
				return getAbstractTimePrimitiveGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP:
				return getAbstractTimePrimitiveObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractTimePrimitiveSimpleExtensionGroup() != null : !ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractTimePrimitiveSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_GROUP:
				return getAbstractViewGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP:
				return getAbstractViewObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP:
				return ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAbstractViewSimpleExtensionGroup() != null : !ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAbstractViewSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? getAddress() != null : !ADDRESS_EDEFAULT.equals(getAddress());
			case KMLPackage.DOCUMENT_ROOT__ALIAS:
				return getAlias() != null;
			case KMLPackage.DOCUMENT_ROOT__ALIAS_OBJECT_EXTENSION_GROUP:
				return getAliasObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ALIAS_SIMPLE_EXTENSION_GROUP:
				return ALIAS_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getAliasSimpleExtensionGroup() != null : !ALIAS_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getAliasSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE:
				return getAltitude() != ALTITUDE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE:
				return getAltitudeMode() != ALTITUDE_MODE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__ALTITUDE_MODE_GROUP:
				return getAltitudeModeGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE:
				return getBalloonStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE_OBJECT_EXTENSION_GROUP:
				return getBalloonStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP:
				return BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getBalloonStyleSimpleExtensionGroup() != null : !BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getBalloonStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__BASIC_LINK_OBJECT_EXTENSION_GROUP:
				return getBasicLinkObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__BASIC_LINK_SIMPLE_EXTENSION_GROUP:
				return BASIC_LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getBasicLinkSimpleExtensionGroup() != null : !BASIC_LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getBasicLinkSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__BEGIN:
				return BEGIN_EDEFAULT == null ? getBegin() != null : !BEGIN_EDEFAULT.equals(getBegin());
			case KMLPackage.DOCUMENT_ROOT__BG_COLOR:
				return BG_COLOR_EDEFAULT == null ? getBgColor() != null : !BG_COLOR_EDEFAULT.equals(getBgColor());
			case KMLPackage.DOCUMENT_ROOT__BOTTOM_FOV:
				return getBottomFov() != BOTTOM_FOV_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__BOUNDARY_OBJECT_EXTENSION_GROUP:
				return getBoundaryObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__BOUNDARY_SIMPLE_EXTENSION_GROUP:
				return BOUNDARY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getBoundarySimpleExtensionGroup() != null : !BOUNDARY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getBoundarySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__CAMERA:
				return getCamera() != null;
			case KMLPackage.DOCUMENT_ROOT__CAMERA_OBJECT_EXTENSION_GROUP:
				return getCameraObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__CAMERA_SIMPLE_EXTENSION_GROUP:
				return CAMERA_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getCameraSimpleExtensionGroup() != null : !CAMERA_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getCameraSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__CHANGE:
				return getChange() != null;
			case KMLPackage.DOCUMENT_ROOT__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case KMLPackage.DOCUMENT_ROOT__COLOR_MODE:
				return getColorMode() != COLOR_MODE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__COOKIE:
				return COOKIE_EDEFAULT == null ? getCookie() != null : !COOKIE_EDEFAULT.equals(getCookie());
			case KMLPackage.DOCUMENT_ROOT__COORDINATES:
				return COORDINATES_EDEFAULT == null ? getCoordinates() != null : !COORDINATES_EDEFAULT.equals(getCoordinates());
			case KMLPackage.DOCUMENT_ROOT__CREATE:
				return getCreate() != null;
			case KMLPackage.DOCUMENT_ROOT__DATA:
				return getData() != null;
			case KMLPackage.DOCUMENT_ROOT__DATA_EXTENSION:
				return getDataExtension() != null;
			case KMLPackage.DOCUMENT_ROOT__DELETE:
				return getDelete() != null;
			case KMLPackage.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_MODE:
				return getDisplayMode() != DISPLAY_MODE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? getDisplayName() != null : !DISPLAY_NAME_EDEFAULT.equals(getDisplayName());
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument() != null;
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT_OBJECT_EXTENSION_GROUP:
				return getDocumentObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__DOCUMENT_SIMPLE_EXTENSION_GROUP:
				return DOCUMENT_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getDocumentSimpleExtensionGroup() != null : !DOCUMENT_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getDocumentSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__DRAW_ORDER:
				return getDrawOrder() != DRAW_ORDER_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__EAST:
				return getEast() != EAST_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case KMLPackage.DOCUMENT_ROOT__EXPIRES:
				return EXPIRES_EDEFAULT == null ? getExpires() != null : !EXPIRES_EDEFAULT.equals(getExpires());
			case KMLPackage.DOCUMENT_ROOT__EXTENDED_DATA:
				return getExtendedData() != null;
			case KMLPackage.DOCUMENT_ROOT__EXTRUDE:
				return isExtrude() != EXTRUDE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__FILL:
				return isFill() != FILL_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__FLY_TO_VIEW:
				return isFlyToView() != FLY_TO_VIEW_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__FOLDER:
				return getFolder() != null;
			case KMLPackage.DOCUMENT_ROOT__FOLDER_OBJECT_EXTENSION_GROUP:
				return getFolderObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__FOLDER_SIMPLE_EXTENSION_GROUP:
				return FOLDER_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getFolderSimpleExtensionGroup() != null : !FOLDER_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getFolderSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__GRID_ORIGIN:
				return getGridOrigin() != GRID_ORIGIN_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY:
				return getGroundOverlay() != null;
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getGroundOverlayObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getGroundOverlaySimpleExtensionGroup() != null : !GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getGroundOverlaySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__HEADING:
				return getHeading() != HEADING_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__HOT_SPOT:
				return getHotSpot() != null;
			case KMLPackage.DOCUMENT_ROOT__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case KMLPackage.DOCUMENT_ROOT__HTTP_QUERY:
				return HTTP_QUERY_EDEFAULT == null ? getHttpQuery() != null : !HTTP_QUERY_EDEFAULT.equals(getHttpQuery());
			case KMLPackage.DOCUMENT_ROOT__ICON:
				return getIcon() != null;
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE:
				return getIconStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE_OBJECT_EXTENSION_GROUP:
				return getIconStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ICON_STYLE_SIMPLE_EXTENSION_GROUP:
				return ICON_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getIconStyleSimpleExtensionGroup() != null : !ICON_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getIconStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID:
				return getImagePyramid() != null;
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP:
				return getImagePyramidObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP:
				return IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getImagePyramidSimpleExtensionGroup() != null : !IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getImagePyramidSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs() != null;
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON:
				return getItemIcon() != null;
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON_OBJECT_EXTENSION_GROUP:
				return getItemIconObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ITEM_ICON_SIMPLE_EXTENSION_GROUP:
				return ITEM_ICON_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getItemIconSimpleExtensionGroup() != null : !ITEM_ICON_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getItemIconSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__KEY:
				return getKey() != KEY_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__KML:
				return getKml() != null;
			case KMLPackage.DOCUMENT_ROOT__KML_OBJECT_EXTENSION_GROUP:
				return getKmlObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__KML_SIMPLE_EXTENSION_GROUP:
				return KML_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getKmlSimpleExtensionGroup() != null : !KML_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getKmlSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE:
				return getLabelStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE_OBJECT_EXTENSION_GROUP:
				return getLabelStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LABEL_STYLE_SIMPLE_EXTENSION_GROUP:
				return LABEL_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLabelStyleSimpleExtensionGroup() != null : !LABEL_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLabelStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LATITUDE:
				return getLatitude() != LATITUDE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				return getLatLonAltBox() != null;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP:
				return getLatLonAltBoxObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP:
				return LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLatLonAltBoxSimpleExtensionGroup() != null : !LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLatLonAltBoxSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX:
				return getLatLonBox() != null;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX_OBJECT_EXTENSION_GROUP:
				return getLatLonBoxObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP:
				return LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLatLonBoxSimpleExtensionGroup() != null : !LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLatLonBoxSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LEFT_FOV:
				return getLeftFov() != LEFT_FOV_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing() != null;
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING_OBJECT_EXTENSION_GROUP:
				return getLinearRingObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LINEAR_RING_SIMPLE_EXTENSION_GROUP:
				return LINEAR_RING_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLinearRingSimpleExtensionGroup() != null : !LINEAR_RING_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLinearRingSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING:
				return getLineString() != null;
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING_OBJECT_EXTENSION_GROUP:
				return getLineStringObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LINE_STRING_SIMPLE_EXTENSION_GROUP:
				return LINE_STRING_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLineStringSimpleExtensionGroup() != null : !LINE_STRING_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLineStringSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE:
				return getLineStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE_OBJECT_EXTENSION_GROUP:
				return getLineStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LINE_STYLE_SIMPLE_EXTENSION_GROUP:
				return LINE_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLineStyleSimpleExtensionGroup() != null : !LINE_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLineStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LINK:
				return getLink() != null;
			case KMLPackage.DOCUMENT_ROOT__LINK_DESCRIPTION:
				return LINK_DESCRIPTION_EDEFAULT == null ? getLinkDescription() != null : !LINK_DESCRIPTION_EDEFAULT.equals(getLinkDescription());
			case KMLPackage.DOCUMENT_ROOT__LINK_NAME:
				return LINK_NAME_EDEFAULT == null ? getLinkName() != null : !LINK_NAME_EDEFAULT.equals(getLinkName());
			case KMLPackage.DOCUMENT_ROOT__LINK_OBJECT_EXTENSION_GROUP:
				return getLinkObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LINK_SIMPLE_EXTENSION_GROUP:
				return LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLinkSimpleExtensionGroup() != null : !LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLinkSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LINK_SNIPPET:
				return getLinkSnippet() != null;
			case KMLPackage.DOCUMENT_ROOT__LIST_ITEM_TYPE:
				return getListItemType() != LIST_ITEM_TYPE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE:
				return getListStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE_OBJECT_EXTENSION_GROUP:
				return getListStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LIST_STYLE_SIMPLE_EXTENSION_GROUP:
				return LIST_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getListStyleSimpleExtensionGroup() != null : !LIST_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getListStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case KMLPackage.DOCUMENT_ROOT__LOCATION_OBJECT_EXTENSION_GROUP:
				return getLocationObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LOCATION_SIMPLE_EXTENSION_GROUP:
				return LOCATION_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLocationSimpleExtensionGroup() != null : !LOCATION_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLocationSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LOD:
				return getLod() != null;
			case KMLPackage.DOCUMENT_ROOT__LOD_OBJECT_EXTENSION_GROUP:
				return getLodObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LOD_SIMPLE_EXTENSION_GROUP:
				return LOD_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLodSimpleExtensionGroup() != null : !LOD_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLodSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__LONGITUDE:
				return getLongitude() != LONGITUDE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT:
				return getLookAt() != null;
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT_OBJECT_EXTENSION_GROUP:
				return getLookAtObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__LOOK_AT_SIMPLE_EXTENSION_GROUP:
				return LOOK_AT_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getLookAtSimpleExtensionGroup() != null : !LOOK_AT_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getLookAtSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__MAX_ALTITUDE:
				return getMaxAltitude() != MAX_ALTITUDE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MAX_FADE_EXTENT:
				return getMaxFadeExtent() != MAX_FADE_EXTENT_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				return getMaxHeight() != MAX_HEIGHT_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MAX_LOD_PIXELS:
				return getMaxLodPixels() != MAX_LOD_PIXELS_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MAX_SESSION_LENGTH:
				return getMaxSessionLength() != MAX_SESSION_LENGTH_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MAX_SNIPPET_LINES:
				return getMaxSnippetLines() != MAX_SNIPPET_LINES_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MAX_WIDTH:
				return getMaxWidth() != MAX_WIDTH_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? getMessage() != null : !MESSAGE_EDEFAULT.equals(getMessage());
			case KMLPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata() != null;
			case KMLPackage.DOCUMENT_ROOT__MIN_ALTITUDE:
				return getMinAltitude() != MIN_ALTITUDE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MIN_FADE_EXTENT:
				return getMinFadeExtent() != MIN_FADE_EXTENT_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MIN_LOD_PIXELS:
				return getMinLodPixels() != MIN_LOD_PIXELS_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MIN_REFRESH_PERIOD:
				return getMinRefreshPeriod() != MIN_REFRESH_PERIOD_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case KMLPackage.DOCUMENT_ROOT__MODEL_OBJECT_EXTENSION_GROUP:
				return getModelObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__MODEL_SIMPLE_EXTENSION_GROUP:
				return MODEL_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getModelSimpleExtensionGroup() != null : !MODEL_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getModelSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry() != null;
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP:
				return getMultiGeometryObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP:
				return MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getMultiGeometrySimpleExtensionGroup() != null : !MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getMultiGeometrySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case KMLPackage.DOCUMENT_ROOT__NEAR:
				return getNear() != NEAR_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK:
				return getNetworkLink() != null;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL:
				return getNetworkLinkControl() != null;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP:
				return getNetworkLinkControlObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP:
				return NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getNetworkLinkControlSimpleExtensionGroup() != null : !NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getNetworkLinkControlSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_OBJECT_EXTENSION_GROUP:
				return getNetworkLinkObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__NETWORK_LINK_SIMPLE_EXTENSION_GROUP:
				return NETWORK_LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getNetworkLinkSimpleExtensionGroup() != null : !NETWORK_LINK_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getNetworkLinkSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__NORTH:
				return getNorth() != NORTH_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__OBJECT_SIMPLE_EXTENSION_GROUP:
				return OBJECT_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getObjectSimpleExtensionGroup() != null : !OBJECT_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getObjectSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__OPEN:
				return isOpen() != OPEN_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation() != null;
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION_OBJECT_EXTENSION_GROUP:
				return getOrientationObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__ORIENTATION_SIMPLE_EXTENSION_GROUP:
				return ORIENTATION_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getOrientationSimpleExtensionGroup() != null : !ORIENTATION_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getOrientationSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs() != null;
			case KMLPackage.DOCUMENT_ROOT__OUTLINE:
				return isOutline() != OUTLINE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__OVERLAY_XY:
				return getOverlayXY() != null;
			case KMLPackage.DOCUMENT_ROOT__PAIR:
				return getPair() != null;
			case KMLPackage.DOCUMENT_ROOT__PAIR_OBJECT_EXTENSION_GROUP:
				return getPairObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__PAIR_SIMPLE_EXTENSION_GROUP:
				return PAIR_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getPairSimpleExtensionGroup() != null : !PAIR_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getPairSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? getPhoneNumber() != null : !PHONE_NUMBER_EDEFAULT.equals(getPhoneNumber());
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY:
				return getPhotoOverlay() != null;
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getPhotoOverlayObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getPhotoOverlaySimpleExtensionGroup() != null : !PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getPhotoOverlaySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK:
				return getPlacemark() != null;
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK_OBJECT_EXTENSION_GROUP:
				return getPlacemarkObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__PLACEMARK_SIMPLE_EXTENSION_GROUP:
				return PLACEMARK_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getPlacemarkSimpleExtensionGroup() != null : !PLACEMARK_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getPlacemarkSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__POINT:
				return getPoint() != null;
			case KMLPackage.DOCUMENT_ROOT__POINT_OBJECT_EXTENSION_GROUP:
				return getPointObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__POINT_SIMPLE_EXTENSION_GROUP:
				return POINT_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getPointSimpleExtensionGroup() != null : !POINT_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getPointSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case KMLPackage.DOCUMENT_ROOT__POLYGON_OBJECT_EXTENSION_GROUP:
				return getPolygonObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__POLYGON_SIMPLE_EXTENSION_GROUP:
				return POLYGON_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getPolygonSimpleExtensionGroup() != null : !POLYGON_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getPolygonSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE:
				return getPolyStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE_OBJECT_EXTENSION_GROUP:
				return getPolyStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__POLY_STYLE_SIMPLE_EXTENSION_GROUP:
				return POLY_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getPolyStyleSimpleExtensionGroup() != null : !POLY_STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getPolyStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__RANGE:
				return getRange() != RANGE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_INTERVAL:
				return getRefreshInterval() != REFRESH_INTERVAL_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_MODE:
				return getRefreshMode() != REFRESH_MODE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__REFRESH_VISIBILITY:
				return isRefreshVisibility() != REFRESH_VISIBILITY_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__REGION:
				return getRegion() != null;
			case KMLPackage.DOCUMENT_ROOT__REGION_OBJECT_EXTENSION_GROUP:
				return getRegionObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__REGION_SIMPLE_EXTENSION_GROUP:
				return REGION_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getRegionSimpleExtensionGroup() != null : !REGION_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getRegionSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP:
				return getResourceMap() != null;
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP_OBJECT_EXTENSION_GROUP:
				return getResourceMapObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP:
				return RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getResourceMapSimpleExtensionGroup() != null : !RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getResourceMapSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__RIGHT_FOV:
				return getRightFov() != RIGHT_FOV_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__ROLL:
				return getRoll() != ROLL_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__ROTATION:
				return getRotation() != ROTATION_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__ROTATION_XY:
				return getRotationXY() != null;
			case KMLPackage.DOCUMENT_ROOT__SCALE:
				return getScale() != SCALE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__SCALE1:
				return getScale1() != null;
			case KMLPackage.DOCUMENT_ROOT__SCALE_OBJECT_EXTENSION_GROUP:
				return getScaleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__SCALE_SIMPLE_EXTENSION_GROUP:
				return SCALE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getScaleSimpleExtensionGroup() != null : !SCALE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getScaleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema() != null;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA:
				return getSchemaData() != null;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_DATA_EXTENSION:
				return getSchemaDataExtension() != null;
			case KMLPackage.DOCUMENT_ROOT__SCHEMA_EXTENSION:
				return getSchemaExtension() != null;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY:
				return getScreenOverlay() != null;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP:
				return getScreenOverlayObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP:
				return SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getScreenOverlaySimpleExtensionGroup() != null : !SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getScreenOverlaySimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__SCREEN_XY:
				return getScreenXY() != null;
			case KMLPackage.DOCUMENT_ROOT__SHAPE:
				return getShape() != SHAPE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_DATA:
				return getSimpleData() != null;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD:
				return getSimpleField() != null;
			case KMLPackage.DOCUMENT_ROOT__SIMPLE_FIELD_EXTENSION:
				return getSimpleFieldExtension() != null;
			case KMLPackage.DOCUMENT_ROOT__SIZE:
				return getSize() != null;
			case KMLPackage.DOCUMENT_ROOT__SNIPPET:
				return SNIPPET_EDEFAULT == null ? getSnippet() != null : !SNIPPET_EDEFAULT.equals(getSnippet());
			case KMLPackage.DOCUMENT_ROOT__SNIPPET1:
				return getSnippet1() != null;
			case KMLPackage.DOCUMENT_ROOT__SOURCE_HREF:
				return SOURCE_HREF_EDEFAULT == null ? getSourceHref() != null : !SOURCE_HREF_EDEFAULT.equals(getSourceHref());
			case KMLPackage.DOCUMENT_ROOT__SOUTH:
				return getSouth() != SOUTH_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case KMLPackage.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP:
				return getStyleMap() != null;
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP_OBJECT_EXTENSION_GROUP:
				return getStyleMapObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__STYLE_MAP_SIMPLE_EXTENSION_GROUP:
				return STYLE_MAP_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getStyleMapSimpleExtensionGroup() != null : !STYLE_MAP_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getStyleMapSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__STYLE_OBJECT_EXTENSION_GROUP:
				return getStyleObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__STYLE_SIMPLE_EXTENSION_GROUP:
				return STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getStyleSimpleExtensionGroup() != null : !STYLE_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getStyleSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__STYLE_URL:
				return STYLE_URL_EDEFAULT == null ? getStyleUrl() != null : !STYLE_URL_EDEFAULT.equals(getStyleUrl());
			case KMLPackage.DOCUMENT_ROOT__TARGET_HREF:
				return TARGET_HREF_EDEFAULT == null ? getTargetHref() != null : !TARGET_HREF_EDEFAULT.equals(getTargetHref());
			case KMLPackage.DOCUMENT_ROOT__TESSELLATE:
				return isTessellate() != TESSELLATE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case KMLPackage.DOCUMENT_ROOT__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? getTextColor() != null : !TEXT_COLOR_EDEFAULT.equals(getTextColor());
			case KMLPackage.DOCUMENT_ROOT__TILE_SIZE:
				return getTileSize() != TILE_SIZE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__TILT:
				return getTilt() != TILT_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN:
				return getTimeSpan() != null;
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN_OBJECT_EXTENSION_GROUP:
				return getTimeSpanObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__TIME_SPAN_SIMPLE_EXTENSION_GROUP:
				return TIME_SPAN_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getTimeSpanSimpleExtensionGroup() != null : !TIME_SPAN_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getTimeSpanSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP:
				return getTimeStamp() != null;
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP_OBJECT_EXTENSION_GROUP:
				return getTimeStampObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__TIME_STAMP_SIMPLE_EXTENSION_GROUP:
				return TIME_STAMP_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getTimeStampSimpleExtensionGroup() != null : !TIME_STAMP_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getTimeStampSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__TOP_FOV:
				return getTopFov() != TOP_FOV_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__UPDATE:
				return getUpdate() != null;
			case KMLPackage.DOCUMENT_ROOT__UPDATE_EXTENSION_GROUP:
				return getUpdateExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__UPDATE_OP_EXTENSION_GROUP:
				return getUpdateOpExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__URL:
				return getUrl() != null;
			case KMLPackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case KMLPackage.DOCUMENT_ROOT__VIEW_BOUND_SCALE:
				return getViewBoundScale() != VIEW_BOUND_SCALE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__VIEW_FORMAT:
				return VIEW_FORMAT_EDEFAULT == null ? getViewFormat() != null : !VIEW_FORMAT_EDEFAULT.equals(getViewFormat());
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_MODE:
				return getViewRefreshMode() != VIEW_REFRESH_MODE_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__VIEW_REFRESH_TIME:
				return getViewRefreshTime() != VIEW_REFRESH_TIME_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME:
				return getViewVolume() != null;
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME_OBJECT_EXTENSION_GROUP:
				return getViewVolumeObjectExtensionGroup() != null;
			case KMLPackage.DOCUMENT_ROOT__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP:
				return VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_EDEFAULT == null ? getViewVolumeSimpleExtensionGroup() != null : !VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_EDEFAULT.equals(getViewVolumeSimpleExtensionGroup());
			case KMLPackage.DOCUMENT_ROOT__VISIBILITY:
				return isVisibility() != VISIBILITY_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__WEST:
				return getWest() != WEST_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__WHEN:
				return WHEN_EDEFAULT == null ? getWhen() != null : !WHEN_EDEFAULT.equals(getWhen());
			case KMLPackage.DOCUMENT_ROOT__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__X:
				return getX() != X_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__Y:
				return getY() != Y_EDEFAULT;
			case KMLPackage.DOCUMENT_ROOT__Z:
				return getZ() != Z_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
