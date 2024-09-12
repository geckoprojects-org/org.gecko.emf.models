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
package net.opengis.kml.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.kml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KMLFactoryImpl extends EFactoryImpl implements KMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KMLFactory init() {
		try {
			KMLFactory theKMLFactory = (KMLFactory)EPackage.Registry.INSTANCE.getEFactory(KMLPackage.eNS_URI);
			if (theKMLFactory != null) {
				return theKMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KMLPackage.ALIAS_TYPE: return createAliasType();
			case KMLPackage.BALLOON_STYLE_TYPE: return createBalloonStyleType();
			case KMLPackage.BASIC_LINK_TYPE: return createBasicLinkType();
			case KMLPackage.BOUNDARY_TYPE: return createBoundaryType();
			case KMLPackage.CAMERA_TYPE: return createCameraType();
			case KMLPackage.CHANGE_TYPE: return createChangeType();
			case KMLPackage.CREATE_TYPE: return createCreateType();
			case KMLPackage.DATA_TYPE: return createDataType();
			case KMLPackage.DELETE_TYPE: return createDeleteType();
			case KMLPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case KMLPackage.DOCUMENT_TYPE: return createDocumentType();
			case KMLPackage.EXTENDED_DATA_TYPE: return createExtendedDataType();
			case KMLPackage.FOLDER_TYPE: return createFolderType();
			case KMLPackage.GROUND_OVERLAY_TYPE: return createGroundOverlayType();
			case KMLPackage.ICON_STYLE_TYPE: return createIconStyleType();
			case KMLPackage.IMAGE_PYRAMID_TYPE: return createImagePyramidType();
			case KMLPackage.ITEM_ICON_TYPE: return createItemIconType();
			case KMLPackage.KML_TYPE: return createKmlType();
			case KMLPackage.LABEL_STYLE_TYPE: return createLabelStyleType();
			case KMLPackage.LAT_LON_ALT_BOX_TYPE: return createLatLonAltBoxType();
			case KMLPackage.LAT_LON_BOX_TYPE: return createLatLonBoxType();
			case KMLPackage.LINEAR_RING_TYPE: return createLinearRingType();
			case KMLPackage.LINE_STRING_TYPE: return createLineStringType();
			case KMLPackage.LINE_STYLE_TYPE: return createLineStyleType();
			case KMLPackage.LINK_TYPE: return createLinkType();
			case KMLPackage.LIST_STYLE_TYPE: return createListStyleType();
			case KMLPackage.LOCATION_TYPE: return createLocationType();
			case KMLPackage.LOD_TYPE: return createLodType();
			case KMLPackage.LOOK_AT_TYPE: return createLookAtType();
			case KMLPackage.METADATA_TYPE: return createMetadataType();
			case KMLPackage.MODEL_TYPE: return createModelType();
			case KMLPackage.MULTI_GEOMETRY_TYPE: return createMultiGeometryType();
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE: return createNetworkLinkControlType();
			case KMLPackage.NETWORK_LINK_TYPE: return createNetworkLinkType();
			case KMLPackage.ORIENTATION_TYPE: return createOrientationType();
			case KMLPackage.PAIR_TYPE: return createPairType();
			case KMLPackage.PHOTO_OVERLAY_TYPE: return createPhotoOverlayType();
			case KMLPackage.PLACEMARK_TYPE: return createPlacemarkType();
			case KMLPackage.POINT_TYPE: return createPointType();
			case KMLPackage.POLYGON_TYPE: return createPolygonType();
			case KMLPackage.POLY_STYLE_TYPE: return createPolyStyleType();
			case KMLPackage.REGION_TYPE: return createRegionType();
			case KMLPackage.RESOURCE_MAP_TYPE: return createResourceMapType();
			case KMLPackage.SCALE_TYPE: return createScaleType();
			case KMLPackage.SCHEMA_DATA_TYPE: return createSchemaDataType();
			case KMLPackage.SCHEMA_TYPE: return createSchemaType();
			case KMLPackage.SCREEN_OVERLAY_TYPE: return createScreenOverlayType();
			case KMLPackage.SIMPLE_DATA_TYPE: return createSimpleDataType();
			case KMLPackage.SIMPLE_FIELD_TYPE: return createSimpleFieldType();
			case KMLPackage.SNIPPET_TYPE: return createSnippetType();
			case KMLPackage.STYLE_MAP_TYPE: return createStyleMapType();
			case KMLPackage.STYLE_TYPE: return createStyleType();
			case KMLPackage.TIME_SPAN_TYPE: return createTimeSpanType();
			case KMLPackage.TIME_STAMP_TYPE: return createTimeStampType();
			case KMLPackage.UPDATE_TYPE: return createUpdateType();
			case KMLPackage.VEC2_TYPE: return createVec2Type();
			case KMLPackage.VIEW_VOLUME_TYPE: return createViewVolumeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case KMLPackage.ALTITUDE_MODE_ENUM_TYPE:
				return createAltitudeModeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.COLOR_MODE_ENUM_TYPE:
				return createColorModeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.DISPLAY_MODE_ENUM_TYPE:
				return createDisplayModeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.GRID_ORIGIN_ENUM_TYPE:
				return createGridOriginEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.ITEM_ICON_STATE_ENUM_TYPE:
				return createItemIconStateEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.LIST_ITEM_TYPE_ENUM_TYPE:
				return createListItemTypeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.REFRESH_MODE_ENUM_TYPE:
				return createRefreshModeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.SHAPE_ENUM_TYPE:
				return createShapeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.STYLE_STATE_ENUM_TYPE:
				return createStyleStateEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.UNITS_ENUM_TYPE:
				return createUnitsEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.VIEW_REFRESH_MODE_ENUM_TYPE:
				return createViewRefreshModeEnumTypeFromString(eDataType, initialValue);
			case KMLPackage.ALTITUDE_MODE_ENUM_TYPE_OBJECT:
				return createAltitudeModeEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ANGLE180_TYPE:
				return createAngle180TypeFromString(eDataType, initialValue);
			case KMLPackage.ANGLE180_TYPE_OBJECT:
				return createAngle180TypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ANGLE360_TYPE:
				return createAngle360TypeFromString(eDataType, initialValue);
			case KMLPackage.ANGLE360_TYPE_OBJECT:
				return createAngle360TypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ANGLE90_TYPE:
				return createAngle90TypeFromString(eDataType, initialValue);
			case KMLPackage.ANGLE90_TYPE_OBJECT:
				return createAngle90TypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ANGLEPOS180_TYPE:
				return createAnglepos180TypeFromString(eDataType, initialValue);
			case KMLPackage.ANGLEPOS180_TYPE_OBJECT:
				return createAnglepos180TypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ANGLEPOS90_TYPE:
				return createAnglepos90TypeFromString(eDataType, initialValue);
			case KMLPackage.ANGLEPOS90_TYPE_OBJECT:
				return createAnglepos90TypeObjectFromString(eDataType, initialValue);
			case KMLPackage.COLOR_MODE_ENUM_TYPE_OBJECT:
				return createColorModeEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.COLOR_TYPE:
				return createColorTypeFromString(eDataType, initialValue);
			case KMLPackage.COORDINATES_TYPE:
				return createCoordinatesTypeFromString(eDataType, initialValue);
			case KMLPackage.DATE_TIME_TYPE:
				return createDateTimeTypeFromString(eDataType, initialValue);
			case KMLPackage.DISPLAY_MODE_ENUM_TYPE_OBJECT:
				return createDisplayModeEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.GRID_ORIGIN_ENUM_TYPE_OBJECT:
				return createGridOriginEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ITEM_ICON_STATE_ENUM_TYPE_OBJECT:
				return createItemIconStateEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.ITEM_ICON_STATE_TYPE:
				return createItemIconStateTypeFromString(eDataType, initialValue);
			case KMLPackage.LIST_ITEM_TYPE_ENUM_TYPE_OBJECT:
				return createListItemTypeEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.REFRESH_MODE_ENUM_TYPE_OBJECT:
				return createRefreshModeEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.SHAPE_ENUM_TYPE_OBJECT:
				return createShapeEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.STYLE_STATE_ENUM_TYPE_OBJECT:
				return createStyleStateEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.UNITS_ENUM_TYPE_OBJECT:
				return createUnitsEnumTypeObjectFromString(eDataType, initialValue);
			case KMLPackage.VIEW_REFRESH_MODE_ENUM_TYPE_OBJECT:
				return createViewRefreshModeEnumTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KMLPackage.ALTITUDE_MODE_ENUM_TYPE:
				return convertAltitudeModeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.COLOR_MODE_ENUM_TYPE:
				return convertColorModeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.DISPLAY_MODE_ENUM_TYPE:
				return convertDisplayModeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.GRID_ORIGIN_ENUM_TYPE:
				return convertGridOriginEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.ITEM_ICON_STATE_ENUM_TYPE:
				return convertItemIconStateEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.LIST_ITEM_TYPE_ENUM_TYPE:
				return convertListItemTypeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.REFRESH_MODE_ENUM_TYPE:
				return convertRefreshModeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.SHAPE_ENUM_TYPE:
				return convertShapeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.STYLE_STATE_ENUM_TYPE:
				return convertStyleStateEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.UNITS_ENUM_TYPE:
				return convertUnitsEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.VIEW_REFRESH_MODE_ENUM_TYPE:
				return convertViewRefreshModeEnumTypeToString(eDataType, instanceValue);
			case KMLPackage.ALTITUDE_MODE_ENUM_TYPE_OBJECT:
				return convertAltitudeModeEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ANGLE180_TYPE:
				return convertAngle180TypeToString(eDataType, instanceValue);
			case KMLPackage.ANGLE180_TYPE_OBJECT:
				return convertAngle180TypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ANGLE360_TYPE:
				return convertAngle360TypeToString(eDataType, instanceValue);
			case KMLPackage.ANGLE360_TYPE_OBJECT:
				return convertAngle360TypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ANGLE90_TYPE:
				return convertAngle90TypeToString(eDataType, instanceValue);
			case KMLPackage.ANGLE90_TYPE_OBJECT:
				return convertAngle90TypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ANGLEPOS180_TYPE:
				return convertAnglepos180TypeToString(eDataType, instanceValue);
			case KMLPackage.ANGLEPOS180_TYPE_OBJECT:
				return convertAnglepos180TypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ANGLEPOS90_TYPE:
				return convertAnglepos90TypeToString(eDataType, instanceValue);
			case KMLPackage.ANGLEPOS90_TYPE_OBJECT:
				return convertAnglepos90TypeObjectToString(eDataType, instanceValue);
			case KMLPackage.COLOR_MODE_ENUM_TYPE_OBJECT:
				return convertColorModeEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.COLOR_TYPE:
				return convertColorTypeToString(eDataType, instanceValue);
			case KMLPackage.COORDINATES_TYPE:
				return convertCoordinatesTypeToString(eDataType, instanceValue);
			case KMLPackage.DATE_TIME_TYPE:
				return convertDateTimeTypeToString(eDataType, instanceValue);
			case KMLPackage.DISPLAY_MODE_ENUM_TYPE_OBJECT:
				return convertDisplayModeEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.GRID_ORIGIN_ENUM_TYPE_OBJECT:
				return convertGridOriginEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ITEM_ICON_STATE_ENUM_TYPE_OBJECT:
				return convertItemIconStateEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.ITEM_ICON_STATE_TYPE:
				return convertItemIconStateTypeToString(eDataType, instanceValue);
			case KMLPackage.LIST_ITEM_TYPE_ENUM_TYPE_OBJECT:
				return convertListItemTypeEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.REFRESH_MODE_ENUM_TYPE_OBJECT:
				return convertRefreshModeEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.SHAPE_ENUM_TYPE_OBJECT:
				return convertShapeEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.STYLE_STATE_ENUM_TYPE_OBJECT:
				return convertStyleStateEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.UNITS_ENUM_TYPE_OBJECT:
				return convertUnitsEnumTypeObjectToString(eDataType, instanceValue);
			case KMLPackage.VIEW_REFRESH_MODE_ENUM_TYPE_OBJECT:
				return convertViewRefreshModeEnumTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AliasType createAliasType() {
		AliasTypeImpl aliasType = new AliasTypeImpl();
		return aliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BalloonStyleType createBalloonStyleType() {
		BalloonStyleTypeImpl balloonStyleType = new BalloonStyleTypeImpl();
		return balloonStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicLinkType createBasicLinkType() {
		BasicLinkTypeImpl basicLinkType = new BasicLinkTypeImpl();
		return basicLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType createBoundaryType() {
		BoundaryTypeImpl boundaryType = new BoundaryTypeImpl();
		return boundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CameraType createCameraType() {
		CameraTypeImpl cameraType = new CameraTypeImpl();
		return cameraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeType createChangeType() {
		ChangeTypeImpl changeType = new ChangeTypeImpl();
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateType createCreateType() {
		CreateTypeImpl createType = new CreateTypeImpl();
		return createType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteType createDeleteType() {
		DeleteTypeImpl deleteType = new DeleteTypeImpl();
		return deleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType createDocumentType() {
		DocumentTypeImpl documentType = new DocumentTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendedDataType createExtendedDataType() {
		ExtendedDataTypeImpl extendedDataType = new ExtendedDataTypeImpl();
		return extendedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderType createFolderType() {
		FolderTypeImpl folderType = new FolderTypeImpl();
		return folderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundOverlayType createGroundOverlayType() {
		GroundOverlayTypeImpl groundOverlayType = new GroundOverlayTypeImpl();
		return groundOverlayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IconStyleType createIconStyleType() {
		IconStyleTypeImpl iconStyleType = new IconStyleTypeImpl();
		return iconStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagePyramidType createImagePyramidType() {
		ImagePyramidTypeImpl imagePyramidType = new ImagePyramidTypeImpl();
		return imagePyramidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIconType createItemIconType() {
		ItemIconTypeImpl itemIconType = new ItemIconTypeImpl();
		return itemIconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KmlType createKmlType() {
		KmlTypeImpl kmlType = new KmlTypeImpl();
		return kmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyleType createLabelStyleType() {
		LabelStyleTypeImpl labelStyleType = new LabelStyleTypeImpl();
		return labelStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLonAltBoxType createLatLonAltBoxType() {
		LatLonAltBoxTypeImpl latLonAltBoxType = new LatLonAltBoxTypeImpl();
		return latLonAltBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLonBoxType createLatLonBoxType() {
		LatLonBoxTypeImpl latLonBoxType = new LatLonBoxTypeImpl();
		return latLonBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearRingType createLinearRingType() {
		LinearRingTypeImpl linearRingType = new LinearRingTypeImpl();
		return linearRingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringType createLineStringType() {
		LineStringTypeImpl lineStringType = new LineStringTypeImpl();
		return lineStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyleType createLineStyleType() {
		LineStyleTypeImpl lineStyleType = new LineStyleTypeImpl();
		return lineStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListStyleType createListStyleType() {
		ListStyleTypeImpl listStyleType = new ListStyleTypeImpl();
		return listStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LodType createLodType() {
		LodTypeImpl lodType = new LodTypeImpl();
		return lodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LookAtType createLookAtType() {
		LookAtTypeImpl lookAtType = new LookAtTypeImpl();
		return lookAtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiGeometryType createMultiGeometryType() {
		MultiGeometryTypeImpl multiGeometryType = new MultiGeometryTypeImpl();
		return multiGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLinkControlType createNetworkLinkControlType() {
		NetworkLinkControlTypeImpl networkLinkControlType = new NetworkLinkControlTypeImpl();
		return networkLinkControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkLinkType createNetworkLinkType() {
		NetworkLinkTypeImpl networkLinkType = new NetworkLinkTypeImpl();
		return networkLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PairType createPairType() {
		PairTypeImpl pairType = new PairTypeImpl();
		return pairType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhotoOverlayType createPhotoOverlayType() {
		PhotoOverlayTypeImpl photoOverlayType = new PhotoOverlayTypeImpl();
		return photoOverlayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacemarkType createPlacemarkType() {
		PlacemarkTypeImpl placemarkType = new PlacemarkTypeImpl();
		return placemarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolyStyleType createPolyStyleType() {
		PolyStyleTypeImpl polyStyleType = new PolyStyleTypeImpl();
		return polyStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionType createRegionType() {
		RegionTypeImpl regionType = new RegionTypeImpl();
		return regionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMapType createResourceMapType() {
		ResourceMapTypeImpl resourceMapType = new ResourceMapTypeImpl();
		return resourceMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScaleType createScaleType() {
		ScaleTypeImpl scaleType = new ScaleTypeImpl();
		return scaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaDataType createSchemaDataType() {
		SchemaDataTypeImpl schemaDataType = new SchemaDataTypeImpl();
		return schemaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaType createSchemaType() {
		SchemaTypeImpl schemaType = new SchemaTypeImpl();
		return schemaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenOverlayType createScreenOverlayType() {
		ScreenOverlayTypeImpl screenOverlayType = new ScreenOverlayTypeImpl();
		return screenOverlayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleDataType createSimpleDataType() {
		SimpleDataTypeImpl simpleDataType = new SimpleDataTypeImpl();
		return simpleDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFieldType createSimpleFieldType() {
		SimpleFieldTypeImpl simpleFieldType = new SimpleFieldTypeImpl();
		return simpleFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnippetType createSnippetType() {
		SnippetTypeImpl snippetType = new SnippetTypeImpl();
		return snippetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleMapType createStyleMapType() {
		StyleMapTypeImpl styleMapType = new StyleMapTypeImpl();
		return styleMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType createStyleType() {
		StyleTypeImpl styleType = new StyleTypeImpl();
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSpanType createTimeSpanType() {
		TimeSpanTypeImpl timeSpanType = new TimeSpanTypeImpl();
		return timeSpanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStampType createTimeStampType() {
		TimeStampTypeImpl timeStampType = new TimeStampTypeImpl();
		return timeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vec2Type createVec2Type() {
		Vec2TypeImpl vec2Type = new Vec2TypeImpl();
		return vec2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewVolumeType createViewVolumeType() {
		ViewVolumeTypeImpl viewVolumeType = new ViewVolumeTypeImpl();
		return viewVolumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeModeEnumType createAltitudeModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		AltitudeModeEnumType result = AltitudeModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltitudeModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeEnumType createColorModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		ColorModeEnumType result = ColorModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayModeEnumType createDisplayModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		DisplayModeEnumType result = DisplayModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridOriginEnumType createGridOriginEnumTypeFromString(EDataType eDataType, String initialValue) {
		GridOriginEnumType result = GridOriginEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridOriginEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIconStateEnumType createItemIconStateEnumTypeFromString(EDataType eDataType, String initialValue) {
		ItemIconStateEnumType result = ItemIconStateEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemIconStateEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemTypeEnumType createListItemTypeEnumTypeFromString(EDataType eDataType, String initialValue) {
		ListItemTypeEnumType result = ListItemTypeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListItemTypeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshModeEnumType createRefreshModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		RefreshModeEnumType result = RefreshModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeEnumType createShapeEnumTypeFromString(EDataType eDataType, String initialValue) {
		ShapeEnumType result = ShapeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleStateEnumType createStyleStateEnumTypeFromString(EDataType eDataType, String initialValue) {
		StyleStateEnumType result = StyleStateEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleStateEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsEnumType createUnitsEnumTypeFromString(EDataType eDataType, String initialValue) {
		UnitsEnumType result = UnitsEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshModeEnumType createViewRefreshModeEnumTypeFromString(EDataType eDataType, String initialValue) {
		ViewRefreshModeEnumType result = ViewRefreshModeEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewRefreshModeEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeModeEnumType createAltitudeModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAltitudeModeEnumTypeFromString(KMLPackage.eINSTANCE.getAltitudeModeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltitudeModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAltitudeModeEnumTypeToString(KMLPackage.eINSTANCE.getAltitudeModeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle180TypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle180TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle180TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAngle180TypeFromString(KMLPackage.eINSTANCE.getAngle180Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle180TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngle180TypeToString(KMLPackage.eINSTANCE.getAngle180Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle360TypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle360TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle360TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAngle360TypeFromString(KMLPackage.eINSTANCE.getAngle360Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle360TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngle360TypeToString(KMLPackage.eINSTANCE.getAngle360Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle90TypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle90TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle90TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAngle90TypeFromString(KMLPackage.eINSTANCE.getAngle90Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle90TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngle90TypeToString(KMLPackage.eINSTANCE.getAngle90Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglepos180TypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglepos180TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglepos180TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAnglepos180TypeFromString(KMLPackage.eINSTANCE.getAnglepos180Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglepos180TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnglepos180TypeToString(KMLPackage.eINSTANCE.getAnglepos180Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglepos90TypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglepos90TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglepos90TypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAnglepos90TypeFromString(KMLPackage.eINSTANCE.getAnglepos90Type(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglepos90TypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnglepos90TypeToString(KMLPackage.eINSTANCE.getAnglepos90Type(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeEnumType createColorModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColorModeEnumTypeFromString(KMLPackage.eINSTANCE.getColorModeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorModeEnumTypeToString(KMLPackage.eINSTANCE.getColorModeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createColorTypeFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createCoordinatesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinatesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayModeEnumType createDisplayModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayModeEnumTypeFromString(KMLPackage.eINSTANCE.getDisplayModeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayModeEnumTypeToString(KMLPackage.eINSTANCE.getDisplayModeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridOriginEnumType createGridOriginEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGridOriginEnumTypeFromString(KMLPackage.eINSTANCE.getGridOriginEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridOriginEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGridOriginEnumTypeToString(KMLPackage.eINSTANCE.getGridOriginEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIconStateEnumType createItemIconStateEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createItemIconStateEnumTypeFromString(KMLPackage.eINSTANCE.getItemIconStateEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemIconStateEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertItemIconStateEnumTypeToString(KMLPackage.eINSTANCE.getItemIconStateEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ItemIconStateEnumType> createItemIconStateTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<ItemIconStateEnumType> result = new ArrayList<ItemIconStateEnumType>();
		for (String item : split(initialValue)) {
			result.add(createItemIconStateEnumTypeFromString(KMLPackage.eINSTANCE.getItemIconStateEnumType(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemIconStateTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertItemIconStateEnumTypeToString(KMLPackage.eINSTANCE.getItemIconStateEnumType(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemTypeEnumType createListItemTypeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createListItemTypeEnumTypeFromString(KMLPackage.eINSTANCE.getListItemTypeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListItemTypeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListItemTypeEnumTypeToString(KMLPackage.eINSTANCE.getListItemTypeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshModeEnumType createRefreshModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRefreshModeEnumTypeFromString(KMLPackage.eINSTANCE.getRefreshModeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRefreshModeEnumTypeToString(KMLPackage.eINSTANCE.getRefreshModeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeEnumType createShapeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShapeEnumTypeFromString(KMLPackage.eINSTANCE.getShapeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShapeEnumTypeToString(KMLPackage.eINSTANCE.getShapeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleStateEnumType createStyleStateEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleStateEnumTypeFromString(KMLPackage.eINSTANCE.getStyleStateEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleStateEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleStateEnumTypeToString(KMLPackage.eINSTANCE.getStyleStateEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsEnumType createUnitsEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsEnumTypeFromString(KMLPackage.eINSTANCE.getUnitsEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsEnumTypeToString(KMLPackage.eINSTANCE.getUnitsEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshModeEnumType createViewRefreshModeEnumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createViewRefreshModeEnumTypeFromString(KMLPackage.eINSTANCE.getViewRefreshModeEnumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewRefreshModeEnumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertViewRefreshModeEnumTypeToString(KMLPackage.eINSTANCE.getViewRefreshModeEnumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KMLPackage getKMLPackage() {
		return (KMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KMLPackage getPackage() {
		return KMLPackage.eINSTANCE;
	}

} //KMLFactoryImpl
