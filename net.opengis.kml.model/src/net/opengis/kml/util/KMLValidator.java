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

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.kml.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.kml.KMLPackage
 * @generated
 */
public class KMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KMLValidator INSTANCE = new KMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.kml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMLValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return KMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case KMLPackage.ABSTRACT_COLOR_STYLE_TYPE:
				return validateAbstractColorStyleType((AbstractColorStyleType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_CONTAINER_TYPE:
				return validateAbstractContainerType((AbstractContainerType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_FEATURE_TYPE:
				return validateAbstractFeatureType((AbstractFeatureType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_GEOMETRY_TYPE:
				return validateAbstractGeometryType((AbstractGeometryType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_LAT_LON_BOX_TYPE:
				return validateAbstractLatLonBoxType((AbstractLatLonBoxType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_OBJECT_TYPE:
				return validateAbstractObjectType((AbstractObjectType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_OVERLAY_TYPE:
				return validateAbstractOverlayType((AbstractOverlayType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_STYLE_SELECTOR_TYPE:
				return validateAbstractStyleSelectorType((AbstractStyleSelectorType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_SUB_STYLE_TYPE:
				return validateAbstractSubStyleType((AbstractSubStyleType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE:
				return validateAbstractTimePrimitiveType((AbstractTimePrimitiveType)value, diagnostics, context);
			case KMLPackage.ABSTRACT_VIEW_TYPE:
				return validateAbstractViewType((AbstractViewType)value, diagnostics, context);
			case KMLPackage.ALIAS_TYPE:
				return validateAliasType((AliasType)value, diagnostics, context);
			case KMLPackage.BALLOON_STYLE_TYPE:
				return validateBalloonStyleType((BalloonStyleType)value, diagnostics, context);
			case KMLPackage.BASIC_LINK_TYPE:
				return validateBasicLinkType((BasicLinkType)value, diagnostics, context);
			case KMLPackage.BOUNDARY_TYPE:
				return validateBoundaryType((BoundaryType)value, diagnostics, context);
			case KMLPackage.CAMERA_TYPE:
				return validateCameraType((CameraType)value, diagnostics, context);
			case KMLPackage.CHANGE_TYPE:
				return validateChangeType((ChangeType)value, diagnostics, context);
			case KMLPackage.CREATE_TYPE:
				return validateCreateType((CreateType)value, diagnostics, context);
			case KMLPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case KMLPackage.DELETE_TYPE:
				return validateDeleteType((DeleteType)value, diagnostics, context);
			case KMLPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case KMLPackage.DOCUMENT_TYPE:
				return validateDocumentType((DocumentType)value, diagnostics, context);
			case KMLPackage.EXTENDED_DATA_TYPE:
				return validateExtendedDataType((ExtendedDataType)value, diagnostics, context);
			case KMLPackage.FOLDER_TYPE:
				return validateFolderType((FolderType)value, diagnostics, context);
			case KMLPackage.GROUND_OVERLAY_TYPE:
				return validateGroundOverlayType((GroundOverlayType)value, diagnostics, context);
			case KMLPackage.ICON_STYLE_TYPE:
				return validateIconStyleType((IconStyleType)value, diagnostics, context);
			case KMLPackage.IMAGE_PYRAMID_TYPE:
				return validateImagePyramidType((ImagePyramidType)value, diagnostics, context);
			case KMLPackage.ITEM_ICON_TYPE:
				return validateItemIconType((ItemIconType)value, diagnostics, context);
			case KMLPackage.KML_TYPE:
				return validateKmlType((KmlType)value, diagnostics, context);
			case KMLPackage.LABEL_STYLE_TYPE:
				return validateLabelStyleType((LabelStyleType)value, diagnostics, context);
			case KMLPackage.LAT_LON_ALT_BOX_TYPE:
				return validateLatLonAltBoxType((LatLonAltBoxType)value, diagnostics, context);
			case KMLPackage.LAT_LON_BOX_TYPE:
				return validateLatLonBoxType((LatLonBoxType)value, diagnostics, context);
			case KMLPackage.LINEAR_RING_TYPE:
				return validateLinearRingType((LinearRingType)value, diagnostics, context);
			case KMLPackage.LINE_STRING_TYPE:
				return validateLineStringType((LineStringType)value, diagnostics, context);
			case KMLPackage.LINE_STYLE_TYPE:
				return validateLineStyleType((LineStyleType)value, diagnostics, context);
			case KMLPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case KMLPackage.LIST_STYLE_TYPE:
				return validateListStyleType((ListStyleType)value, diagnostics, context);
			case KMLPackage.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case KMLPackage.LOD_TYPE:
				return validateLodType((LodType)value, diagnostics, context);
			case KMLPackage.LOOK_AT_TYPE:
				return validateLookAtType((LookAtType)value, diagnostics, context);
			case KMLPackage.METADATA_TYPE:
				return validateMetadataType((MetadataType)value, diagnostics, context);
			case KMLPackage.MODEL_TYPE:
				return validateModelType((ModelType)value, diagnostics, context);
			case KMLPackage.MULTI_GEOMETRY_TYPE:
				return validateMultiGeometryType((MultiGeometryType)value, diagnostics, context);
			case KMLPackage.NETWORK_LINK_CONTROL_TYPE:
				return validateNetworkLinkControlType((NetworkLinkControlType)value, diagnostics, context);
			case KMLPackage.NETWORK_LINK_TYPE:
				return validateNetworkLinkType((NetworkLinkType)value, diagnostics, context);
			case KMLPackage.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case KMLPackage.PAIR_TYPE:
				return validatePairType((PairType)value, diagnostics, context);
			case KMLPackage.PHOTO_OVERLAY_TYPE:
				return validatePhotoOverlayType((PhotoOverlayType)value, diagnostics, context);
			case KMLPackage.PLACEMARK_TYPE:
				return validatePlacemarkType((PlacemarkType)value, diagnostics, context);
			case KMLPackage.POINT_TYPE:
				return validatePointType((PointType)value, diagnostics, context);
			case KMLPackage.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case KMLPackage.POLY_STYLE_TYPE:
				return validatePolyStyleType((PolyStyleType)value, diagnostics, context);
			case KMLPackage.REGION_TYPE:
				return validateRegionType((RegionType)value, diagnostics, context);
			case KMLPackage.RESOURCE_MAP_TYPE:
				return validateResourceMapType((ResourceMapType)value, diagnostics, context);
			case KMLPackage.SCALE_TYPE:
				return validateScaleType((ScaleType)value, diagnostics, context);
			case KMLPackage.SCHEMA_DATA_TYPE:
				return validateSchemaDataType((SchemaDataType)value, diagnostics, context);
			case KMLPackage.SCHEMA_TYPE:
				return validateSchemaType((SchemaType)value, diagnostics, context);
			case KMLPackage.SCREEN_OVERLAY_TYPE:
				return validateScreenOverlayType((ScreenOverlayType)value, diagnostics, context);
			case KMLPackage.SIMPLE_DATA_TYPE:
				return validateSimpleDataType((SimpleDataType)value, diagnostics, context);
			case KMLPackage.SIMPLE_FIELD_TYPE:
				return validateSimpleFieldType((SimpleFieldType)value, diagnostics, context);
			case KMLPackage.SNIPPET_TYPE:
				return validateSnippetType((SnippetType)value, diagnostics, context);
			case KMLPackage.STYLE_MAP_TYPE:
				return validateStyleMapType((StyleMapType)value, diagnostics, context);
			case KMLPackage.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case KMLPackage.TIME_SPAN_TYPE:
				return validateTimeSpanType((TimeSpanType)value, diagnostics, context);
			case KMLPackage.TIME_STAMP_TYPE:
				return validateTimeStampType((TimeStampType)value, diagnostics, context);
			case KMLPackage.UPDATE_TYPE:
				return validateUpdateType((UpdateType)value, diagnostics, context);
			case KMLPackage.VEC2_TYPE:
				return validateVec2Type((Vec2Type)value, diagnostics, context);
			case KMLPackage.VIEW_VOLUME_TYPE:
				return validateViewVolumeType((ViewVolumeType)value, diagnostics, context);
			case KMLPackage.ALTITUDE_MODE_ENUM_TYPE:
				return validateAltitudeModeEnumType((AltitudeModeEnumType)value, diagnostics, context);
			case KMLPackage.COLOR_MODE_ENUM_TYPE:
				return validateColorModeEnumType((ColorModeEnumType)value, diagnostics, context);
			case KMLPackage.DISPLAY_MODE_ENUM_TYPE:
				return validateDisplayModeEnumType((DisplayModeEnumType)value, diagnostics, context);
			case KMLPackage.GRID_ORIGIN_ENUM_TYPE:
				return validateGridOriginEnumType((GridOriginEnumType)value, diagnostics, context);
			case KMLPackage.ITEM_ICON_STATE_ENUM_TYPE:
				return validateItemIconStateEnumType((ItemIconStateEnumType)value, diagnostics, context);
			case KMLPackage.LIST_ITEM_TYPE_ENUM_TYPE:
				return validateListItemTypeEnumType((ListItemTypeEnumType)value, diagnostics, context);
			case KMLPackage.REFRESH_MODE_ENUM_TYPE:
				return validateRefreshModeEnumType((RefreshModeEnumType)value, diagnostics, context);
			case KMLPackage.SHAPE_ENUM_TYPE:
				return validateShapeEnumType((ShapeEnumType)value, diagnostics, context);
			case KMLPackage.STYLE_STATE_ENUM_TYPE:
				return validateStyleStateEnumType((StyleStateEnumType)value, diagnostics, context);
			case KMLPackage.UNITS_ENUM_TYPE:
				return validateUnitsEnumType((UnitsEnumType)value, diagnostics, context);
			case KMLPackage.VIEW_REFRESH_MODE_ENUM_TYPE:
				return validateViewRefreshModeEnumType((ViewRefreshModeEnumType)value, diagnostics, context);
			case KMLPackage.ALTITUDE_MODE_ENUM_TYPE_OBJECT:
				return validateAltitudeModeEnumTypeObject((AltitudeModeEnumType)value, diagnostics, context);
			case KMLPackage.ANGLE180_TYPE:
				return validateAngle180Type((Double)value, diagnostics, context);
			case KMLPackage.ANGLE180_TYPE_OBJECT:
				return validateAngle180TypeObject((Double)value, diagnostics, context);
			case KMLPackage.ANGLE360_TYPE:
				return validateAngle360Type((Double)value, diagnostics, context);
			case KMLPackage.ANGLE360_TYPE_OBJECT:
				return validateAngle360TypeObject((Double)value, diagnostics, context);
			case KMLPackage.ANGLE90_TYPE:
				return validateAngle90Type((Double)value, diagnostics, context);
			case KMLPackage.ANGLE90_TYPE_OBJECT:
				return validateAngle90TypeObject((Double)value, diagnostics, context);
			case KMLPackage.ANGLEPOS180_TYPE:
				return validateAnglepos180Type((Double)value, diagnostics, context);
			case KMLPackage.ANGLEPOS180_TYPE_OBJECT:
				return validateAnglepos180TypeObject((Double)value, diagnostics, context);
			case KMLPackage.ANGLEPOS90_TYPE:
				return validateAnglepos90Type((Double)value, diagnostics, context);
			case KMLPackage.ANGLEPOS90_TYPE_OBJECT:
				return validateAnglepos90TypeObject((Double)value, diagnostics, context);
			case KMLPackage.COLOR_MODE_ENUM_TYPE_OBJECT:
				return validateColorModeEnumTypeObject((ColorModeEnumType)value, diagnostics, context);
			case KMLPackage.COLOR_TYPE:
				return validateColorType((byte[])value, diagnostics, context);
			case KMLPackage.COORDINATES_TYPE:
				return validateCoordinatesType((List<?>)value, diagnostics, context);
			case KMLPackage.DATE_TIME_TYPE:
				return validateDateTimeType((XMLGregorianCalendar)value, diagnostics, context);
			case KMLPackage.DISPLAY_MODE_ENUM_TYPE_OBJECT:
				return validateDisplayModeEnumTypeObject((DisplayModeEnumType)value, diagnostics, context);
			case KMLPackage.GRID_ORIGIN_ENUM_TYPE_OBJECT:
				return validateGridOriginEnumTypeObject((GridOriginEnumType)value, diagnostics, context);
			case KMLPackage.ITEM_ICON_STATE_ENUM_TYPE_OBJECT:
				return validateItemIconStateEnumTypeObject((ItemIconStateEnumType)value, diagnostics, context);
			case KMLPackage.ITEM_ICON_STATE_TYPE:
				return validateItemIconStateType((List<?>)value, diagnostics, context);
			case KMLPackage.LIST_ITEM_TYPE_ENUM_TYPE_OBJECT:
				return validateListItemTypeEnumTypeObject((ListItemTypeEnumType)value, diagnostics, context);
			case KMLPackage.REFRESH_MODE_ENUM_TYPE_OBJECT:
				return validateRefreshModeEnumTypeObject((RefreshModeEnumType)value, diagnostics, context);
			case KMLPackage.SHAPE_ENUM_TYPE_OBJECT:
				return validateShapeEnumTypeObject((ShapeEnumType)value, diagnostics, context);
			case KMLPackage.STYLE_STATE_ENUM_TYPE_OBJECT:
				return validateStyleStateEnumTypeObject((StyleStateEnumType)value, diagnostics, context);
			case KMLPackage.UNITS_ENUM_TYPE_OBJECT:
				return validateUnitsEnumTypeObject((UnitsEnumType)value, diagnostics, context);
			case KMLPackage.VIEW_REFRESH_MODE_ENUM_TYPE_OBJECT:
				return validateViewRefreshModeEnumTypeObject((ViewRefreshModeEnumType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractColorStyleType(AbstractColorStyleType abstractColorStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractColorStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractContainerType(AbstractContainerType abstractContainerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractContainerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureType(AbstractFeatureType abstractFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeometryType(AbstractGeometryType abstractGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractLatLonBoxType(AbstractLatLonBoxType abstractLatLonBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractLatLonBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractObjectType(AbstractObjectType abstractObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractOverlayType(AbstractOverlayType abstractOverlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractOverlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractStyleSelectorType(AbstractStyleSelectorType abstractStyleSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractStyleSelectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSubStyleType(AbstractSubStyleType abstractSubStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSubStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimePrimitiveType(AbstractTimePrimitiveType abstractTimePrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimePrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractViewType(AbstractViewType abstractViewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasType(AliasType aliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalloonStyleType(BalloonStyleType balloonStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(balloonStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicLinkType(BasicLinkType basicLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryType(BoundaryType boundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCameraType(CameraType cameraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cameraType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeType(ChangeType changeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateType(CreateType createType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteType(DeleteType deleteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deleteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedDataType(ExtendedDataType extendedDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderType(FolderType folderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(folderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroundOverlayType(GroundOverlayType groundOverlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groundOverlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconStyleType(IconStyleType iconStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iconStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagePyramidType(ImagePyramidType imagePyramidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagePyramidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconType(ItemIconType itemIconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemIconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKmlType(KmlType kmlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kmlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelStyleType(LabelStyleType labelStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatLonAltBoxType(LatLonAltBoxType latLonAltBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latLonAltBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatLonBoxType(LatLonBoxType latLonBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latLonBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearRingType(LinearRingType linearRingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearRingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStringType(LineStringType lineStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStyleType(LineStyleType lineStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleType(ListStyleType listStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLodType(LodType lodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLookAtType(LookAtType lookAtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lookAtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataType(MetadataType metadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelType(ModelType modelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiGeometryType(MultiGeometryType multiGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkLinkControlType(NetworkLinkControlType networkLinkControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkLinkControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkLinkType(NetworkLinkType networkLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePairType(PairType pairType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pairType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhotoOverlayType(PhotoOverlayType photoOverlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(photoOverlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacemarkType(PlacemarkType placemarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placemarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolyStyleType(PolyStyleType polyStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polyStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionType(RegionType regionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceMapType(ResourceMapType resourceMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleType(ScaleType scaleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaDataType(SchemaDataType schemaDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaType(SchemaType schemaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenOverlayType(ScreenOverlayType screenOverlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(screenOverlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDataType(SimpleDataType simpleDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleFieldType(SimpleFieldType simpleFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSnippetType(SnippetType snippetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(snippetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleMapType(StyleMapType styleMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType(StyleType styleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSpanType(TimeSpanType timeSpanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSpanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStampType(TimeStampType timeStampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateType(UpdateType updateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVec2Type(Vec2Type vec2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vec2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewVolumeType(ViewVolumeType viewVolumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewVolumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltitudeModeEnumType(AltitudeModeEnumType altitudeModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorModeEnumType(ColorModeEnumType colorModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayModeEnumType(DisplayModeEnumType displayModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridOriginEnumType(GridOriginEnumType gridOriginEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateEnumType(ItemIconStateEnumType itemIconStateEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItemTypeEnumType(ListItemTypeEnumType listItemTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshModeEnumType(RefreshModeEnumType refreshModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeEnumType(ShapeEnumType shapeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleStateEnumType(StyleStateEnumType styleStateEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsEnumType(UnitsEnumType unitsEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewRefreshModeEnumType(ViewRefreshModeEnumType viewRefreshModeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltitudeModeEnumTypeObject(AltitudeModeEnumType altitudeModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180Type(double angle180Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle180Type_Min(angle180Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle180Type_Max(angle180Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle180Type_Min
	 */
	public static final double ANGLE180_TYPE__MIN__VALUE = -180.0;

	/**
	 * Validates the Min constraint of '<em>Angle180 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180Type_Min(double angle180Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle180Type >= ANGLE180_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(KMLPackage.eINSTANCE.getAngle180Type(), angle180Type, ANGLE180_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle180Type_Max
	 */
	public static final double ANGLE180_TYPE__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Angle180 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180Type_Max(double angle180Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle180Type <= ANGLE180_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(KMLPackage.eINSTANCE.getAngle180Type(), angle180Type, ANGLE180_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180TypeObject(Double angle180TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle180Type_Min(angle180TypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle180Type_Max(angle180TypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360Type(double angle360Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle360Type_Min(angle360Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle360Type_Max(angle360Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle360Type_Min
	 */
	public static final double ANGLE360_TYPE__MIN__VALUE = -360.0;

	/**
	 * Validates the Min constraint of '<em>Angle360 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360Type_Min(double angle360Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle360Type >= ANGLE360_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(KMLPackage.eINSTANCE.getAngle360Type(), angle360Type, ANGLE360_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle360Type_Max
	 */
	public static final double ANGLE360_TYPE__MAX__VALUE = 360.0;

	/**
	 * Validates the Max constraint of '<em>Angle360 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360Type_Max(double angle360Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle360Type <= ANGLE360_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(KMLPackage.eINSTANCE.getAngle360Type(), angle360Type, ANGLE360_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360TypeObject(Double angle360TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle360Type_Min(angle360TypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle360Type_Max(angle360TypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90Type(double angle90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle90Type_Min(angle90Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle90Type_Max(angle90Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle90Type_Min
	 */
	public static final double ANGLE90_TYPE__MIN__VALUE = -90.0;

	/**
	 * Validates the Min constraint of '<em>Angle90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90Type_Min(double angle90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle90Type >= ANGLE90_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(KMLPackage.eINSTANCE.getAngle90Type(), angle90Type, ANGLE90_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle90Type_Max
	 */
	public static final double ANGLE90_TYPE__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Angle90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90Type_Max(double angle90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle90Type <= ANGLE90_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(KMLPackage.eINSTANCE.getAngle90Type(), angle90Type, ANGLE90_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90TypeObject(Double angle90TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle90Type_Min(angle90TypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle90Type_Max(angle90TypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos180Type(double anglepos180Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnglepos180Type_Min(anglepos180Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnglepos180Type_Max(anglepos180Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnglepos180Type_Min
	 */
	public static final double ANGLEPOS180_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Anglepos180 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos180Type_Min(double anglepos180Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = anglepos180Type >= ANGLEPOS180_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(KMLPackage.eINSTANCE.getAnglepos180Type(), anglepos180Type, ANGLEPOS180_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnglepos180Type_Max
	 */
	public static final double ANGLEPOS180_TYPE__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Anglepos180 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos180Type_Max(double anglepos180Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = anglepos180Type <= ANGLEPOS180_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(KMLPackage.eINSTANCE.getAnglepos180Type(), anglepos180Type, ANGLEPOS180_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos180TypeObject(Double anglepos180TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnglepos180Type_Min(anglepos180TypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnglepos180Type_Max(anglepos180TypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90Type(double anglepos90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnglepos90Type_Min(anglepos90Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnglepos90Type_Max(anglepos90Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnglepos90Type_Min
	 */
	public static final double ANGLEPOS90_TYPE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Anglepos90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90Type_Min(double anglepos90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = anglepos90Type >= ANGLEPOS90_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(KMLPackage.eINSTANCE.getAnglepos90Type(), anglepos90Type, ANGLEPOS90_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnglepos90Type_Max
	 */
	public static final double ANGLEPOS90_TYPE__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Anglepos90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90Type_Max(double anglepos90Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = anglepos90Type <= ANGLEPOS90_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(KMLPackage.eINSTANCE.getAnglepos90Type(), anglepos90Type, ANGLEPOS90_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90TypeObject(Double anglepos90TypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnglepos90Type_Min(anglepos90TypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnglepos90Type_Max(anglepos90TypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorModeEnumTypeObject(ColorModeEnumType colorModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType(byte[] colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorType_MinLength(colorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateColorType_MaxLength(colorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType_MinLength(byte[] colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = colorType.length;
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(KMLPackage.eINSTANCE.getColorType(), colorType, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType_MaxLength(byte[] colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = colorType.length;
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(KMLPackage.eINSTANCE.getColorType(), colorType, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType(List<?> coordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCoordinatesType_ItemType(coordinatesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Coordinates Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType_ItemType(List<?> coordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = coordinatesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.STRING.isInstance(item)) {
				result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType(XMLGregorianCalendar dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeType_MemberTypes(dateTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType_MemberTypes(XMLGregorianCalendar dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDateTime(dateTimeType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDate(dateTimeType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimeType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYear(dateTimeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDateTime(dateTimeType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDate(dateTimeType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimeType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYear(dateTimeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayModeEnumTypeObject(DisplayModeEnumType displayModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridOriginEnumTypeObject(GridOriginEnumType gridOriginEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateEnumTypeObject(ItemIconStateEnumType itemIconStateEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateType(List<?> itemIconStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateItemIconStateType_ItemType(itemIconStateType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Item Icon State Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateType_ItemType(List<?> itemIconStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = itemIconStateType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (KMLPackage.eINSTANCE.getItemIconStateEnumType().isInstance(item)) {
				result &= validateItemIconStateEnumType((ItemIconStateEnumType)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(KMLPackage.eINSTANCE.getItemIconStateEnumType(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItemTypeEnumTypeObject(ListItemTypeEnumType listItemTypeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshModeEnumTypeObject(RefreshModeEnumType refreshModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeEnumTypeObject(ShapeEnumType shapeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleStateEnumTypeObject(StyleStateEnumType styleStateEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsEnumTypeObject(UnitsEnumType unitsEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewRefreshModeEnumTypeObject(ViewRefreshModeEnumType viewRefreshModeEnumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //KMLValidator
