/**
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
package net.opengis.kml.util;

import net.opengis.kml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.kml.KMLPackage
 * @generated
 */
public class KMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMLSwitch() {
		if (modelPackage == null) {
			modelPackage = KMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE: {
				AbstractColorStyleType abstractColorStyleType = (AbstractColorStyleType)theEObject;
				T result = caseAbstractColorStyleType(abstractColorStyleType);
				if (result == null) result = caseAbstractSubStyleType(abstractColorStyleType);
				if (result == null) result = caseAbstractObjectType(abstractColorStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_CONTAINER_TYPE: {
				AbstractContainerType abstractContainerType = (AbstractContainerType)theEObject;
				T result = caseAbstractContainerType(abstractContainerType);
				if (result == null) result = caseAbstractFeatureType(abstractContainerType);
				if (result == null) result = caseAbstractObjectType(abstractContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_FEATURE_TYPE: {
				AbstractFeatureType abstractFeatureType = (AbstractFeatureType)theEObject;
				T result = caseAbstractFeatureType(abstractFeatureType);
				if (result == null) result = caseAbstractObjectType(abstractFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE: {
				AbstractGeometryType abstractGeometryType = (AbstractGeometryType)theEObject;
				T result = caseAbstractGeometryType(abstractGeometryType);
				if (result == null) result = caseAbstractObjectType(abstractGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE: {
				AbstractLatLonBoxType abstractLatLonBoxType = (AbstractLatLonBoxType)theEObject;
				T result = caseAbstractLatLonBoxType(abstractLatLonBoxType);
				if (result == null) result = caseAbstractObjectType(abstractLatLonBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_OBJECT_TYPE: {
				AbstractObjectType abstractObjectType = (AbstractObjectType)theEObject;
				T result = caseAbstractObjectType(abstractObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_OVERLAY_TYPE: {
				AbstractOverlayType abstractOverlayType = (AbstractOverlayType)theEObject;
				T result = caseAbstractOverlayType(abstractOverlayType);
				if (result == null) result = caseAbstractFeatureType(abstractOverlayType);
				if (result == null) result = caseAbstractObjectType(abstractOverlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE: {
				AbstractStyleSelectorType abstractStyleSelectorType = (AbstractStyleSelectorType)theEObject;
				T result = caseAbstractStyleSelectorType(abstractStyleSelectorType);
				if (result == null) result = caseAbstractObjectType(abstractStyleSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE: {
				AbstractSubStyleType abstractSubStyleType = (AbstractSubStyleType)theEObject;
				T result = caseAbstractSubStyleType(abstractSubStyleType);
				if (result == null) result = caseAbstractObjectType(abstractSubStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE: {
				AbstractTimePrimitiveType abstractTimePrimitiveType = (AbstractTimePrimitiveType)theEObject;
				T result = caseAbstractTimePrimitiveType(abstractTimePrimitiveType);
				if (result == null) result = caseAbstractObjectType(abstractTimePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ABSTRACT_VIEW_TYPE: {
				AbstractViewType abstractViewType = (AbstractViewType)theEObject;
				T result = caseAbstractViewType(abstractViewType);
				if (result == null) result = caseAbstractObjectType(abstractViewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ALIAS_TYPE: {
				AliasType aliasType = (AliasType)theEObject;
				T result = caseAliasType(aliasType);
				if (result == null) result = caseAbstractObjectType(aliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.BALLOON_STYLE_TYPE: {
				BalloonStyleType balloonStyleType = (BalloonStyleType)theEObject;
				T result = caseBalloonStyleType(balloonStyleType);
				if (result == null) result = caseAbstractSubStyleType(balloonStyleType);
				if (result == null) result = caseAbstractObjectType(balloonStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.BASIC_LINK_TYPE: {
				BasicLinkType basicLinkType = (BasicLinkType)theEObject;
				T result = caseBasicLinkType(basicLinkType);
				if (result == null) result = caseAbstractObjectType(basicLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.BOUNDARY_TYPE: {
				BoundaryType boundaryType = (BoundaryType)theEObject;
				T result = caseBoundaryType(boundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.CAMERA_TYPE: {
				CameraType cameraType = (CameraType)theEObject;
				T result = caseCameraType(cameraType);
				if (result == null) result = caseAbstractViewType(cameraType);
				if (result == null) result = caseAbstractObjectType(cameraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.CHANGE_TYPE: {
				ChangeType changeType = (ChangeType)theEObject;
				T result = caseChangeType(changeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.CREATE_TYPE: {
				CreateType createType = (CreateType)theEObject;
				T result = caseCreateType(createType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseAbstractObjectType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.DELETE_TYPE: {
				DeleteType deleteType = (DeleteType)theEObject;
				T result = caseDeleteType(deleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.DOCUMENT_TYPE: {
				DocumentType documentType = (DocumentType)theEObject;
				T result = caseDocumentType(documentType);
				if (result == null) result = caseAbstractContainerType(documentType);
				if (result == null) result = caseAbstractFeatureType(documentType);
				if (result == null) result = caseAbstractObjectType(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.EXTENDED_DATA_TYPE: {
				ExtendedDataType extendedDataType = (ExtendedDataType)theEObject;
				T result = caseExtendedDataType(extendedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.FOLDER_TYPE: {
				FolderType folderType = (FolderType)theEObject;
				T result = caseFolderType(folderType);
				if (result == null) result = caseAbstractContainerType(folderType);
				if (result == null) result = caseAbstractFeatureType(folderType);
				if (result == null) result = caseAbstractObjectType(folderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.GROUND_OVERLAY_TYPE: {
				GroundOverlayType groundOverlayType = (GroundOverlayType)theEObject;
				T result = caseGroundOverlayType(groundOverlayType);
				if (result == null) result = caseAbstractOverlayType(groundOverlayType);
				if (result == null) result = caseAbstractFeatureType(groundOverlayType);
				if (result == null) result = caseAbstractObjectType(groundOverlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ICON_STYLE_TYPE: {
				IconStyleType iconStyleType = (IconStyleType)theEObject;
				T result = caseIconStyleType(iconStyleType);
				if (result == null) result = caseAbstractColorStyleType(iconStyleType);
				if (result == null) result = caseAbstractSubStyleType(iconStyleType);
				if (result == null) result = caseAbstractObjectType(iconStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.IMAGE_PYRAMID_TYPE: {
				ImagePyramidType imagePyramidType = (ImagePyramidType)theEObject;
				T result = caseImagePyramidType(imagePyramidType);
				if (result == null) result = caseAbstractObjectType(imagePyramidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ITEM_ICON_TYPE: {
				ItemIconType itemIconType = (ItemIconType)theEObject;
				T result = caseItemIconType(itemIconType);
				if (result == null) result = caseAbstractObjectType(itemIconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.KML_TYPE: {
				KmlType kmlType = (KmlType)theEObject;
				T result = caseKmlType(kmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LABEL_STYLE_TYPE: {
				LabelStyleType labelStyleType = (LabelStyleType)theEObject;
				T result = caseLabelStyleType(labelStyleType);
				if (result == null) result = caseAbstractColorStyleType(labelStyleType);
				if (result == null) result = caseAbstractSubStyleType(labelStyleType);
				if (result == null) result = caseAbstractObjectType(labelStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LAT_LON_ALT_BOX_TYPE: {
				LatLonAltBoxType latLonAltBoxType = (LatLonAltBoxType)theEObject;
				T result = caseLatLonAltBoxType(latLonAltBoxType);
				if (result == null) result = caseAbstractLatLonBoxType(latLonAltBoxType);
				if (result == null) result = caseAbstractObjectType(latLonAltBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LAT_LON_BOX_TYPE: {
				LatLonBoxType latLonBoxType = (LatLonBoxType)theEObject;
				T result = caseLatLonBoxType(latLonBoxType);
				if (result == null) result = caseAbstractLatLonBoxType(latLonBoxType);
				if (result == null) result = caseAbstractObjectType(latLonBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LINEAR_RING_TYPE: {
				LinearRingType linearRingType = (LinearRingType)theEObject;
				T result = caseLinearRingType(linearRingType);
				if (result == null) result = caseAbstractGeometryType(linearRingType);
				if (result == null) result = caseAbstractObjectType(linearRingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LINE_STRING_TYPE: {
				LineStringType lineStringType = (LineStringType)theEObject;
				T result = caseLineStringType(lineStringType);
				if (result == null) result = caseAbstractGeometryType(lineStringType);
				if (result == null) result = caseAbstractObjectType(lineStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LINE_STYLE_TYPE: {
				LineStyleType lineStyleType = (LineStyleType)theEObject;
				T result = caseLineStyleType(lineStyleType);
				if (result == null) result = caseAbstractColorStyleType(lineStyleType);
				if (result == null) result = caseAbstractSubStyleType(lineStyleType);
				if (result == null) result = caseAbstractObjectType(lineStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = caseBasicLinkType(linkType);
				if (result == null) result = caseAbstractObjectType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LIST_STYLE_TYPE: {
				ListStyleType listStyleType = (ListStyleType)theEObject;
				T result = caseListStyleType(listStyleType);
				if (result == null) result = caseAbstractSubStyleType(listStyleType);
				if (result == null) result = caseAbstractObjectType(listStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LOCATION_TYPE: {
				LocationType locationType = (LocationType)theEObject;
				T result = caseLocationType(locationType);
				if (result == null) result = caseAbstractObjectType(locationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LOD_TYPE: {
				LodType lodType = (LodType)theEObject;
				T result = caseLodType(lodType);
				if (result == null) result = caseAbstractObjectType(lodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.LOOK_AT_TYPE: {
				LookAtType lookAtType = (LookAtType)theEObject;
				T result = caseLookAtType(lookAtType);
				if (result == null) result = caseAbstractViewType(lookAtType);
				if (result == null) result = caseAbstractObjectType(lookAtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseAbstractGeometryType(modelType);
				if (result == null) result = caseAbstractObjectType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.MULTI_GEOMETRY_TYPE: {
				MultiGeometryType multiGeometryType = (MultiGeometryType)theEObject;
				T result = caseMultiGeometryType(multiGeometryType);
				if (result == null) result = caseAbstractGeometryType(multiGeometryType);
				if (result == null) result = caseAbstractObjectType(multiGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE: {
				NetworkLinkControlType networkLinkControlType = (NetworkLinkControlType)theEObject;
				T result = caseNetworkLinkControlType(networkLinkControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.NETWORK_LINK_TYPE: {
				NetworkLinkType networkLinkType = (NetworkLinkType)theEObject;
				T result = caseNetworkLinkType(networkLinkType);
				if (result == null) result = caseAbstractFeatureType(networkLinkType);
				if (result == null) result = caseAbstractObjectType(networkLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.ORIENTATION_TYPE: {
				OrientationType orientationType = (OrientationType)theEObject;
				T result = caseOrientationType(orientationType);
				if (result == null) result = caseAbstractObjectType(orientationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.PAIR_TYPE: {
				PairType pairType = (PairType)theEObject;
				T result = casePairType(pairType);
				if (result == null) result = caseAbstractObjectType(pairType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.PHOTO_OVERLAY_TYPE: {
				PhotoOverlayType photoOverlayType = (PhotoOverlayType)theEObject;
				T result = casePhotoOverlayType(photoOverlayType);
				if (result == null) result = caseAbstractOverlayType(photoOverlayType);
				if (result == null) result = caseAbstractFeatureType(photoOverlayType);
				if (result == null) result = caseAbstractObjectType(photoOverlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.PLACEMARK_TYPE: {
				PlacemarkType placemarkType = (PlacemarkType)theEObject;
				T result = casePlacemarkType(placemarkType);
				if (result == null) result = caseAbstractFeatureType(placemarkType);
				if (result == null) result = caseAbstractObjectType(placemarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = caseAbstractGeometryType(pointType);
				if (result == null) result = caseAbstractObjectType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = caseAbstractGeometryType(polygonType);
				if (result == null) result = caseAbstractObjectType(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.POLY_STYLE_TYPE: {
				PolyStyleType polyStyleType = (PolyStyleType)theEObject;
				T result = casePolyStyleType(polyStyleType);
				if (result == null) result = caseAbstractColorStyleType(polyStyleType);
				if (result == null) result = caseAbstractSubStyleType(polyStyleType);
				if (result == null) result = caseAbstractObjectType(polyStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.REGION_TYPE: {
				RegionType regionType = (RegionType)theEObject;
				T result = caseRegionType(regionType);
				if (result == null) result = caseAbstractObjectType(regionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.RESOURCE_MAP_TYPE: {
				ResourceMapType resourceMapType = (ResourceMapType)theEObject;
				T result = caseResourceMapType(resourceMapType);
				if (result == null) result = caseAbstractObjectType(resourceMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SCALE_TYPE: {
				ScaleType scaleType = (ScaleType)theEObject;
				T result = caseScaleType(scaleType);
				if (result == null) result = caseAbstractObjectType(scaleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SCHEMA_DATA_TYPE: {
				SchemaDataType schemaDataType = (SchemaDataType)theEObject;
				T result = caseSchemaDataType(schemaDataType);
				if (result == null) result = caseAbstractObjectType(schemaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SCHEMA_TYPE: {
				SchemaType schemaType = (SchemaType)theEObject;
				T result = caseSchemaType(schemaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SCREEN_OVERLAY_TYPE: {
				ScreenOverlayType screenOverlayType = (ScreenOverlayType)theEObject;
				T result = caseScreenOverlayType(screenOverlayType);
				if (result == null) result = caseAbstractOverlayType(screenOverlayType);
				if (result == null) result = caseAbstractFeatureType(screenOverlayType);
				if (result == null) result = caseAbstractObjectType(screenOverlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SIMPLE_DATA_TYPE: {
				SimpleDataType simpleDataType = (SimpleDataType)theEObject;
				T result = caseSimpleDataType(simpleDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SIMPLE_FIELD_TYPE: {
				SimpleFieldType simpleFieldType = (SimpleFieldType)theEObject;
				T result = caseSimpleFieldType(simpleFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.SNIPPET_TYPE: {
				SnippetType snippetType = (SnippetType)theEObject;
				T result = caseSnippetType(snippetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.STYLE_MAP_TYPE: {
				StyleMapType styleMapType = (StyleMapType)theEObject;
				T result = caseStyleMapType(styleMapType);
				if (result == null) result = caseAbstractStyleSelectorType(styleMapType);
				if (result == null) result = caseAbstractObjectType(styleMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.STYLE_TYPE: {
				StyleType styleType = (StyleType)theEObject;
				T result = caseStyleType(styleType);
				if (result == null) result = caseAbstractStyleSelectorType(styleType);
				if (result == null) result = caseAbstractObjectType(styleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.TIME_SPAN_TYPE: {
				TimeSpanType timeSpanType = (TimeSpanType)theEObject;
				T result = caseTimeSpanType(timeSpanType);
				if (result == null) result = caseAbstractTimePrimitiveType(timeSpanType);
				if (result == null) result = caseAbstractObjectType(timeSpanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.TIME_STAMP_TYPE: {
				TimeStampType timeStampType = (TimeStampType)theEObject;
				T result = caseTimeStampType(timeStampType);
				if (result == null) result = caseAbstractTimePrimitiveType(timeStampType);
				if (result == null) result = caseAbstractObjectType(timeStampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.VEC2_TYPE: {
				Vec2Type vec2Type = (Vec2Type)theEObject;
				T result = caseVec2Type(vec2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KMLPackage.VIEW_VOLUME_TYPE: {
				ViewVolumeType viewVolumeType = (ViewVolumeType)theEObject;
				T result = caseViewVolumeType(viewVolumeType);
				if (result == null) result = caseAbstractObjectType(viewVolumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Color Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Color Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractColorStyleType(AbstractColorStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContainerType(AbstractContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometryType(AbstractGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Lat Lon Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Lat Lon Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLatLonBoxType(AbstractLatLonBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractObjectType(AbstractObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOverlayType(AbstractOverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Style Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Style Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStyleSelectorType(AbstractStyleSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sub Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sub Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSubStyleType(AbstractSubStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimePrimitiveType(AbstractTimePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractViewType(AbstractViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasType(AliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balloon Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balloon Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalloonStyleType(BalloonStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicLinkType(BasicLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryType(BoundaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraType(CameraType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeType(ChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateType(CreateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteType(DeleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedDataType(ExtendedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderType(FolderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundOverlayType(GroundOverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconStyleType(IconStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Pyramid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Pyramid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagePyramidType(ImagePyramidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemIconType(ItemIconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kml Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kml Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKmlType(KmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelStyleType(LabelStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lat Lon Alt Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lat Lon Alt Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatLonAltBoxType(LatLonAltBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lat Lon Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lat Lon Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatLonBoxType(LatLonBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRingType(LinearRingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStringType(LineStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyleType(LineStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStyleType(ListStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationType(LocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lod Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lod Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLodType(LodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Look At Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Look At Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookAtType(LookAtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiGeometryType(MultiGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLinkControlType(NetworkLinkControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLinkType(NetworkLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationType(OrientationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePairType(PairType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotoOverlayType(PhotoOverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placemark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placemark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacemarkType(PlacemarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyStyleType(PolyStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionType(RegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMapType(ResourceMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleType(ScaleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaDataType(SchemaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaType(SchemaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenOverlayType(ScreenOverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataType(SimpleDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleFieldType(SimpleFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snippet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snippet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnippetType(SnippetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleMapType(StyleMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType(StyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSpanType(TimeSpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampType(TimeStampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVec2Type(Vec2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewVolumeType(ViewVolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KMLSwitch
