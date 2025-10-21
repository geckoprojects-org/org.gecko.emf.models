/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AAAFactoryImpl extends EFactoryImpl implements AAAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AAAFactory init() {
		try {
			AAAFactory theAAAFactory = (AAAFactory)EPackage.Registry.INSTANCE.getEFactory(AAAPackage.eNS_URI);
			if (theAAAFactory != null) {
				return theAAAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AAAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAAFactoryImpl() {
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
			case AAAPackage.ADDITIONAL_FILTER_TYPE: return createAdditionalFilterType();
			case AAAPackage.ADDITIONAL_FILTER_TYPE1: return createAdditionalFilterType1();
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_PROPERTY_TYPE: return createAdditionalSymbolizersPropertyType();
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE: return createAdditionalSymbolizersType();
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1: return createAdditionalSymbolizersType1();
			case AAAPackage.AREA_GRAPHIC_PROPERTY_TYPE: return createAreaGraphicPropertyType();
			case AAAPackage.AREA_GRAPHIC_TYPE: return createAreaGraphicType();
			case AAAPackage.AREA_SYMBOLIZER_PROPERTY_TYPE: return createAreaSymbolizerPropertyType();
			case AAAPackage.AREA_SYMBOLIZER_TYPE: return createAreaSymbolizerType();
			case AAAPackage.BACKGROUND_BORDER_TYPE: return createBackgroundBorderType();
			case AAAPackage.BACKGROUND_FILL_TYPE: return createBackgroundFillType();
			case AAAPackage.BOTTOM_EDGE_TYPE: return createBottomEdgeType();
			case AAAPackage.BOUNDARY_TYPE: return createBoundaryType();
			case AAAPackage.BOUNDARY_TYPE1: return createBoundaryType1();
			case AAAPackage.BOUNDARY_TYPE2: return createBoundaryType2();
			case AAAPackage.BOUNDING_BOX_POINT_PROPERTY_TYPE: return createBoundingBoxPointPropertyType();
			case AAAPackage.BOUNDING_BOX_POINT_TYPE: return createBoundingBoxPointType();
			case AAAPackage.CENTER_POINT_PROPERTY_TYPE: return createCenterPointPropertyType();
			case AAAPackage.CENTER_POINT_TYPE: return createCenterPointType();
			case AAAPackage.CIRCULAR_ARC_PROPERTY_TYPE: return createCircularArcPropertyType();
			case AAAPackage.CIRCULAR_ARC_TYPE: return createCircularArcType();
			case AAAPackage.CLOSE_PROPERTY_TYPE: return createClosePropertyType();
			case AAAPackage.CLOSE_TYPE: return createCloseType();
			case AAAPackage.COLOR_CMYK_PROPERTY_TYPE: return createColorCMYKPropertyType();
			case AAAPackage.COLOR_CMYK_TYPE: return createColorCMYKType();
			case AAAPackage.COLOR_PROPERTY_TYPE: return createColorPropertyType();
			case AAAPackage.COLOR_RGB_PROPERTY_TYPE: return createColorRGBPropertyType();
			case AAAPackage.COLOR_RGB_TYPE: return createColorRGBType();
			case AAAPackage.COLOR_TYPE: return createColorType();
			case AAAPackage.COLOR_TYPE1: return createColorType1();
			case AAAPackage.COMPOSITE_GRAPHIC_PROPERTY_TYPE: return createCompositeGraphicPropertyType();
			case AAAPackage.COMPOSITE_GRAPHIC_TYPE: return createCompositeGraphicType();
			case AAAPackage.COMPOUND_STROKE_PROPERTY_TYPE: return createCompoundStrokePropertyType();
			case AAAPackage.COMPOUND_STROKE_SECTION_PROPERTY_TYPE: return createCompoundStrokeSectionPropertyType();
			case AAAPackage.COMPOUND_STROKE_TYPE: return createCompoundStrokeType();
			case AAAPackage.CONDITION_TYPE: return createConditionType();
			case AAAPackage.CURRENT_STEP_PROPERTY_TYPE: return createCurrentStepPropertyType();
			case AAAPackage.CURRENT_STEP_TYPE: return createCurrentStepType();
			case AAAPackage.CURVETO_PROPERTY_TYPE: return createCurvetoPropertyType();
			case AAAPackage.CURVETO_TYPE: return createCurvetoType();
			case AAAPackage.DASHED_STROKE_PROPERTY_TYPE: return createDashedStrokePropertyType();
			case AAAPackage.DASHED_STROKE_TYPE: return createDashedStrokeType();
			case AAAPackage.DESIGN_RULE_PROPERTY_TYPE: return createDesignRulePropertyType();
			case AAAPackage.DESIGN_RULE_TYPE: return createDesignRuleType();
			case AAAPackage.DESIGN_RULE_TYPE1: return createDesignRuleType1();
			case AAAPackage.DISPLACEMENT_PROPERTY_TYPE: return createDisplacementPropertyType();
			case AAAPackage.DISPLACEMENT_TYPE: return createDisplacementType();
			case AAAPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AAAPackage.ELEMENT_PROPERTY_TYPE: return createElementPropertyType();
			case AAAPackage.ELEMENT_TYPE: return createElementType();
			case AAAPackage.ELSE_TYPE: return createElseType();
			case AAAPackage.EMIT_PROPERTY_TYPE: return createEmitPropertyType();
			case AAAPackage.EMIT_TYPE: return createEmitType();
			case AAAPackage.EMIT_TYPE1: return createEmitType1();
			case AAAPackage.EVERY_PROPERTY_TYPE: return createEveryPropertyType();
			case AAAPackage.EVERY_TYPE: return createEveryType();
			case AAAPackage.EXPRESSION_PROPERTY_TYPE: return createExpressionPropertyType();
			case AAAPackage.EXPRESSION_TYPE: return createExpressionType();
			case AAAPackage.FEATURE_TYPE_STEP_PROPERTY_TYPE: return createFeatureTypeStepPropertyType();
			case AAAPackage.FEATURE_TYPE_STEP_TYPE: return createFeatureTypeStepType();
			case AAAPackage.FILL_PROPERTY_TYPE: return createFillPropertyType();
			case AAAPackage.FILTERED_SYMBOLIZER_PROPERTY_TYPE: return createFilteredSymbolizerPropertyType();
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE: return createFilteredSymbolizerType();
			case AAAPackage.FILTER_PROPERTY_TYPE: return createFilterPropertyType();
			case AAAPackage.FILTER_TYPE: return createFilterType();
			case AAAPackage.FILTER_TYPE1: return createFilterType1();
			case AAAPackage.FIRST_STEP_PROPERTY_TYPE: return createFirstStepPropertyType();
			case AAAPackage.FIRST_STEP_TYPE: return createFirstStepType();
			case AAAPackage.FONT_PROPERTY_TYPE: return createFontPropertyType();
			case AAAPackage.FONT_TYPE: return createFontType();
			case AAAPackage.FONT_TYPE1: return createFontType1();
			case AAAPackage.FOR_PROPERTY_TYPE: return createForPropertyType();
			case AAAPackage.FOR_TYPE: return createForType();
			case AAAPackage.GAP_PROPERTY_TYPE: return createGapPropertyType();
			case AAAPackage.GAP_TYPE: return createGapType();
			case AAAPackage.GEOMETRY_TYPE: return createGeometryType();
			case AAAPackage.GEOMETRY_TYPE1: return createGeometryType1();
			case AAAPackage.GEOMETRY_TYPE2: return createGeometryType2();
			case AAAPackage.GRAPHIC_FILL_PROPERTY_TYPE: return createGraphicFillPropertyType();
			case AAAPackage.GRAPHIC_FILL_TYPE: return createGraphicFillType();
			case AAAPackage.GRAPHIC_PROPERTY_TYPE: return createGraphicPropertyType();
			case AAAPackage.GRAPHIC_TYPE: return createGraphicType();
			case AAAPackage.GRAPHIC_TYPE1: return createGraphicType1();
			case AAAPackage.GRAPHIC_TYPE2: return createGraphicType2();
			case AAAPackage.HALO_COLOR_TYPE: return createHaloColorType();
			case AAAPackage.HALO_PROPERTY_TYPE: return createHaloPropertyType();
			case AAAPackage.HALO_TYPE: return createHaloType();
			case AAAPackage.HALO_TYPE1: return createHaloType1();
			case AAAPackage.HALO_TYPE2: return createHaloType2();
			case AAAPackage.HATCH_DEFINITION_LONGEST_SIDE_PROPERTY_TYPE: return createHatchDefinitionLongestSidePropertyType();
			case AAAPackage.HATCH_DEFINITION_PROPERTY_TYPE: return createHatchDefinitionPropertyType();
			case AAAPackage.HATCH_FILL_LONGEST_SIDE_PROPERTY_TYPE: return createHatchFillLongestSidePropertyType();
			case AAAPackage.HATCH_FILL_LONGEST_SIDE_TYPE: return createHatchFillLongestSideType();
			case AAAPackage.HATCH_FILL_PROPERTY_TYPE: return createHatchFillPropertyType();
			case AAAPackage.HATCH_FILL_TYPE: return createHatchFillType();
			case AAAPackage.HATCH_LINES_LONGEST_SIDE_PROPERTY_TYPE: return createHatchLinesLongestSidePropertyType();
			case AAAPackage.HATCH_LINES_LONGEST_SIDE_TYPE: return createHatchLinesLongestSideType();
			case AAAPackage.HATCH_LINES_PROPERTY_TYPE: return createHatchLinesPropertyType();
			case AAAPackage.HATCH_LINES_TYPE: return createHatchLinesType();
			case AAAPackage.IF_PROPERTY_TYPE: return createIfPropertyType();
			case AAAPackage.IF_TYPE: return createIfType();
			case AAAPackage.INTERIOR_TYPE: return createInteriorType();
			case AAAPackage.INTERIOR_TYPE1: return createInteriorType1();
			case AAAPackage.IN_TYPE: return createInType();
			case AAAPackage.IN_TYPE1: return createInType1();
			case AAAPackage.LABEL_PROPERTY_TYPE: return createLabelPropertyType();
			case AAAPackage.LABEL_TEXT_TYPE: return createLabelTextType();
			case AAAPackage.LABEL_TEXT_TYPE1: return createLabelTextType1();
			case AAAPackage.LABEL_TYPE: return createLabelType();
			case AAAPackage.LABEL_TYPE1: return createLabelType1();
			case AAAPackage.LABEL_TYPE2: return createLabelType2();
			case AAAPackage.LABEL_TYPE3: return createLabelType3();
			case AAAPackage.LAYER_PROPERTY_TYPE: return createLayerPropertyType();
			case AAAPackage.LAYER_TYPE: return createLayerType();
			case AAAPackage.LAYER_TYPE1: return createLayerType1();
			case AAAPackage.LINE_GRAPHIC_PROPERTY_TYPE: return createLineGraphicPropertyType();
			case AAAPackage.LINE_GRAPHIC_TYPE: return createLineGraphicType();
			case AAAPackage.LINE_LABEL_PROPERTY_TYPE: return createLineLabelPropertyType();
			case AAAPackage.LINE_LABEL_TYPE: return createLineLabelType();
			case AAAPackage.LINE_PLACED_GRAPHIC_PROPERTY_TYPE: return createLinePlacedGraphicPropertyType();
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE: return createLinePlacedGraphicType();
			case AAAPackage.LINE_SYMBOLIZER_PROPERTY_TYPE: return createLineSymbolizerPropertyType();
			case AAAPackage.LINE_SYMBOLIZER_TYPE: return createLineSymbolizerType();
			case AAAPackage.LINETO_PROPERTY_TYPE: return createLinetoPropertyType();
			case AAAPackage.LINETO_TYPE: return createLinetoType();
			case AAAPackage.LITERAL_PROPERTY_TYPE: return createLiteralPropertyType();
			case AAAPackage.LITERAL_TYPE: return createLiteralType();
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_PROPERTY_TYPE: return createMaximumAdjacentLineStringPropertyType();
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE: return createMaximumAdjacentLineStringType();
			case AAAPackage.MAXIMUM_ADJACENT_SURFACE_PROPERTY_TYPE: return createMaximumAdjacentSurfacePropertyType();
			case AAAPackage.MAXIMUM_ADJACENT_SURFACE_TYPE: return createMaximumAdjacentSurfaceType();
			case AAAPackage.MEASURE_LITERAL_PROPERTY_TYPE: return createMeasureLiteralPropertyType();
			case AAAPackage.MEASURE_LITERAL_TYPE: return createMeasureLiteralType();
			case AAAPackage.MEMBER_TYPE: return createMemberType();
			case AAAPackage.MOVETO_PROPERTY_TYPE: return createMovetoPropertyType();
			case AAAPackage.MOVETO_TYPE: return createMovetoType();
			case AAAPackage.NEIGHBORHOOD_FILTER_TYPE: return createNeighborhoodFilterType();
			case AAAPackage.NULL_COLOR_PROPERTY_TYPE: return createNullColorPropertyType();
			case AAAPackage.NULL_COLOR_TYPE: return createNullColorType();
			case AAAPackage.NULL_SYMBOLIZER_PROPERTY_TYPE: return createNullSymbolizerPropertyType();
			case AAAPackage.NULL_SYMBOLIZER_TYPE: return createNullSymbolizerType();
			case AAAPackage.OPERAND_TYPE: return createOperandType();
			case AAAPackage.OPERATION_PROPERTY_TYPE: return createOperationPropertyType();
			case AAAPackage.OPERATION_TYPE: return createOperationType();
			case AAAPackage.PATH_ELEMENT_PROPERTY_TYPE: return createPathElementPropertyType();
			case AAAPackage.PATH_PROPERTY_TYPE: return createPathPropertyType();
			case AAAPackage.PATH_TYPE: return createPathType();
			case AAAPackage.PERPENDICULAR_OFFSET_PROPERTY_TYPE: return createPerpendicularOffsetPropertyType();
			case AAAPackage.PERPENDICULAR_OFFSET_TYPE: return createPerpendicularOffsetType();
			case AAAPackage.PLACEMENT_RULE_PROPERTY_TYPE: return createPlacementRulePropertyType();
			case AAAPackage.PLACEMENT_TYPE: return createPlacementType();
			case AAAPackage.POINT_LABEL_PROPERTY_TYPE: return createPointLabelPropertyType();
			case AAAPackage.POINT_LABEL_TYPE: return createPointLabelType();
			case AAAPackage.POINTS_IN_AREA_DEFINITION_PROPERTY_TYPE: return createPointsInAreaDefinitionPropertyType();
			case AAAPackage.POINTS_IN_AREA_PROPERTY_TYPE: return createPointsInAreaPropertyType();
			case AAAPackage.POINTS_IN_AREA_TYPE: return createPointsInAreaType();
			case AAAPackage.POINTS_ON_LINE_PROPERTY_TYPE: return createPointsOnLinePropertyType();
			case AAAPackage.POINTS_ON_LINE_TYPE: return createPointsOnLineType();
			case AAAPackage.POINT_SYMBOLIZER_PROPERTY_TYPE: return createPointSymbolizerPropertyType();
			case AAAPackage.POINT_SYMBOLIZER_TYPE: return createPointSymbolizerType();
			case AAAPackage.POST_GRAPHIC_TYPE: return createPostGraphicType();
			case AAAPackage.PREDICATE_TYPE: return createPredicateType();
			case AAAPackage.PREDICATE_TYPE1: return createPredicateType1();
			case AAAPackage.PRE_GRAPHIC_TYPE: return createPreGraphicType();
			case AAAPackage.PROPERTY_PROPERTY_TYPE: return createPropertyPropertyType();
			case AAAPackage.PROPERTY_TYPE: return createPropertyType();
			case AAAPackage.PURE_SYMBOLIZER_PROPERTY_TYPE: return createPureSymbolizerPropertyType();
			case AAAPackage.PURE_SYMBOLIZER_TYPE: return createPureSymbolizerType();
			case AAAPackage.QUANTIFIER_PROPERTY_TYPE: return createQuantifierPropertyType();
			case AAAPackage.RELATE_FILTER_TYPE: return createRelateFilterType();
			case AAAPackage.RELATE_GEOMETRY_PROPERTY_TYPE: return createRelateGeometryPropertyType();
			case AAAPackage.RELATE_GEOMETRY_TYPE: return createRelateGeometryType();
			case AAAPackage.RELATE_TOPOLOGY_PROPERTY_TYPE: return createRelateTopologyPropertyType();
			case AAAPackage.RELATE_TOPOLOGY_TYPE: return createRelateTopologyType();
			case AAAPackage.RETURN_TYPE: return createReturnType();
			case AAAPackage.RULE_PROPERTY_TYPE: return createRulePropertyType();
			case AAAPackage.RULE_SET_PROPERTY_TYPE: return createRuleSetPropertyType();
			case AAAPackage.RULE_SET_TYPE: return createRuleSetType();
			case AAAPackage.RULE_SET_TYPE1: return createRuleSetType1();
			case AAAPackage.RULES_TO_CONSIDER_TYPE: return createRulesToConsiderType();
			case AAAPackage.RULE_TYPE: return createRuleType();
			case AAAPackage.RULE_TYPE1: return createRuleType1();
			case AAAPackage.SATISFIES_TYPE: return createSatisfiesType();
			case AAAPackage.SECTION_TYPE: return createSectionType();
			case AAAPackage.SELF_STEP_PROPERTY_TYPE: return createSelfStepPropertyType();
			case AAAPackage.SELF_STEP_TYPE: return createSelfStepType();
			case AAAPackage.SHIELDED_POINT_LABEL_PROPERTY_TYPE: return createShieldedPointLabelPropertyType();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE: return createShieldedPointLabelType();
			case AAAPackage.SIMPLE_GRAPHIC_PROPERTY_TYPE: return createSimpleGraphicPropertyType();
			case AAAPackage.SKELETON_LINE_PROPERTY_TYPE: return createSkeletonLinePropertyType();
			case AAAPackage.SKELETON_LINE_TYPE: return createSkeletonLineType();
			case AAAPackage.SLOPE_HATCH_LINES_PROPERTY_TYPE: return createSlopeHatchLinesPropertyType();
			case AAAPackage.SLOPE_HATCH_LINES_TYPE: return createSlopeHatchLinesType();
			case AAAPackage.SOLID_FILL_PROPERTY_TYPE: return createSolidFillPropertyType();
			case AAAPackage.SOLID_FILL_TYPE: return createSolidFillType();
			case AAAPackage.SOLID_OR_DASHED_STROKE_PROPERTY_TYPE: return createSolidOrDashedStrokePropertyType();
			case AAAPackage.SOLID_SECTION_PROPERTY_TYPE: return createSolidSectionPropertyType();
			case AAAPackage.SOLID_SECTION_TYPE: return createSolidSectionType();
			case AAAPackage.SOLID_STROKE_PROPERTY_TYPE: return createSolidStrokePropertyType();
			case AAAPackage.SOLID_STROKE_TYPE: return createSolidStrokeType();
			case AAAPackage.SOME_PROPERTY_TYPE: return createSomePropertyType();
			case AAAPackage.SOME_TYPE: return createSomeType();
			case AAAPackage.STEP_PROPERTY_TYPE: return createStepPropertyType();
			case AAAPackage.STEP_TYPE: return createStepType();
			case AAAPackage.STEP_TYPE1: return createStepType1();
			case AAAPackage.STROKE_PROPERTY_TYPE: return createStrokePropertyType();
			case AAAPackage.STROKE_TYPE: return createStrokeType();
			case AAAPackage.STROKE_TYPE1: return createStrokeType1();
			case AAAPackage.STROKE_TYPE2: return createStrokeType2();
			case AAAPackage.STROKE_TYPE3: return createStrokeType3();
			case AAAPackage.STROKE_TYPE4: return createStrokeType4();
			case AAAPackage.STYLE_PROPERTY_TYPE: return createStylePropertyType();
			case AAAPackage.STYLE_TYPE: return createStyleType();
			case AAAPackage.STYLE_TYPE1: return createStyleType1();
			case AAAPackage.SYMBOLIZER_PREDICATE_TYPE: return createSymbolizerPredicateType();
			case AAAPackage.SYMBOLIZER_PROPERTY_TYPE: return createSymbolizerPropertyType();
			case AAAPackage.SYMBOLIZER_TYPE: return createSymbolizerType();
			case AAAPackage.SYMBOLIZER_TYPE2: return createSymbolizerType2();
			case AAAPackage.SYMBOLOGY_CATALOG_PROPERTY_TYPE: return createSymbologyCatalogPropertyType();
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE: return createSymbologyCatalogType();
			case AAAPackage.TAG_PROPERTY_TYPE: return createTagPropertyType();
			case AAAPackage.TAG_SET_PROPERTY_TYPE: return createTagSetPropertyType();
			case AAAPackage.TAG_SET_TYPE: return createTagSetType();
			case AAAPackage.TAG_TYPE: return createTagType();
			case AAAPackage.TAG_TYPE1: return createTagType1();
			case AAAPackage.TARGET_COLOR_TYPE: return createTargetColorType();
			case AAAPackage.TEXT_BODY_FILL_TYPE: return createTextBodyFillType();
			case AAAPackage.TEXT_GRAPHIC_PROPERTY_TYPE: return createTextGraphicPropertyType();
			case AAAPackage.TEXT_GRAPHIC_TYPE: return createTextGraphicType();
			case AAAPackage.TEXT_SECTION_PROPERTY_TYPE: return createTextSectionPropertyType();
			case AAAPackage.TEXT_SECTION_TYPE: return createTextSectionType();
			case AAAPackage.TEXT_SYMBOLIZER_PROPERTY_TYPE: return createTextSymbolizerPropertyType();
			case AAAPackage.TEXT_SYMBOLIZER_TYPE: return createTextSymbolizerType();
			case AAAPackage.THEN_TYPE: return createThenType();
			case AAAPackage.TOP_EDGE_TYPE: return createTopEdgeType();
			case AAAPackage.TUBE_PROPERTY_TYPE: return createTubePropertyType();
			case AAAPackage.TUBE_TYPE: return createTubeType();
			case AAAPackage.VARIABLE_PROPERTY_TYPE: return createVariablePropertyType();
			case AAAPackage.VARIABLE_STEP_PROPERTY_TYPE: return createVariableStepPropertyType();
			case AAAPackage.VARIABLE_STEP_TYPE: return createVariableStepType();
			case AAAPackage.VARIABLE_TYPE: return createVariableType();
			case AAAPackage.VARIABLE_TYPE1: return createVariableType1();
			case AAAPackage.VARIABLE_TYPE2: return createVariableType2();
			case AAAPackage.VARIABLE_TYPE3: return createVariableType3();
			case AAAPackage.VARIANT_GEOMETRY_PROPERTY_TYPE: return createVariantGeometryPropertyType();
			case AAAPackage.VARIANT_GEOMETRY_TYPE: return createVariantGeometryType();
			case AAAPackage.VENDOR_SPECIFIC_TYPE: return createVendorSpecificType();
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
			case AAAPackage.ADJUSTMENT_TYPE:
				return createAdjustmentTypeFromString(eDataType, initialValue);
			case AAAPackage.BASIC_OBJECT_TYPE_TYPE:
				return createBasicObjectTypeTypeFromString(eDataType, initialValue);
			case AAAPackage.BOUNDARY_OVERLAP_TREATMENT_TYPE:
				return createBoundaryOverlapTreatmentTypeFromString(eDataType, initialValue);
			case AAAPackage.DATA_TYPE_TYPE:
				return createDataTypeTypeFromString(eDataType, initialValue);
			case AAAPackage.FONT_STYLE_TYPE:
				return createFontStyleTypeFromString(eDataType, initialValue);
			case AAAPackage.FONT_WEIGHT_TYPE:
				return createFontWeightTypeFromString(eDataType, initialValue);
			case AAAPackage.GEOMETRY_TYPE_TYPE:
				return createGeometryTypeTypeFromString(eDataType, initialValue);
			case AAAPackage.GEOMETRY_UNION_TYPE:
				return createGeometryUnionTypeFromString(eDataType, initialValue);
			case AAAPackage.HORIZONTAL_ALIGNMENT_TYPE:
				return createHorizontalAlignmentTypeFromString(eDataType, initialValue);
			case AAAPackage.LINE_CAPS_TYPE:
				return createLineCapsTypeFromString(eDataType, initialValue);
			case AAAPackage.LINE_JOIN_TYPE:
				return createLineJoinTypeFromString(eDataType, initialValue);
			case AAAPackage.NEIGHBOR_SEL_MODE_TYPE:
				return createNeighborSelModeTypeFromString(eDataType, initialValue);
			case AAAPackage.PRESENTATION_LOGIC_TYPE:
				return createPresentationLogicTypeFromString(eDataType, initialValue);
			case AAAPackage.REGULARITY_TYPE:
				return createRegularityTypeFromString(eDataType, initialValue);
			case AAAPackage.RELATE_TYPE:
				return createRelateTypeFromString(eDataType, initialValue);
			case AAAPackage.RELATIVE_ROTATION_TYPE:
				return createRelativeRotationTypeFromString(eDataType, initialValue);
			case AAAPackage.TEXT_DECORATION_TYPE:
				return createTextDecorationTypeFromString(eDataType, initialValue);
			case AAAPackage.UNIT_OF_MEASURE_TYPE:
				return createUnitOfMeasureTypeFromString(eDataType, initialValue);
			case AAAPackage.VERTICAL_ALIGNMENT_TYPE:
				return createVerticalAlignmentTypeFromString(eDataType, initialValue);
			case AAAPackage.ADJUSTMENT_TYPE_OBJECT:
				return createAdjustmentTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.BASIC_OBJECT_TYPE_TYPE_OBJECT:
				return createBasicObjectTypeTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.BOUNDARY_OVERLAP_TREATMENT_TYPE_OBJECT:
				return createBoundaryOverlapTreatmentTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.DASHARRAY_TYPE:
				return createDasharrayTypeFromString(eDataType, initialValue);
			case AAAPackage.DASHARRAY_TYPE_BASE:
				return createDasharrayTypeBaseFromString(eDataType, initialValue);
			case AAAPackage.DATA_TYPE_TYPE_OBJECT:
				return createDataTypeTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.FONT_STYLE_TYPE_OBJECT:
				return createFontStyleTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.FONT_WEIGHT_TYPE_OBJECT:
				return createFontWeightTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.GEOMETRY_TYPE_TYPE_OBJECT:
				return createGeometryTypeTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.GEOMETRY_UNION_TYPE_OBJECT:
				return createGeometryUnionTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.HORIZONTAL_ALIGNMENT_TYPE_OBJECT:
				return createHorizontalAlignmentTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.LINE_CAPS_TYPE_OBJECT:
				return createLineCapsTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.LINE_JOIN_TYPE_OBJECT:
				return createLineJoinTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.NEIGHBOR_SEL_MODE_TYPE_OBJECT:
				return createNeighborSelModeTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.PATTERN_TYPE:
				return createPatternTypeFromString(eDataType, initialValue);
			case AAAPackage.PATTERN_TYPE_BASE:
				return createPatternTypeBaseFromString(eDataType, initialValue);
			case AAAPackage.PRESENTATION_LOGIC_TYPE_OBJECT:
				return createPresentationLogicTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.REGULARITY_TYPE_OBJECT:
				return createRegularityTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.RELATE_TYPE_OBJECT:
				return createRelateTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.RELATIVE_ROTATION_TYPE_OBJECT:
				return createRelativeRotationTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.TEXT_DECORATION_TYPE_OBJECT:
				return createTextDecorationTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.UNIT_OF_MEASURE_TYPE_OBJECT:
				return createUnitOfMeasureTypeObjectFromString(eDataType, initialValue);
			case AAAPackage.VERTICAL_ALIGNMENT_TYPE_OBJECT:
				return createVerticalAlignmentTypeObjectFromString(eDataType, initialValue);
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
			case AAAPackage.ADJUSTMENT_TYPE:
				return convertAdjustmentTypeToString(eDataType, instanceValue);
			case AAAPackage.BASIC_OBJECT_TYPE_TYPE:
				return convertBasicObjectTypeTypeToString(eDataType, instanceValue);
			case AAAPackage.BOUNDARY_OVERLAP_TREATMENT_TYPE:
				return convertBoundaryOverlapTreatmentTypeToString(eDataType, instanceValue);
			case AAAPackage.DATA_TYPE_TYPE:
				return convertDataTypeTypeToString(eDataType, instanceValue);
			case AAAPackage.FONT_STYLE_TYPE:
				return convertFontStyleTypeToString(eDataType, instanceValue);
			case AAAPackage.FONT_WEIGHT_TYPE:
				return convertFontWeightTypeToString(eDataType, instanceValue);
			case AAAPackage.GEOMETRY_TYPE_TYPE:
				return convertGeometryTypeTypeToString(eDataType, instanceValue);
			case AAAPackage.GEOMETRY_UNION_TYPE:
				return convertGeometryUnionTypeToString(eDataType, instanceValue);
			case AAAPackage.HORIZONTAL_ALIGNMENT_TYPE:
				return convertHorizontalAlignmentTypeToString(eDataType, instanceValue);
			case AAAPackage.LINE_CAPS_TYPE:
				return convertLineCapsTypeToString(eDataType, instanceValue);
			case AAAPackage.LINE_JOIN_TYPE:
				return convertLineJoinTypeToString(eDataType, instanceValue);
			case AAAPackage.NEIGHBOR_SEL_MODE_TYPE:
				return convertNeighborSelModeTypeToString(eDataType, instanceValue);
			case AAAPackage.PRESENTATION_LOGIC_TYPE:
				return convertPresentationLogicTypeToString(eDataType, instanceValue);
			case AAAPackage.REGULARITY_TYPE:
				return convertRegularityTypeToString(eDataType, instanceValue);
			case AAAPackage.RELATE_TYPE:
				return convertRelateTypeToString(eDataType, instanceValue);
			case AAAPackage.RELATIVE_ROTATION_TYPE:
				return convertRelativeRotationTypeToString(eDataType, instanceValue);
			case AAAPackage.TEXT_DECORATION_TYPE:
				return convertTextDecorationTypeToString(eDataType, instanceValue);
			case AAAPackage.UNIT_OF_MEASURE_TYPE:
				return convertUnitOfMeasureTypeToString(eDataType, instanceValue);
			case AAAPackage.VERTICAL_ALIGNMENT_TYPE:
				return convertVerticalAlignmentTypeToString(eDataType, instanceValue);
			case AAAPackage.ADJUSTMENT_TYPE_OBJECT:
				return convertAdjustmentTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.BASIC_OBJECT_TYPE_TYPE_OBJECT:
				return convertBasicObjectTypeTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.BOUNDARY_OVERLAP_TREATMENT_TYPE_OBJECT:
				return convertBoundaryOverlapTreatmentTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.DASHARRAY_TYPE:
				return convertDasharrayTypeToString(eDataType, instanceValue);
			case AAAPackage.DASHARRAY_TYPE_BASE:
				return convertDasharrayTypeBaseToString(eDataType, instanceValue);
			case AAAPackage.DATA_TYPE_TYPE_OBJECT:
				return convertDataTypeTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.FONT_STYLE_TYPE_OBJECT:
				return convertFontStyleTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.FONT_WEIGHT_TYPE_OBJECT:
				return convertFontWeightTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.GEOMETRY_TYPE_TYPE_OBJECT:
				return convertGeometryTypeTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.GEOMETRY_UNION_TYPE_OBJECT:
				return convertGeometryUnionTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.HORIZONTAL_ALIGNMENT_TYPE_OBJECT:
				return convertHorizontalAlignmentTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.LINE_CAPS_TYPE_OBJECT:
				return convertLineCapsTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.LINE_JOIN_TYPE_OBJECT:
				return convertLineJoinTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.NEIGHBOR_SEL_MODE_TYPE_OBJECT:
				return convertNeighborSelModeTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.PATTERN_TYPE:
				return convertPatternTypeToString(eDataType, instanceValue);
			case AAAPackage.PATTERN_TYPE_BASE:
				return convertPatternTypeBaseToString(eDataType, instanceValue);
			case AAAPackage.PRESENTATION_LOGIC_TYPE_OBJECT:
				return convertPresentationLogicTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.REGULARITY_TYPE_OBJECT:
				return convertRegularityTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.RELATE_TYPE_OBJECT:
				return convertRelateTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.RELATIVE_ROTATION_TYPE_OBJECT:
				return convertRelativeRotationTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.TEXT_DECORATION_TYPE_OBJECT:
				return convertTextDecorationTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.UNIT_OF_MEASURE_TYPE_OBJECT:
				return convertUnitOfMeasureTypeObjectToString(eDataType, instanceValue);
			case AAAPackage.VERTICAL_ALIGNMENT_TYPE_OBJECT:
				return convertVerticalAlignmentTypeObjectToString(eDataType, instanceValue);
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
	public AdditionalFilterType createAdditionalFilterType() {
		AdditionalFilterTypeImpl additionalFilterType = new AdditionalFilterTypeImpl();
		return additionalFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalFilterType1 createAdditionalFilterType1() {
		AdditionalFilterType1Impl additionalFilterType1 = new AdditionalFilterType1Impl();
		return additionalFilterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalSymbolizersPropertyType createAdditionalSymbolizersPropertyType() {
		AdditionalSymbolizersPropertyTypeImpl additionalSymbolizersPropertyType = new AdditionalSymbolizersPropertyTypeImpl();
		return additionalSymbolizersPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalSymbolizersType createAdditionalSymbolizersType() {
		AdditionalSymbolizersTypeImpl additionalSymbolizersType = new AdditionalSymbolizersTypeImpl();
		return additionalSymbolizersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalSymbolizersType1 createAdditionalSymbolizersType1() {
		AdditionalSymbolizersType1Impl additionalSymbolizersType1 = new AdditionalSymbolizersType1Impl();
		return additionalSymbolizersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaGraphicPropertyType createAreaGraphicPropertyType() {
		AreaGraphicPropertyTypeImpl areaGraphicPropertyType = new AreaGraphicPropertyTypeImpl();
		return areaGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaGraphicType createAreaGraphicType() {
		AreaGraphicTypeImpl areaGraphicType = new AreaGraphicTypeImpl();
		return areaGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaSymbolizerPropertyType createAreaSymbolizerPropertyType() {
		AreaSymbolizerPropertyTypeImpl areaSymbolizerPropertyType = new AreaSymbolizerPropertyTypeImpl();
		return areaSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaSymbolizerType createAreaSymbolizerType() {
		AreaSymbolizerTypeImpl areaSymbolizerType = new AreaSymbolizerTypeImpl();
		return areaSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackgroundBorderType createBackgroundBorderType() {
		BackgroundBorderTypeImpl backgroundBorderType = new BackgroundBorderTypeImpl();
		return backgroundBorderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackgroundFillType createBackgroundFillType() {
		BackgroundFillTypeImpl backgroundFillType = new BackgroundFillTypeImpl();
		return backgroundFillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BottomEdgeType createBottomEdgeType() {
		BottomEdgeTypeImpl bottomEdgeType = new BottomEdgeTypeImpl();
		return bottomEdgeType;
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
	public BoundaryType1 createBoundaryType1() {
		BoundaryType1Impl boundaryType1 = new BoundaryType1Impl();
		return boundaryType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryType2 createBoundaryType2() {
		BoundaryType2Impl boundaryType2 = new BoundaryType2Impl();
		return boundaryType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxPointPropertyType createBoundingBoxPointPropertyType() {
		BoundingBoxPointPropertyTypeImpl boundingBoxPointPropertyType = new BoundingBoxPointPropertyTypeImpl();
		return boundingBoxPointPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxPointType createBoundingBoxPointType() {
		BoundingBoxPointTypeImpl boundingBoxPointType = new BoundingBoxPointTypeImpl();
		return boundingBoxPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterPointPropertyType createCenterPointPropertyType() {
		CenterPointPropertyTypeImpl centerPointPropertyType = new CenterPointPropertyTypeImpl();
		return centerPointPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterPointType createCenterPointType() {
		CenterPointTypeImpl centerPointType = new CenterPointTypeImpl();
		return centerPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircularArcPropertyType createCircularArcPropertyType() {
		CircularArcPropertyTypeImpl circularArcPropertyType = new CircularArcPropertyTypeImpl();
		return circularArcPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircularArcType createCircularArcType() {
		CircularArcTypeImpl circularArcType = new CircularArcTypeImpl();
		return circularArcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClosePropertyType createClosePropertyType() {
		ClosePropertyTypeImpl closePropertyType = new ClosePropertyTypeImpl();
		return closePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloseType createCloseType() {
		CloseTypeImpl closeType = new CloseTypeImpl();
		return closeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorCMYKPropertyType createColorCMYKPropertyType() {
		ColorCMYKPropertyTypeImpl colorCMYKPropertyType = new ColorCMYKPropertyTypeImpl();
		return colorCMYKPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorCMYKType createColorCMYKType() {
		ColorCMYKTypeImpl colorCMYKType = new ColorCMYKTypeImpl();
		return colorCMYKType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorPropertyType createColorPropertyType() {
		ColorPropertyTypeImpl colorPropertyType = new ColorPropertyTypeImpl();
		return colorPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorRGBPropertyType createColorRGBPropertyType() {
		ColorRGBPropertyTypeImpl colorRGBPropertyType = new ColorRGBPropertyTypeImpl();
		return colorRGBPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorRGBType createColorRGBType() {
		ColorRGBTypeImpl colorRGBType = new ColorRGBTypeImpl();
		return colorRGBType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorType createColorType() {
		ColorTypeImpl colorType = new ColorTypeImpl();
		return colorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorType1 createColorType1() {
		ColorType1Impl colorType1 = new ColorType1Impl();
		return colorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeGraphicPropertyType createCompositeGraphicPropertyType() {
		CompositeGraphicPropertyTypeImpl compositeGraphicPropertyType = new CompositeGraphicPropertyTypeImpl();
		return compositeGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeGraphicType createCompositeGraphicType() {
		CompositeGraphicTypeImpl compositeGraphicType = new CompositeGraphicTypeImpl();
		return compositeGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundStrokePropertyType createCompoundStrokePropertyType() {
		CompoundStrokePropertyTypeImpl compoundStrokePropertyType = new CompoundStrokePropertyTypeImpl();
		return compoundStrokePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundStrokeSectionPropertyType createCompoundStrokeSectionPropertyType() {
		CompoundStrokeSectionPropertyTypeImpl compoundStrokeSectionPropertyType = new CompoundStrokeSectionPropertyTypeImpl();
		return compoundStrokeSectionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundStrokeType createCompoundStrokeType() {
		CompoundStrokeTypeImpl compoundStrokeType = new CompoundStrokeTypeImpl();
		return compoundStrokeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStepPropertyType createCurrentStepPropertyType() {
		CurrentStepPropertyTypeImpl currentStepPropertyType = new CurrentStepPropertyTypeImpl();
		return currentStepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentStepType createCurrentStepType() {
		CurrentStepTypeImpl currentStepType = new CurrentStepTypeImpl();
		return currentStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvetoPropertyType createCurvetoPropertyType() {
		CurvetoPropertyTypeImpl curvetoPropertyType = new CurvetoPropertyTypeImpl();
		return curvetoPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvetoType createCurvetoType() {
		CurvetoTypeImpl curvetoType = new CurvetoTypeImpl();
		return curvetoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DashedStrokePropertyType createDashedStrokePropertyType() {
		DashedStrokePropertyTypeImpl dashedStrokePropertyType = new DashedStrokePropertyTypeImpl();
		return dashedStrokePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DashedStrokeType createDashedStrokeType() {
		DashedStrokeTypeImpl dashedStrokeType = new DashedStrokeTypeImpl();
		return dashedStrokeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignRulePropertyType createDesignRulePropertyType() {
		DesignRulePropertyTypeImpl designRulePropertyType = new DesignRulePropertyTypeImpl();
		return designRulePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignRuleType createDesignRuleType() {
		DesignRuleTypeImpl designRuleType = new DesignRuleTypeImpl();
		return designRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignRuleType1 createDesignRuleType1() {
		DesignRuleType1Impl designRuleType1 = new DesignRuleType1Impl();
		return designRuleType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplacementPropertyType createDisplacementPropertyType() {
		DisplacementPropertyTypeImpl displacementPropertyType = new DisplacementPropertyTypeImpl();
		return displacementPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplacementType createDisplacementType() {
		DisplacementTypeImpl displacementType = new DisplacementTypeImpl();
		return displacementType;
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
	public ElementPropertyType createElementPropertyType() {
		ElementPropertyTypeImpl elementPropertyType = new ElementPropertyTypeImpl();
		return elementPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseType createElseType() {
		ElseTypeImpl elseType = new ElseTypeImpl();
		return elseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmitPropertyType createEmitPropertyType() {
		EmitPropertyTypeImpl emitPropertyType = new EmitPropertyTypeImpl();
		return emitPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmitType createEmitType() {
		EmitTypeImpl emitType = new EmitTypeImpl();
		return emitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmitType1 createEmitType1() {
		EmitType1Impl emitType1 = new EmitType1Impl();
		return emitType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EveryPropertyType createEveryPropertyType() {
		EveryPropertyTypeImpl everyPropertyType = new EveryPropertyTypeImpl();
		return everyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EveryType createEveryType() {
		EveryTypeImpl everyType = new EveryTypeImpl();
		return everyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionPropertyType createExpressionPropertyType() {
		ExpressionPropertyTypeImpl expressionPropertyType = new ExpressionPropertyTypeImpl();
		return expressionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionType createExpressionType() {
		ExpressionTypeImpl expressionType = new ExpressionTypeImpl();
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeStepPropertyType createFeatureTypeStepPropertyType() {
		FeatureTypeStepPropertyTypeImpl featureTypeStepPropertyType = new FeatureTypeStepPropertyTypeImpl();
		return featureTypeStepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTypeStepType createFeatureTypeStepType() {
		FeatureTypeStepTypeImpl featureTypeStepType = new FeatureTypeStepTypeImpl();
		return featureTypeStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FillPropertyType createFillPropertyType() {
		FillPropertyTypeImpl fillPropertyType = new FillPropertyTypeImpl();
		return fillPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilteredSymbolizerPropertyType createFilteredSymbolizerPropertyType() {
		FilteredSymbolizerPropertyTypeImpl filteredSymbolizerPropertyType = new FilteredSymbolizerPropertyTypeImpl();
		return filteredSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilteredSymbolizerType createFilteredSymbolizerType() {
		FilteredSymbolizerTypeImpl filteredSymbolizerType = new FilteredSymbolizerTypeImpl();
		return filteredSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterPropertyType createFilterPropertyType() {
		FilterPropertyTypeImpl filterPropertyType = new FilterPropertyTypeImpl();
		return filterPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType1 createFilterType1() {
		FilterType1Impl filterType1 = new FilterType1Impl();
		return filterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstStepPropertyType createFirstStepPropertyType() {
		FirstStepPropertyTypeImpl firstStepPropertyType = new FirstStepPropertyTypeImpl();
		return firstStepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstStepType createFirstStepType() {
		FirstStepTypeImpl firstStepType = new FirstStepTypeImpl();
		return firstStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontPropertyType createFontPropertyType() {
		FontPropertyTypeImpl fontPropertyType = new FontPropertyTypeImpl();
		return fontPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontType createFontType() {
		FontTypeImpl fontType = new FontTypeImpl();
		return fontType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontType1 createFontType1() {
		FontType1Impl fontType1 = new FontType1Impl();
		return fontType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForPropertyType createForPropertyType() {
		ForPropertyTypeImpl forPropertyType = new ForPropertyTypeImpl();
		return forPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForType createForType() {
		ForTypeImpl forType = new ForTypeImpl();
		return forType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GapPropertyType createGapPropertyType() {
		GapPropertyTypeImpl gapPropertyType = new GapPropertyTypeImpl();
		return gapPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GapType createGapType() {
		GapTypeImpl gapType = new GapTypeImpl();
		return gapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryType createGeometryType() {
		GeometryTypeImpl geometryType = new GeometryTypeImpl();
		return geometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryType1 createGeometryType1() {
		GeometryType1Impl geometryType1 = new GeometryType1Impl();
		return geometryType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryType2 createGeometryType2() {
		GeometryType2Impl geometryType2 = new GeometryType2Impl();
		return geometryType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicFillPropertyType createGraphicFillPropertyType() {
		GraphicFillPropertyTypeImpl graphicFillPropertyType = new GraphicFillPropertyTypeImpl();
		return graphicFillPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicFillType createGraphicFillType() {
		GraphicFillTypeImpl graphicFillType = new GraphicFillTypeImpl();
		return graphicFillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicPropertyType createGraphicPropertyType() {
		GraphicPropertyTypeImpl graphicPropertyType = new GraphicPropertyTypeImpl();
		return graphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType createGraphicType() {
		GraphicTypeImpl graphicType = new GraphicTypeImpl();
		return graphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType1 createGraphicType1() {
		GraphicType1Impl graphicType1 = new GraphicType1Impl();
		return graphicType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType2 createGraphicType2() {
		GraphicType2Impl graphicType2 = new GraphicType2Impl();
		return graphicType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloColorType createHaloColorType() {
		HaloColorTypeImpl haloColorType = new HaloColorTypeImpl();
		return haloColorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloPropertyType createHaloPropertyType() {
		HaloPropertyTypeImpl haloPropertyType = new HaloPropertyTypeImpl();
		return haloPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloType createHaloType() {
		HaloTypeImpl haloType = new HaloTypeImpl();
		return haloType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloType1 createHaloType1() {
		HaloType1Impl haloType1 = new HaloType1Impl();
		return haloType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloType2 createHaloType2() {
		HaloType2Impl haloType2 = new HaloType2Impl();
		return haloType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchDefinitionLongestSidePropertyType createHatchDefinitionLongestSidePropertyType() {
		HatchDefinitionLongestSidePropertyTypeImpl hatchDefinitionLongestSidePropertyType = new HatchDefinitionLongestSidePropertyTypeImpl();
		return hatchDefinitionLongestSidePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchDefinitionPropertyType createHatchDefinitionPropertyType() {
		HatchDefinitionPropertyTypeImpl hatchDefinitionPropertyType = new HatchDefinitionPropertyTypeImpl();
		return hatchDefinitionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchFillLongestSidePropertyType createHatchFillLongestSidePropertyType() {
		HatchFillLongestSidePropertyTypeImpl hatchFillLongestSidePropertyType = new HatchFillLongestSidePropertyTypeImpl();
		return hatchFillLongestSidePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchFillLongestSideType createHatchFillLongestSideType() {
		HatchFillLongestSideTypeImpl hatchFillLongestSideType = new HatchFillLongestSideTypeImpl();
		return hatchFillLongestSideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchFillPropertyType createHatchFillPropertyType() {
		HatchFillPropertyTypeImpl hatchFillPropertyType = new HatchFillPropertyTypeImpl();
		return hatchFillPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchFillType createHatchFillType() {
		HatchFillTypeImpl hatchFillType = new HatchFillTypeImpl();
		return hatchFillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchLinesLongestSidePropertyType createHatchLinesLongestSidePropertyType() {
		HatchLinesLongestSidePropertyTypeImpl hatchLinesLongestSidePropertyType = new HatchLinesLongestSidePropertyTypeImpl();
		return hatchLinesLongestSidePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchLinesLongestSideType createHatchLinesLongestSideType() {
		HatchLinesLongestSideTypeImpl hatchLinesLongestSideType = new HatchLinesLongestSideTypeImpl();
		return hatchLinesLongestSideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchLinesPropertyType createHatchLinesPropertyType() {
		HatchLinesPropertyTypeImpl hatchLinesPropertyType = new HatchLinesPropertyTypeImpl();
		return hatchLinesPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HatchLinesType createHatchLinesType() {
		HatchLinesTypeImpl hatchLinesType = new HatchLinesTypeImpl();
		return hatchLinesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfPropertyType createIfPropertyType() {
		IfPropertyTypeImpl ifPropertyType = new IfPropertyTypeImpl();
		return ifPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfType createIfType() {
		IfTypeImpl ifType = new IfTypeImpl();
		return ifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteriorType createInteriorType() {
		InteriorTypeImpl interiorType = new InteriorTypeImpl();
		return interiorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteriorType1 createInteriorType1() {
		InteriorType1Impl interiorType1 = new InteriorType1Impl();
		return interiorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InType createInType() {
		InTypeImpl inType = new InTypeImpl();
		return inType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InType1 createInType1() {
		InType1Impl inType1 = new InType1Impl();
		return inType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelPropertyType createLabelPropertyType() {
		LabelPropertyTypeImpl labelPropertyType = new LabelPropertyTypeImpl();
		return labelPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelTextType createLabelTextType() {
		LabelTextTypeImpl labelTextType = new LabelTextTypeImpl();
		return labelTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelTextType1 createLabelTextType1() {
		LabelTextType1Impl labelTextType1 = new LabelTextType1Impl();
		return labelTextType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType1 createLabelType1() {
		LabelType1Impl labelType1 = new LabelType1Impl();
		return labelType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType2 createLabelType2() {
		LabelType2Impl labelType2 = new LabelType2Impl();
		return labelType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType3 createLabelType3() {
		LabelType3Impl labelType3 = new LabelType3Impl();
		return labelType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerPropertyType createLayerPropertyType() {
		LayerPropertyTypeImpl layerPropertyType = new LayerPropertyTypeImpl();
		return layerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerType createLayerType() {
		LayerTypeImpl layerType = new LayerTypeImpl();
		return layerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerType1 createLayerType1() {
		LayerType1Impl layerType1 = new LayerType1Impl();
		return layerType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineGraphicPropertyType createLineGraphicPropertyType() {
		LineGraphicPropertyTypeImpl lineGraphicPropertyType = new LineGraphicPropertyTypeImpl();
		return lineGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineGraphicType createLineGraphicType() {
		LineGraphicTypeImpl lineGraphicType = new LineGraphicTypeImpl();
		return lineGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineLabelPropertyType createLineLabelPropertyType() {
		LineLabelPropertyTypeImpl lineLabelPropertyType = new LineLabelPropertyTypeImpl();
		return lineLabelPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineLabelType createLineLabelType() {
		LineLabelTypeImpl lineLabelType = new LineLabelTypeImpl();
		return lineLabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinePlacedGraphicPropertyType createLinePlacedGraphicPropertyType() {
		LinePlacedGraphicPropertyTypeImpl linePlacedGraphicPropertyType = new LinePlacedGraphicPropertyTypeImpl();
		return linePlacedGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinePlacedGraphicType createLinePlacedGraphicType() {
		LinePlacedGraphicTypeImpl linePlacedGraphicType = new LinePlacedGraphicTypeImpl();
		return linePlacedGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineSymbolizerPropertyType createLineSymbolizerPropertyType() {
		LineSymbolizerPropertyTypeImpl lineSymbolizerPropertyType = new LineSymbolizerPropertyTypeImpl();
		return lineSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineSymbolizerType createLineSymbolizerType() {
		LineSymbolizerTypeImpl lineSymbolizerType = new LineSymbolizerTypeImpl();
		return lineSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinetoPropertyType createLinetoPropertyType() {
		LinetoPropertyTypeImpl linetoPropertyType = new LinetoPropertyTypeImpl();
		return linetoPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinetoType createLinetoType() {
		LinetoTypeImpl linetoType = new LinetoTypeImpl();
		return linetoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralPropertyType createLiteralPropertyType() {
		LiteralPropertyTypeImpl literalPropertyType = new LiteralPropertyTypeImpl();
		return literalPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralType createLiteralType() {
		LiteralTypeImpl literalType = new LiteralTypeImpl();
		return literalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumAdjacentLineStringPropertyType createMaximumAdjacentLineStringPropertyType() {
		MaximumAdjacentLineStringPropertyTypeImpl maximumAdjacentLineStringPropertyType = new MaximumAdjacentLineStringPropertyTypeImpl();
		return maximumAdjacentLineStringPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumAdjacentLineStringType createMaximumAdjacentLineStringType() {
		MaximumAdjacentLineStringTypeImpl maximumAdjacentLineStringType = new MaximumAdjacentLineStringTypeImpl();
		return maximumAdjacentLineStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumAdjacentSurfacePropertyType createMaximumAdjacentSurfacePropertyType() {
		MaximumAdjacentSurfacePropertyTypeImpl maximumAdjacentSurfacePropertyType = new MaximumAdjacentSurfacePropertyTypeImpl();
		return maximumAdjacentSurfacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumAdjacentSurfaceType createMaximumAdjacentSurfaceType() {
		MaximumAdjacentSurfaceTypeImpl maximumAdjacentSurfaceType = new MaximumAdjacentSurfaceTypeImpl();
		return maximumAdjacentSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureLiteralPropertyType createMeasureLiteralPropertyType() {
		MeasureLiteralPropertyTypeImpl measureLiteralPropertyType = new MeasureLiteralPropertyTypeImpl();
		return measureLiteralPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureLiteralType createMeasureLiteralType() {
		MeasureLiteralTypeImpl measureLiteralType = new MeasureLiteralTypeImpl();
		return measureLiteralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberType createMemberType() {
		MemberTypeImpl memberType = new MemberTypeImpl();
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovetoPropertyType createMovetoPropertyType() {
		MovetoPropertyTypeImpl movetoPropertyType = new MovetoPropertyTypeImpl();
		return movetoPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovetoType createMovetoType() {
		MovetoTypeImpl movetoType = new MovetoTypeImpl();
		return movetoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeighborhoodFilterType createNeighborhoodFilterType() {
		NeighborhoodFilterTypeImpl neighborhoodFilterType = new NeighborhoodFilterTypeImpl();
		return neighborhoodFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullColorPropertyType createNullColorPropertyType() {
		NullColorPropertyTypeImpl nullColorPropertyType = new NullColorPropertyTypeImpl();
		return nullColorPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullColorType createNullColorType() {
		NullColorTypeImpl nullColorType = new NullColorTypeImpl();
		return nullColorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullSymbolizerPropertyType createNullSymbolizerPropertyType() {
		NullSymbolizerPropertyTypeImpl nullSymbolizerPropertyType = new NullSymbolizerPropertyTypeImpl();
		return nullSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullSymbolizerType createNullSymbolizerType() {
		NullSymbolizerTypeImpl nullSymbolizerType = new NullSymbolizerTypeImpl();
		return nullSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperandType createOperandType() {
		OperandTypeImpl operandType = new OperandTypeImpl();
		return operandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationPropertyType createOperationPropertyType() {
		OperationPropertyTypeImpl operationPropertyType = new OperationPropertyTypeImpl();
		return operationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType createOperationType() {
		OperationTypeImpl operationType = new OperationTypeImpl();
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathElementPropertyType createPathElementPropertyType() {
		PathElementPropertyTypeImpl pathElementPropertyType = new PathElementPropertyTypeImpl();
		return pathElementPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathPropertyType createPathPropertyType() {
		PathPropertyTypeImpl pathPropertyType = new PathPropertyTypeImpl();
		return pathPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathType createPathType() {
		PathTypeImpl pathType = new PathTypeImpl();
		return pathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerpendicularOffsetPropertyType createPerpendicularOffsetPropertyType() {
		PerpendicularOffsetPropertyTypeImpl perpendicularOffsetPropertyType = new PerpendicularOffsetPropertyTypeImpl();
		return perpendicularOffsetPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerpendicularOffsetType createPerpendicularOffsetType() {
		PerpendicularOffsetTypeImpl perpendicularOffsetType = new PerpendicularOffsetTypeImpl();
		return perpendicularOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacementRulePropertyType createPlacementRulePropertyType() {
		PlacementRulePropertyTypeImpl placementRulePropertyType = new PlacementRulePropertyTypeImpl();
		return placementRulePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacementType createPlacementType() {
		PlacementTypeImpl placementType = new PlacementTypeImpl();
		return placementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointLabelPropertyType createPointLabelPropertyType() {
		PointLabelPropertyTypeImpl pointLabelPropertyType = new PointLabelPropertyTypeImpl();
		return pointLabelPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointLabelType createPointLabelType() {
		PointLabelTypeImpl pointLabelType = new PointLabelTypeImpl();
		return pointLabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsInAreaDefinitionPropertyType createPointsInAreaDefinitionPropertyType() {
		PointsInAreaDefinitionPropertyTypeImpl pointsInAreaDefinitionPropertyType = new PointsInAreaDefinitionPropertyTypeImpl();
		return pointsInAreaDefinitionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsInAreaPropertyType createPointsInAreaPropertyType() {
		PointsInAreaPropertyTypeImpl pointsInAreaPropertyType = new PointsInAreaPropertyTypeImpl();
		return pointsInAreaPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsInAreaType createPointsInAreaType() {
		PointsInAreaTypeImpl pointsInAreaType = new PointsInAreaTypeImpl();
		return pointsInAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsOnLinePropertyType createPointsOnLinePropertyType() {
		PointsOnLinePropertyTypeImpl pointsOnLinePropertyType = new PointsOnLinePropertyTypeImpl();
		return pointsOnLinePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointsOnLineType createPointsOnLineType() {
		PointsOnLineTypeImpl pointsOnLineType = new PointsOnLineTypeImpl();
		return pointsOnLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointSymbolizerPropertyType createPointSymbolizerPropertyType() {
		PointSymbolizerPropertyTypeImpl pointSymbolizerPropertyType = new PointSymbolizerPropertyTypeImpl();
		return pointSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointSymbolizerType createPointSymbolizerType() {
		PointSymbolizerTypeImpl pointSymbolizerType = new PointSymbolizerTypeImpl();
		return pointSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostGraphicType createPostGraphicType() {
		PostGraphicTypeImpl postGraphicType = new PostGraphicTypeImpl();
		return postGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateType createPredicateType() {
		PredicateTypeImpl predicateType = new PredicateTypeImpl();
		return predicateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateType1 createPredicateType1() {
		PredicateType1Impl predicateType1 = new PredicateType1Impl();
		return predicateType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreGraphicType createPreGraphicType() {
		PreGraphicTypeImpl preGraphicType = new PreGraphicTypeImpl();
		return preGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyPropertyType createPropertyPropertyType() {
		PropertyPropertyTypeImpl propertyPropertyType = new PropertyPropertyTypeImpl();
		return propertyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PureSymbolizerPropertyType createPureSymbolizerPropertyType() {
		PureSymbolizerPropertyTypeImpl pureSymbolizerPropertyType = new PureSymbolizerPropertyTypeImpl();
		return pureSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PureSymbolizerType createPureSymbolizerType() {
		PureSymbolizerTypeImpl pureSymbolizerType = new PureSymbolizerTypeImpl();
		return pureSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifierPropertyType createQuantifierPropertyType() {
		QuantifierPropertyTypeImpl quantifierPropertyType = new QuantifierPropertyTypeImpl();
		return quantifierPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateFilterType createRelateFilterType() {
		RelateFilterTypeImpl relateFilterType = new RelateFilterTypeImpl();
		return relateFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateGeometryPropertyType createRelateGeometryPropertyType() {
		RelateGeometryPropertyTypeImpl relateGeometryPropertyType = new RelateGeometryPropertyTypeImpl();
		return relateGeometryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateGeometryType createRelateGeometryType() {
		RelateGeometryTypeImpl relateGeometryType = new RelateGeometryTypeImpl();
		return relateGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateTopologyPropertyType createRelateTopologyPropertyType() {
		RelateTopologyPropertyTypeImpl relateTopologyPropertyType = new RelateTopologyPropertyTypeImpl();
		return relateTopologyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelateTopologyType createRelateTopologyType() {
		RelateTopologyTypeImpl relateTopologyType = new RelateTopologyTypeImpl();
		return relateTopologyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulePropertyType createRulePropertyType() {
		RulePropertyTypeImpl rulePropertyType = new RulePropertyTypeImpl();
		return rulePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleSetPropertyType createRuleSetPropertyType() {
		RuleSetPropertyTypeImpl ruleSetPropertyType = new RuleSetPropertyTypeImpl();
		return ruleSetPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleSetType createRuleSetType() {
		RuleSetTypeImpl ruleSetType = new RuleSetTypeImpl();
		return ruleSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleSetType1 createRuleSetType1() {
		RuleSetType1Impl ruleSetType1 = new RuleSetType1Impl();
		return ruleSetType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesToConsiderType createRulesToConsiderType() {
		RulesToConsiderTypeImpl rulesToConsiderType = new RulesToConsiderTypeImpl();
		return rulesToConsiderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleType createRuleType() {
		RuleTypeImpl ruleType = new RuleTypeImpl();
		return ruleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleType1 createRuleType1() {
		RuleType1Impl ruleType1 = new RuleType1Impl();
		return ruleType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SatisfiesType createSatisfiesType() {
		SatisfiesTypeImpl satisfiesType = new SatisfiesTypeImpl();
		return satisfiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionType createSectionType() {
		SectionTypeImpl sectionType = new SectionTypeImpl();
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfStepPropertyType createSelfStepPropertyType() {
		SelfStepPropertyTypeImpl selfStepPropertyType = new SelfStepPropertyTypeImpl();
		return selfStepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfStepType createSelfStepType() {
		SelfStepTypeImpl selfStepType = new SelfStepTypeImpl();
		return selfStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShieldedPointLabelPropertyType createShieldedPointLabelPropertyType() {
		ShieldedPointLabelPropertyTypeImpl shieldedPointLabelPropertyType = new ShieldedPointLabelPropertyTypeImpl();
		return shieldedPointLabelPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShieldedPointLabelType createShieldedPointLabelType() {
		ShieldedPointLabelTypeImpl shieldedPointLabelType = new ShieldedPointLabelTypeImpl();
		return shieldedPointLabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleGraphicPropertyType createSimpleGraphicPropertyType() {
		SimpleGraphicPropertyTypeImpl simpleGraphicPropertyType = new SimpleGraphicPropertyTypeImpl();
		return simpleGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkeletonLinePropertyType createSkeletonLinePropertyType() {
		SkeletonLinePropertyTypeImpl skeletonLinePropertyType = new SkeletonLinePropertyTypeImpl();
		return skeletonLinePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkeletonLineType createSkeletonLineType() {
		SkeletonLineTypeImpl skeletonLineType = new SkeletonLineTypeImpl();
		return skeletonLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlopeHatchLinesPropertyType createSlopeHatchLinesPropertyType() {
		SlopeHatchLinesPropertyTypeImpl slopeHatchLinesPropertyType = new SlopeHatchLinesPropertyTypeImpl();
		return slopeHatchLinesPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlopeHatchLinesType createSlopeHatchLinesType() {
		SlopeHatchLinesTypeImpl slopeHatchLinesType = new SlopeHatchLinesTypeImpl();
		return slopeHatchLinesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidFillPropertyType createSolidFillPropertyType() {
		SolidFillPropertyTypeImpl solidFillPropertyType = new SolidFillPropertyTypeImpl();
		return solidFillPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidFillType createSolidFillType() {
		SolidFillTypeImpl solidFillType = new SolidFillTypeImpl();
		return solidFillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidOrDashedStrokePropertyType createSolidOrDashedStrokePropertyType() {
		SolidOrDashedStrokePropertyTypeImpl solidOrDashedStrokePropertyType = new SolidOrDashedStrokePropertyTypeImpl();
		return solidOrDashedStrokePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidSectionPropertyType createSolidSectionPropertyType() {
		SolidSectionPropertyTypeImpl solidSectionPropertyType = new SolidSectionPropertyTypeImpl();
		return solidSectionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidSectionType createSolidSectionType() {
		SolidSectionTypeImpl solidSectionType = new SolidSectionTypeImpl();
		return solidSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidStrokePropertyType createSolidStrokePropertyType() {
		SolidStrokePropertyTypeImpl solidStrokePropertyType = new SolidStrokePropertyTypeImpl();
		return solidStrokePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidStrokeType createSolidStrokeType() {
		SolidStrokeTypeImpl solidStrokeType = new SolidStrokeTypeImpl();
		return solidStrokeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SomePropertyType createSomePropertyType() {
		SomePropertyTypeImpl somePropertyType = new SomePropertyTypeImpl();
		return somePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SomeType createSomeType() {
		SomeTypeImpl someType = new SomeTypeImpl();
		return someType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepPropertyType createStepPropertyType() {
		StepPropertyTypeImpl stepPropertyType = new StepPropertyTypeImpl();
		return stepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepType1 createStepType1() {
		StepType1Impl stepType1 = new StepType1Impl();
		return stepType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokePropertyType createStrokePropertyType() {
		StrokePropertyTypeImpl strokePropertyType = new StrokePropertyTypeImpl();
		return strokePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType createStrokeType() {
		StrokeTypeImpl strokeType = new StrokeTypeImpl();
		return strokeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType1 createStrokeType1() {
		StrokeType1Impl strokeType1 = new StrokeType1Impl();
		return strokeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType2 createStrokeType2() {
		StrokeType2Impl strokeType2 = new StrokeType2Impl();
		return strokeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType3 createStrokeType3() {
		StrokeType3Impl strokeType3 = new StrokeType3Impl();
		return strokeType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType4 createStrokeType4() {
		StrokeType4Impl strokeType4 = new StrokeType4Impl();
		return strokeType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StylePropertyType createStylePropertyType() {
		StylePropertyTypeImpl stylePropertyType = new StylePropertyTypeImpl();
		return stylePropertyType;
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
	public StyleType1 createStyleType1() {
		StyleType1Impl styleType1 = new StyleType1Impl();
		return styleType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolizerPredicateType createSymbolizerPredicateType() {
		SymbolizerPredicateTypeImpl symbolizerPredicateType = new SymbolizerPredicateTypeImpl();
		return symbolizerPredicateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolizerPropertyType createSymbolizerPropertyType() {
		SymbolizerPropertyTypeImpl symbolizerPropertyType = new SymbolizerPropertyTypeImpl();
		return symbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolizerType createSymbolizerType() {
		SymbolizerTypeImpl symbolizerType = new SymbolizerTypeImpl();
		return symbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolizerType2 createSymbolizerType2() {
		SymbolizerType2Impl symbolizerType2 = new SymbolizerType2Impl();
		return symbolizerType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbologyCatalogPropertyType createSymbologyCatalogPropertyType() {
		SymbologyCatalogPropertyTypeImpl symbologyCatalogPropertyType = new SymbologyCatalogPropertyTypeImpl();
		return symbologyCatalogPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbologyCatalogType createSymbologyCatalogType() {
		SymbologyCatalogTypeImpl symbologyCatalogType = new SymbologyCatalogTypeImpl();
		return symbologyCatalogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagPropertyType createTagPropertyType() {
		TagPropertyTypeImpl tagPropertyType = new TagPropertyTypeImpl();
		return tagPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagSetPropertyType createTagSetPropertyType() {
		TagSetPropertyTypeImpl tagSetPropertyType = new TagSetPropertyTypeImpl();
		return tagSetPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagSetType createTagSetType() {
		TagSetTypeImpl tagSetType = new TagSetTypeImpl();
		return tagSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagType createTagType() {
		TagTypeImpl tagType = new TagTypeImpl();
		return tagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagType1 createTagType1() {
		TagType1Impl tagType1 = new TagType1Impl();
		return tagType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetColorType createTargetColorType() {
		TargetColorTypeImpl targetColorType = new TargetColorTypeImpl();
		return targetColorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextBodyFillType createTextBodyFillType() {
		TextBodyFillTypeImpl textBodyFillType = new TextBodyFillTypeImpl();
		return textBodyFillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextGraphicPropertyType createTextGraphicPropertyType() {
		TextGraphicPropertyTypeImpl textGraphicPropertyType = new TextGraphicPropertyTypeImpl();
		return textGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextGraphicType createTextGraphicType() {
		TextGraphicTypeImpl textGraphicType = new TextGraphicTypeImpl();
		return textGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextSectionPropertyType createTextSectionPropertyType() {
		TextSectionPropertyTypeImpl textSectionPropertyType = new TextSectionPropertyTypeImpl();
		return textSectionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextSectionType createTextSectionType() {
		TextSectionTypeImpl textSectionType = new TextSectionTypeImpl();
		return textSectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextSymbolizerPropertyType createTextSymbolizerPropertyType() {
		TextSymbolizerPropertyTypeImpl textSymbolizerPropertyType = new TextSymbolizerPropertyTypeImpl();
		return textSymbolizerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextSymbolizerType createTextSymbolizerType() {
		TextSymbolizerTypeImpl textSymbolizerType = new TextSymbolizerTypeImpl();
		return textSymbolizerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThenType createThenType() {
		ThenTypeImpl thenType = new ThenTypeImpl();
		return thenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopEdgeType createTopEdgeType() {
		TopEdgeTypeImpl topEdgeType = new TopEdgeTypeImpl();
		return topEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TubePropertyType createTubePropertyType() {
		TubePropertyTypeImpl tubePropertyType = new TubePropertyTypeImpl();
		return tubePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TubeType createTubeType() {
		TubeTypeImpl tubeType = new TubeTypeImpl();
		return tubeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariablePropertyType createVariablePropertyType() {
		VariablePropertyTypeImpl variablePropertyType = new VariablePropertyTypeImpl();
		return variablePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableStepPropertyType createVariableStepPropertyType() {
		VariableStepPropertyTypeImpl variableStepPropertyType = new VariableStepPropertyTypeImpl();
		return variableStepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableStepType createVariableStepType() {
		VariableStepTypeImpl variableStepType = new VariableStepTypeImpl();
		return variableStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType1 createVariableType1() {
		VariableType1Impl variableType1 = new VariableType1Impl();
		return variableType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType2 createVariableType2() {
		VariableType2Impl variableType2 = new VariableType2Impl();
		return variableType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType3 createVariableType3() {
		VariableType3Impl variableType3 = new VariableType3Impl();
		return variableType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantGeometryPropertyType createVariantGeometryPropertyType() {
		VariantGeometryPropertyTypeImpl variantGeometryPropertyType = new VariantGeometryPropertyTypeImpl();
		return variantGeometryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantGeometryType createVariantGeometryType() {
		VariantGeometryTypeImpl variantGeometryType = new VariantGeometryTypeImpl();
		return variantGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendorSpecificType createVendorSpecificType() {
		VendorSpecificTypeImpl vendorSpecificType = new VendorSpecificTypeImpl();
		return vendorSpecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType createAdjustmentTypeFromString(EDataType eDataType, String initialValue) {
		AdjustmentType result = AdjustmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicObjectTypeType createBasicObjectTypeTypeFromString(EDataType eDataType, String initialValue) {
		BasicObjectTypeType result = BasicObjectTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicObjectTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryOverlapTreatmentType createBoundaryOverlapTreatmentTypeFromString(EDataType eDataType, String initialValue) {
		BoundaryOverlapTreatmentType result = BoundaryOverlapTreatmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoundaryOverlapTreatmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeFromString(EDataType eDataType, String initialValue) {
		DataTypeType result = DataTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyleType createFontStyleTypeFromString(EDataType eDataType, String initialValue) {
		FontStyleType result = FontStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeightType createFontWeightTypeFromString(EDataType eDataType, String initialValue) {
		FontWeightType result = FontWeightType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryTypeType createGeometryTypeTypeFromString(EDataType eDataType, String initialValue) {
		GeometryTypeType result = GeometryTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometryTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryUnionType createGeometryUnionTypeFromString(EDataType eDataType, String initialValue) {
		GeometryUnionType result = GeometryUnionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometryUnionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalAlignmentType createHorizontalAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		HorizontalAlignmentType result = HorizontalAlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineCapsType createLineCapsTypeFromString(EDataType eDataType, String initialValue) {
		LineCapsType result = LineCapsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineCapsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineJoinType createLineJoinTypeFromString(EDataType eDataType, String initialValue) {
		LineJoinType result = LineJoinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineJoinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeighborSelModeType createNeighborSelModeTypeFromString(EDataType eDataType, String initialValue) {
		NeighborSelModeType result = NeighborSelModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeighborSelModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationLogicType createPresentationLogicTypeFromString(EDataType eDataType, String initialValue) {
		PresentationLogicType result = PresentationLogicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationLogicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularityType createRegularityTypeFromString(EDataType eDataType, String initialValue) {
		RegularityType result = RegularityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegularityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelateType createRelateTypeFromString(EDataType eDataType, String initialValue) {
		RelateType result = RelateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeRotationType createRelativeRotationTypeFromString(EDataType eDataType, String initialValue) {
		RelativeRotationType result = RelativeRotationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativeRotationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDecorationType createTextDecorationTypeFromString(EDataType eDataType, String initialValue) {
		TextDecorationType result = TextDecorationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextDecorationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasureType createUnitOfMeasureTypeFromString(EDataType eDataType, String initialValue) {
		UnitOfMeasureType result = UnitOfMeasureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitOfMeasureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignmentType createVerticalAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		VerticalAlignmentType result = VerticalAlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType createAdjustmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAdjustmentTypeFromString(AAAPackage.eINSTANCE.getAdjustmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdjustmentTypeToString(AAAPackage.eINSTANCE.getAdjustmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicObjectTypeType createBasicObjectTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBasicObjectTypeTypeFromString(AAAPackage.eINSTANCE.getBasicObjectTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicObjectTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBasicObjectTypeTypeToString(AAAPackage.eINSTANCE.getBasicObjectTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryOverlapTreatmentType createBoundaryOverlapTreatmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBoundaryOverlapTreatmentTypeFromString(AAAPackage.eINSTANCE.getBoundaryOverlapTreatmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoundaryOverlapTreatmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBoundaryOverlapTreatmentTypeToString(AAAPackage.eINSTANCE.getBoundaryOverlapTreatmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createDasharrayTypeFromString(EDataType eDataType, String initialValue) {
		return createDasharrayTypeBaseFromString(AAAPackage.eINSTANCE.getDasharrayTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDasharrayTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDasharrayTypeBaseToString(AAAPackage.eINSTANCE.getDasharrayTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createDasharrayTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDasharrayTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeFromString(AAAPackage.eINSTANCE.getDataTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeToString(AAAPackage.eINSTANCE.getDataTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyleType createFontStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontStyleTypeFromString(AAAPackage.eINSTANCE.getFontStyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontStyleTypeToString(AAAPackage.eINSTANCE.getFontStyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeightType createFontWeightTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontWeightTypeFromString(AAAPackage.eINSTANCE.getFontWeightType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontWeightTypeToString(AAAPackage.eINSTANCE.getFontWeightType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryTypeType createGeometryTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGeometryTypeTypeFromString(AAAPackage.eINSTANCE.getGeometryTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometryTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGeometryTypeTypeToString(AAAPackage.eINSTANCE.getGeometryTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryUnionType createGeometryUnionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGeometryUnionTypeFromString(AAAPackage.eINSTANCE.getGeometryUnionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometryUnionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGeometryUnionTypeToString(AAAPackage.eINSTANCE.getGeometryUnionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalAlignmentType createHorizontalAlignmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHorizontalAlignmentTypeFromString(AAAPackage.eINSTANCE.getHorizontalAlignmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalAlignmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHorizontalAlignmentTypeToString(AAAPackage.eINSTANCE.getHorizontalAlignmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineCapsType createLineCapsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLineCapsTypeFromString(AAAPackage.eINSTANCE.getLineCapsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineCapsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineCapsTypeToString(AAAPackage.eINSTANCE.getLineCapsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineJoinType createLineJoinTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLineJoinTypeFromString(AAAPackage.eINSTANCE.getLineJoinType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineJoinTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineJoinTypeToString(AAAPackage.eINSTANCE.getLineJoinType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeighborSelModeType createNeighborSelModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNeighborSelModeTypeFromString(AAAPackage.eINSTANCE.getNeighborSelModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeighborSelModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNeighborSelModeTypeToString(AAAPackage.eINSTANCE.getNeighborSelModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPatternTypeFromString(EDataType eDataType, String initialValue) {
		return createPatternTypeBaseFromString(AAAPackage.eINSTANCE.getPatternTypeBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return convertPatternTypeBaseToString(AAAPackage.eINSTANCE.getPatternTypeBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPatternTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationLogicType createPresentationLogicTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationLogicTypeFromString(AAAPackage.eINSTANCE.getPresentationLogicType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationLogicTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationLogicTypeToString(AAAPackage.eINSTANCE.getPresentationLogicType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularityType createRegularityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRegularityTypeFromString(AAAPackage.eINSTANCE.getRegularityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegularityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRegularityTypeToString(AAAPackage.eINSTANCE.getRegularityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelateType createRelateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelateTypeFromString(AAAPackage.eINSTANCE.getRelateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelateTypeToString(AAAPackage.eINSTANCE.getRelateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeRotationType createRelativeRotationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelativeRotationTypeFromString(AAAPackage.eINSTANCE.getRelativeRotationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativeRotationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelativeRotationTypeToString(AAAPackage.eINSTANCE.getRelativeRotationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDecorationType createTextDecorationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextDecorationTypeFromString(AAAPackage.eINSTANCE.getTextDecorationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextDecorationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextDecorationTypeToString(AAAPackage.eINSTANCE.getTextDecorationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasureType createUnitOfMeasureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitOfMeasureTypeFromString(AAAPackage.eINSTANCE.getUnitOfMeasureType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitOfMeasureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitOfMeasureTypeToString(AAAPackage.eINSTANCE.getUnitOfMeasureType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignmentType createVerticalAlignmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerticalAlignmentTypeFromString(AAAPackage.eINSTANCE.getVerticalAlignmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerticalAlignmentTypeToString(AAAPackage.eINSTANCE.getVerticalAlignmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AAAPackage getAAAPackage() {
		return (AAAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AAAPackage getPackage() {
		return AAAPackage.eINSTANCE;
	}

} //AAAFactoryImpl
