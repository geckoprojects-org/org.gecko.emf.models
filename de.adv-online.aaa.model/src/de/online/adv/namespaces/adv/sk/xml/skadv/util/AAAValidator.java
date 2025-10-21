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
package de.online.adv.namespaces.adv.sk.xml.skadv.util;

import de.online.adv.namespaces.adv.sk.xml.skadv.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage
 * @generated
 */
public class AAAValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AAAValidator INSTANCE = new AAAValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.online.adv.namespaces.adv.sk.xml.skadv";

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
	public AAAValidator() {
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
	  return AAAPackage.eINSTANCE;
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
			case AAAPackage.ADDITIONAL_FILTER_TYPE:
				return validateAdditionalFilterType((AdditionalFilterType)value, diagnostics, context);
			case AAAPackage.ADDITIONAL_FILTER_TYPE1:
				return validateAdditionalFilterType1((AdditionalFilterType1)value, diagnostics, context);
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_PROPERTY_TYPE:
				return validateAdditionalSymbolizersPropertyType((AdditionalSymbolizersPropertyType)value, diagnostics, context);
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE:
				return validateAdditionalSymbolizersType((AdditionalSymbolizersType)value, diagnostics, context);
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1:
				return validateAdditionalSymbolizersType1((AdditionalSymbolizersType1)value, diagnostics, context);
			case AAAPackage.AREA_GRAPHIC_PROPERTY_TYPE:
				return validateAreaGraphicPropertyType((AreaGraphicPropertyType)value, diagnostics, context);
			case AAAPackage.AREA_GRAPHIC_TYPE:
				return validateAreaGraphicType((AreaGraphicType)value, diagnostics, context);
			case AAAPackage.AREA_SYMBOLIZER_PROPERTY_TYPE:
				return validateAreaSymbolizerPropertyType((AreaSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.AREA_SYMBOLIZER_TYPE:
				return validateAreaSymbolizerType((AreaSymbolizerType)value, diagnostics, context);
			case AAAPackage.BACKGROUND_BORDER_TYPE:
				return validateBackgroundBorderType((BackgroundBorderType)value, diagnostics, context);
			case AAAPackage.BACKGROUND_FILL_TYPE:
				return validateBackgroundFillType((BackgroundFillType)value, diagnostics, context);
			case AAAPackage.BOTTOM_EDGE_TYPE:
				return validateBottomEdgeType((BottomEdgeType)value, diagnostics, context);
			case AAAPackage.BOUNDARY_TYPE:
				return validateBoundaryType((BoundaryType)value, diagnostics, context);
			case AAAPackage.BOUNDARY_TYPE1:
				return validateBoundaryType1((BoundaryType1)value, diagnostics, context);
			case AAAPackage.BOUNDARY_TYPE2:
				return validateBoundaryType2((BoundaryType2)value, diagnostics, context);
			case AAAPackage.BOUNDING_BOX_POINT_PROPERTY_TYPE:
				return validateBoundingBoxPointPropertyType((BoundingBoxPointPropertyType)value, diagnostics, context);
			case AAAPackage.BOUNDING_BOX_POINT_TYPE:
				return validateBoundingBoxPointType((BoundingBoxPointType)value, diagnostics, context);
			case AAAPackage.CENTER_POINT_PROPERTY_TYPE:
				return validateCenterPointPropertyType((CenterPointPropertyType)value, diagnostics, context);
			case AAAPackage.CENTER_POINT_TYPE:
				return validateCenterPointType((CenterPointType)value, diagnostics, context);
			case AAAPackage.CIRCULAR_ARC_PROPERTY_TYPE:
				return validateCircularArcPropertyType((CircularArcPropertyType)value, diagnostics, context);
			case AAAPackage.CIRCULAR_ARC_TYPE:
				return validateCircularArcType((CircularArcType)value, diagnostics, context);
			case AAAPackage.CLOSE_PROPERTY_TYPE:
				return validateClosePropertyType((ClosePropertyType)value, diagnostics, context);
			case AAAPackage.CLOSE_TYPE:
				return validateCloseType((CloseType)value, diagnostics, context);
			case AAAPackage.COLOR_CMYK_PROPERTY_TYPE:
				return validateColorCMYKPropertyType((ColorCMYKPropertyType)value, diagnostics, context);
			case AAAPackage.COLOR_CMYK_TYPE:
				return validateColorCMYKType((ColorCMYKType)value, diagnostics, context);
			case AAAPackage.COLOR_PROPERTY_TYPE:
				return validateColorPropertyType((ColorPropertyType)value, diagnostics, context);
			case AAAPackage.COLOR_RGB_PROPERTY_TYPE:
				return validateColorRGBPropertyType((ColorRGBPropertyType)value, diagnostics, context);
			case AAAPackage.COLOR_RGB_TYPE:
				return validateColorRGBType((ColorRGBType)value, diagnostics, context);
			case AAAPackage.COLOR_TYPE:
				return validateColorType((ColorType)value, diagnostics, context);
			case AAAPackage.COLOR_TYPE1:
				return validateColorType1((ColorType1)value, diagnostics, context);
			case AAAPackage.COLOR_TYPE2:
				return validateColorType2((ColorType2)value, diagnostics, context);
			case AAAPackage.COMPOSITE_GRAPHIC_PROPERTY_TYPE:
				return validateCompositeGraphicPropertyType((CompositeGraphicPropertyType)value, diagnostics, context);
			case AAAPackage.COMPOSITE_GRAPHIC_TYPE:
				return validateCompositeGraphicType((CompositeGraphicType)value, diagnostics, context);
			case AAAPackage.COMPOUND_STROKE_PROPERTY_TYPE:
				return validateCompoundStrokePropertyType((CompoundStrokePropertyType)value, diagnostics, context);
			case AAAPackage.COMPOUND_STROKE_SECTION_PROPERTY_TYPE:
				return validateCompoundStrokeSectionPropertyType((CompoundStrokeSectionPropertyType)value, diagnostics, context);
			case AAAPackage.COMPOUND_STROKE_SECTION_TYPE:
				return validateCompoundStrokeSectionType((CompoundStrokeSectionType)value, diagnostics, context);
			case AAAPackage.COMPOUND_STROKE_TYPE:
				return validateCompoundStrokeType((CompoundStrokeType)value, diagnostics, context);
			case AAAPackage.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case AAAPackage.CURRENT_STEP_PROPERTY_TYPE:
				return validateCurrentStepPropertyType((CurrentStepPropertyType)value, diagnostics, context);
			case AAAPackage.CURRENT_STEP_TYPE:
				return validateCurrentStepType((CurrentStepType)value, diagnostics, context);
			case AAAPackage.CURVETO_PROPERTY_TYPE:
				return validateCurvetoPropertyType((CurvetoPropertyType)value, diagnostics, context);
			case AAAPackage.CURVETO_TYPE:
				return validateCurvetoType((CurvetoType)value, diagnostics, context);
			case AAAPackage.DASHED_STROKE_PROPERTY_TYPE:
				return validateDashedStrokePropertyType((DashedStrokePropertyType)value, diagnostics, context);
			case AAAPackage.DASHED_STROKE_TYPE:
				return validateDashedStrokeType((DashedStrokeType)value, diagnostics, context);
			case AAAPackage.DESIGN_RULE_PROPERTY_TYPE:
				return validateDesignRulePropertyType((DesignRulePropertyType)value, diagnostics, context);
			case AAAPackage.DESIGN_RULE_TYPE:
				return validateDesignRuleType((DesignRuleType)value, diagnostics, context);
			case AAAPackage.DESIGN_RULE_TYPE1:
				return validateDesignRuleType1((DesignRuleType1)value, diagnostics, context);
			case AAAPackage.DISPLACEMENT_PROPERTY_TYPE:
				return validateDisplacementPropertyType((DisplacementPropertyType)value, diagnostics, context);
			case AAAPackage.DISPLACEMENT_TYPE:
				return validateDisplacementType((DisplacementType)value, diagnostics, context);
			case AAAPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AAAPackage.ELEMENT_PROPERTY_TYPE:
				return validateElementPropertyType((ElementPropertyType)value, diagnostics, context);
			case AAAPackage.ELEMENT_TYPE:
				return validateElementType((ElementType)value, diagnostics, context);
			case AAAPackage.ELEMENT_TYPE1:
				return validateElementType1((ElementType1)value, diagnostics, context);
			case AAAPackage.ELSE_TYPE:
				return validateElseType((ElseType)value, diagnostics, context);
			case AAAPackage.EMIT_PROPERTY_TYPE:
				return validateEmitPropertyType((EmitPropertyType)value, diagnostics, context);
			case AAAPackage.EMIT_TYPE:
				return validateEmitType((EmitType)value, diagnostics, context);
			case AAAPackage.EMIT_TYPE1:
				return validateEmitType1((EmitType1)value, diagnostics, context);
			case AAAPackage.EVERY_PROPERTY_TYPE:
				return validateEveryPropertyType((EveryPropertyType)value, diagnostics, context);
			case AAAPackage.EVERY_TYPE:
				return validateEveryType((EveryType)value, diagnostics, context);
			case AAAPackage.EXPRESSION_PROPERTY_TYPE:
				return validateExpressionPropertyType((ExpressionPropertyType)value, diagnostics, context);
			case AAAPackage.EXPRESSION_TYPE:
				return validateExpressionType((ExpressionType)value, diagnostics, context);
			case AAAPackage.EXPRESSION_TYPE1:
				return validateExpressionType1((ExpressionType1)value, diagnostics, context);
			case AAAPackage.FEATURE_TYPE_STEP_PROPERTY_TYPE:
				return validateFeatureTypeStepPropertyType((FeatureTypeStepPropertyType)value, diagnostics, context);
			case AAAPackage.FEATURE_TYPE_STEP_TYPE:
				return validateFeatureTypeStepType((FeatureTypeStepType)value, diagnostics, context);
			case AAAPackage.FILL_PROPERTY_TYPE:
				return validateFillPropertyType((FillPropertyType)value, diagnostics, context);
			case AAAPackage.FILL_TYPE:
				return validateFillType((FillType)value, diagnostics, context);
			case AAAPackage.FILTERED_SYMBOLIZER_PROPERTY_TYPE:
				return validateFilteredSymbolizerPropertyType((FilteredSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE:
				return validateFilteredSymbolizerType((FilteredSymbolizerType)value, diagnostics, context);
			case AAAPackage.FILTER_PROPERTY_TYPE:
				return validateFilterPropertyType((FilterPropertyType)value, diagnostics, context);
			case AAAPackage.FILTER_TYPE:
				return validateFilterType((FilterType)value, diagnostics, context);
			case AAAPackage.FILTER_TYPE1:
				return validateFilterType1((FilterType1)value, diagnostics, context);
			case AAAPackage.FIRST_STEP_PROPERTY_TYPE:
				return validateFirstStepPropertyType((FirstStepPropertyType)value, diagnostics, context);
			case AAAPackage.FIRST_STEP_TYPE:
				return validateFirstStepType((FirstStepType)value, diagnostics, context);
			case AAAPackage.FIRST_STEP_TYPE1:
				return validateFirstStepType1((FirstStepType1)value, diagnostics, context);
			case AAAPackage.FONT_PROPERTY_TYPE:
				return validateFontPropertyType((FontPropertyType)value, diagnostics, context);
			case AAAPackage.FONT_TYPE:
				return validateFontType((FontType)value, diagnostics, context);
			case AAAPackage.FONT_TYPE1:
				return validateFontType1((FontType1)value, diagnostics, context);
			case AAAPackage.FOR_PROPERTY_TYPE:
				return validateForPropertyType((ForPropertyType)value, diagnostics, context);
			case AAAPackage.FOR_TYPE:
				return validateForType((ForType)value, diagnostics, context);
			case AAAPackage.GAP_PROPERTY_TYPE:
				return validateGapPropertyType((GapPropertyType)value, diagnostics, context);
			case AAAPackage.GAP_TYPE:
				return validateGapType((GapType)value, diagnostics, context);
			case AAAPackage.GEOMETRY_TYPE:
				return validateGeometryType((GeometryType)value, diagnostics, context);
			case AAAPackage.GEOMETRY_TYPE1:
				return validateGeometryType1((GeometryType1)value, diagnostics, context);
			case AAAPackage.GEOMETRY_TYPE2:
				return validateGeometryType2((GeometryType2)value, diagnostics, context);
			case AAAPackage.GRAPHIC_FILL_PROPERTY_TYPE:
				return validateGraphicFillPropertyType((GraphicFillPropertyType)value, diagnostics, context);
			case AAAPackage.GRAPHIC_FILL_TYPE:
				return validateGraphicFillType((GraphicFillType)value, diagnostics, context);
			case AAAPackage.GRAPHIC_PROPERTY_TYPE:
				return validateGraphicPropertyType((GraphicPropertyType)value, diagnostics, context);
			case AAAPackage.GRAPHIC_TYPE:
				return validateGraphicType((GraphicType)value, diagnostics, context);
			case AAAPackage.GRAPHIC_TYPE1:
				return validateGraphicType1((GraphicType1)value, diagnostics, context);
			case AAAPackage.GRAPHIC_TYPE2:
				return validateGraphicType2((GraphicType2)value, diagnostics, context);
			case AAAPackage.GRAPHIC_TYPE3:
				return validateGraphicType3((GraphicType3)value, diagnostics, context);
			case AAAPackage.HALO_COLOR_TYPE:
				return validateHaloColorType((HaloColorType)value, diagnostics, context);
			case AAAPackage.HALO_PROPERTY_TYPE:
				return validateHaloPropertyType((HaloPropertyType)value, diagnostics, context);
			case AAAPackage.HALO_TYPE:
				return validateHaloType((HaloType)value, diagnostics, context);
			case AAAPackage.HALO_TYPE1:
				return validateHaloType1((HaloType1)value, diagnostics, context);
			case AAAPackage.HALO_TYPE2:
				return validateHaloType2((HaloType2)value, diagnostics, context);
			case AAAPackage.HATCH_DEFINITION_LONGEST_SIDE_PROPERTY_TYPE:
				return validateHatchDefinitionLongestSidePropertyType((HatchDefinitionLongestSidePropertyType)value, diagnostics, context);
			case AAAPackage.HATCH_DEFINITION_PROPERTY_TYPE:
				return validateHatchDefinitionPropertyType((HatchDefinitionPropertyType)value, diagnostics, context);
			case AAAPackage.HATCH_FILL_LONGEST_SIDE_PROPERTY_TYPE:
				return validateHatchFillLongestSidePropertyType((HatchFillLongestSidePropertyType)value, diagnostics, context);
			case AAAPackage.HATCH_FILL_LONGEST_SIDE_TYPE:
				return validateHatchFillLongestSideType((HatchFillLongestSideType)value, diagnostics, context);
			case AAAPackage.HATCH_FILL_PROPERTY_TYPE:
				return validateHatchFillPropertyType((HatchFillPropertyType)value, diagnostics, context);
			case AAAPackage.HATCH_FILL_TYPE:
				return validateHatchFillType((HatchFillType)value, diagnostics, context);
			case AAAPackage.HATCH_LINES_LONGEST_SIDE_PROPERTY_TYPE:
				return validateHatchLinesLongestSidePropertyType((HatchLinesLongestSidePropertyType)value, diagnostics, context);
			case AAAPackage.HATCH_LINES_LONGEST_SIDE_TYPE:
				return validateHatchLinesLongestSideType((HatchLinesLongestSideType)value, diagnostics, context);
			case AAAPackage.HATCH_LINES_PROPERTY_TYPE:
				return validateHatchLinesPropertyType((HatchLinesPropertyType)value, diagnostics, context);
			case AAAPackage.HATCH_LINES_TYPE:
				return validateHatchLinesType((HatchLinesType)value, diagnostics, context);
			case AAAPackage.IF_PROPERTY_TYPE:
				return validateIfPropertyType((IfPropertyType)value, diagnostics, context);
			case AAAPackage.IF_TYPE:
				return validateIfType((IfType)value, diagnostics, context);
			case AAAPackage.INTERIOR_TYPE:
				return validateInteriorType((InteriorType)value, diagnostics, context);
			case AAAPackage.INTERIOR_TYPE1:
				return validateInteriorType1((InteriorType1)value, diagnostics, context);
			case AAAPackage.IN_TYPE:
				return validateInType((InType)value, diagnostics, context);
			case AAAPackage.IN_TYPE1:
				return validateInType1((InType1)value, diagnostics, context);
			case AAAPackage.LABEL_PROPERTY_TYPE:
				return validateLabelPropertyType((LabelPropertyType)value, diagnostics, context);
			case AAAPackage.LABEL_TEXT_TYPE:
				return validateLabelTextType((LabelTextType)value, diagnostics, context);
			case AAAPackage.LABEL_TEXT_TYPE1:
				return validateLabelTextType1((LabelTextType1)value, diagnostics, context);
			case AAAPackage.LABEL_TYPE:
				return validateLabelType((LabelType)value, diagnostics, context);
			case AAAPackage.LABEL_TYPE1:
				return validateLabelType1((LabelType1)value, diagnostics, context);
			case AAAPackage.LABEL_TYPE2:
				return validateLabelType2((LabelType2)value, diagnostics, context);
			case AAAPackage.LABEL_TYPE3:
				return validateLabelType3((LabelType3)value, diagnostics, context);
			case AAAPackage.LAYER_PROPERTY_TYPE:
				return validateLayerPropertyType((LayerPropertyType)value, diagnostics, context);
			case AAAPackage.LAYER_TYPE:
				return validateLayerType((LayerType)value, diagnostics, context);
			case AAAPackage.LAYER_TYPE1:
				return validateLayerType1((LayerType1)value, diagnostics, context);
			case AAAPackage.LINE_GRAPHIC_PROPERTY_TYPE:
				return validateLineGraphicPropertyType((LineGraphicPropertyType)value, diagnostics, context);
			case AAAPackage.LINE_GRAPHIC_TYPE:
				return validateLineGraphicType((LineGraphicType)value, diagnostics, context);
			case AAAPackage.LINE_LABEL_PROPERTY_TYPE:
				return validateLineLabelPropertyType((LineLabelPropertyType)value, diagnostics, context);
			case AAAPackage.LINE_LABEL_TYPE:
				return validateLineLabelType((LineLabelType)value, diagnostics, context);
			case AAAPackage.LINE_PLACED_GRAPHIC_PROPERTY_TYPE:
				return validateLinePlacedGraphicPropertyType((LinePlacedGraphicPropertyType)value, diagnostics, context);
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE:
				return validateLinePlacedGraphicType((LinePlacedGraphicType)value, diagnostics, context);
			case AAAPackage.LINE_SYMBOLIZER_PROPERTY_TYPE:
				return validateLineSymbolizerPropertyType((LineSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.LINE_SYMBOLIZER_TYPE:
				return validateLineSymbolizerType((LineSymbolizerType)value, diagnostics, context);
			case AAAPackage.LINETO_PROPERTY_TYPE:
				return validateLinetoPropertyType((LinetoPropertyType)value, diagnostics, context);
			case AAAPackage.LINETO_TYPE:
				return validateLinetoType((LinetoType)value, diagnostics, context);
			case AAAPackage.LITERAL_PROPERTY_TYPE:
				return validateLiteralPropertyType((LiteralPropertyType)value, diagnostics, context);
			case AAAPackage.LITERAL_TYPE:
				return validateLiteralType((LiteralType)value, diagnostics, context);
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_PROPERTY_TYPE:
				return validateMaximumAdjacentLineStringPropertyType((MaximumAdjacentLineStringPropertyType)value, diagnostics, context);
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE:
				return validateMaximumAdjacentLineStringType((MaximumAdjacentLineStringType)value, diagnostics, context);
			case AAAPackage.MAXIMUM_ADJACENT_SURFACE_PROPERTY_TYPE:
				return validateMaximumAdjacentSurfacePropertyType((MaximumAdjacentSurfacePropertyType)value, diagnostics, context);
			case AAAPackage.MAXIMUM_ADJACENT_SURFACE_TYPE:
				return validateMaximumAdjacentSurfaceType((MaximumAdjacentSurfaceType)value, diagnostics, context);
			case AAAPackage.MEASURE_LITERAL_PROPERTY_TYPE:
				return validateMeasureLiteralPropertyType((MeasureLiteralPropertyType)value, diagnostics, context);
			case AAAPackage.MEASURE_LITERAL_TYPE:
				return validateMeasureLiteralType((MeasureLiteralType)value, diagnostics, context);
			case AAAPackage.MEMBER_TYPE:
				return validateMemberType((MemberType)value, diagnostics, context);
			case AAAPackage.MOVETO_PROPERTY_TYPE:
				return validateMovetoPropertyType((MovetoPropertyType)value, diagnostics, context);
			case AAAPackage.MOVETO_TYPE:
				return validateMovetoType((MovetoType)value, diagnostics, context);
			case AAAPackage.NEIGHBORHOOD_FILTER_TYPE:
				return validateNeighborhoodFilterType((NeighborhoodFilterType)value, diagnostics, context);
			case AAAPackage.NULL_COLOR_PROPERTY_TYPE:
				return validateNullColorPropertyType((NullColorPropertyType)value, diagnostics, context);
			case AAAPackage.NULL_COLOR_TYPE:
				return validateNullColorType((NullColorType)value, diagnostics, context);
			case AAAPackage.NULL_SYMBOLIZER_PROPERTY_TYPE:
				return validateNullSymbolizerPropertyType((NullSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.NULL_SYMBOLIZER_TYPE:
				return validateNullSymbolizerType((NullSymbolizerType)value, diagnostics, context);
			case AAAPackage.OPERAND_TYPE:
				return validateOperandType((OperandType)value, diagnostics, context);
			case AAAPackage.OPERATION_PROPERTY_TYPE:
				return validateOperationPropertyType((OperationPropertyType)value, diagnostics, context);
			case AAAPackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case AAAPackage.PATH_ELEMENT_PROPERTY_TYPE:
				return validatePathElementPropertyType((PathElementPropertyType)value, diagnostics, context);
			case AAAPackage.PATH_ELEMENT_TYPE:
				return validatePathElementType((PathElementType)value, diagnostics, context);
			case AAAPackage.PATH_PROPERTY_TYPE:
				return validatePathPropertyType((PathPropertyType)value, diagnostics, context);
			case AAAPackage.PATH_TYPE:
				return validatePathType((PathType)value, diagnostics, context);
			case AAAPackage.PERPENDICULAR_OFFSET_PROPERTY_TYPE:
				return validatePerpendicularOffsetPropertyType((PerpendicularOffsetPropertyType)value, diagnostics, context);
			case AAAPackage.PERPENDICULAR_OFFSET_TYPE:
				return validatePerpendicularOffsetType((PerpendicularOffsetType)value, diagnostics, context);
			case AAAPackage.PLACEMENT_RULE_PROPERTY_TYPE:
				return validatePlacementRulePropertyType((PlacementRulePropertyType)value, diagnostics, context);
			case AAAPackage.PLACEMENT_RULE_TYPE:
				return validatePlacementRuleType((PlacementRuleType)value, diagnostics, context);
			case AAAPackage.PLACEMENT_TYPE:
				return validatePlacementType((PlacementType)value, diagnostics, context);
			case AAAPackage.POINT_LABEL_PROPERTY_TYPE:
				return validatePointLabelPropertyType((PointLabelPropertyType)value, diagnostics, context);
			case AAAPackage.POINT_LABEL_TYPE:
				return validatePointLabelType((PointLabelType)value, diagnostics, context);
			case AAAPackage.POINTS_IN_AREA_DEFINITION_PROPERTY_TYPE:
				return validatePointsInAreaDefinitionPropertyType((PointsInAreaDefinitionPropertyType)value, diagnostics, context);
			case AAAPackage.POINTS_IN_AREA_PROPERTY_TYPE:
				return validatePointsInAreaPropertyType((PointsInAreaPropertyType)value, diagnostics, context);
			case AAAPackage.POINTS_IN_AREA_TYPE:
				return validatePointsInAreaType((PointsInAreaType)value, diagnostics, context);
			case AAAPackage.POINTS_ON_LINE_PROPERTY_TYPE:
				return validatePointsOnLinePropertyType((PointsOnLinePropertyType)value, diagnostics, context);
			case AAAPackage.POINTS_ON_LINE_TYPE:
				return validatePointsOnLineType((PointsOnLineType)value, diagnostics, context);
			case AAAPackage.POINT_SYMBOLIZER_PROPERTY_TYPE:
				return validatePointSymbolizerPropertyType((PointSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.POINT_SYMBOLIZER_TYPE:
				return validatePointSymbolizerType((PointSymbolizerType)value, diagnostics, context);
			case AAAPackage.POST_GRAPHIC_TYPE:
				return validatePostGraphicType((PostGraphicType)value, diagnostics, context);
			case AAAPackage.PREDICATE_TYPE:
				return validatePredicateType((PredicateType)value, diagnostics, context);
			case AAAPackage.PREDICATE_TYPE1:
				return validatePredicateType1((PredicateType1)value, diagnostics, context);
			case AAAPackage.PRE_GRAPHIC_TYPE:
				return validatePreGraphicType((PreGraphicType)value, diagnostics, context);
			case AAAPackage.PROPERTY_PROPERTY_TYPE:
				return validatePropertyPropertyType((PropertyPropertyType)value, diagnostics, context);
			case AAAPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case AAAPackage.PURE_SYMBOLIZER_PROPERTY_TYPE:
				return validatePureSymbolizerPropertyType((PureSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.PURE_SYMBOLIZER_TYPE:
				return validatePureSymbolizerType((PureSymbolizerType)value, diagnostics, context);
			case AAAPackage.PURE_SYMBOLIZER_TYPE1:
				return validatePureSymbolizerType1((PureSymbolizerType1)value, diagnostics, context);
			case AAAPackage.QUANTIFIER_PROPERTY_TYPE:
				return validateQuantifierPropertyType((QuantifierPropertyType)value, diagnostics, context);
			case AAAPackage.QUANTIFIER_TYPE:
				return validateQuantifierType((QuantifierType)value, diagnostics, context);
			case AAAPackage.RELATE_FILTER_TYPE:
				return validateRelateFilterType((RelateFilterType)value, diagnostics, context);
			case AAAPackage.RELATE_GEOMETRY_PROPERTY_TYPE:
				return validateRelateGeometryPropertyType((RelateGeometryPropertyType)value, diagnostics, context);
			case AAAPackage.RELATE_GEOMETRY_TYPE:
				return validateRelateGeometryType((RelateGeometryType)value, diagnostics, context);
			case AAAPackage.RELATE_TOPOLOGY_PROPERTY_TYPE:
				return validateRelateTopologyPropertyType((RelateTopologyPropertyType)value, diagnostics, context);
			case AAAPackage.RELATE_TOPOLOGY_TYPE:
				return validateRelateTopologyType((RelateTopologyType)value, diagnostics, context);
			case AAAPackage.RETURN_TYPE:
				return validateReturnType((ReturnType)value, diagnostics, context);
			case AAAPackage.RULE_PROPERTY_TYPE:
				return validateRulePropertyType((RulePropertyType)value, diagnostics, context);
			case AAAPackage.RULE_SET_PROPERTY_TYPE:
				return validateRuleSetPropertyType((RuleSetPropertyType)value, diagnostics, context);
			case AAAPackage.RULE_SET_TYPE:
				return validateRuleSetType((RuleSetType)value, diagnostics, context);
			case AAAPackage.RULE_SET_TYPE1:
				return validateRuleSetType1((RuleSetType1)value, diagnostics, context);
			case AAAPackage.RULES_TO_CONSIDER_TYPE:
				return validateRulesToConsiderType((RulesToConsiderType)value, diagnostics, context);
			case AAAPackage.RULE_TYPE:
				return validateRuleType((RuleType)value, diagnostics, context);
			case AAAPackage.RULE_TYPE1:
				return validateRuleType1((RuleType1)value, diagnostics, context);
			case AAAPackage.SATISFIES_TYPE:
				return validateSatisfiesType((SatisfiesType)value, diagnostics, context);
			case AAAPackage.SECTION_TYPE:
				return validateSectionType((SectionType)value, diagnostics, context);
			case AAAPackage.SELF_STEP_PROPERTY_TYPE:
				return validateSelfStepPropertyType((SelfStepPropertyType)value, diagnostics, context);
			case AAAPackage.SELF_STEP_TYPE:
				return validateSelfStepType((SelfStepType)value, diagnostics, context);
			case AAAPackage.SHIELDED_POINT_LABEL_PROPERTY_TYPE:
				return validateShieldedPointLabelPropertyType((ShieldedPointLabelPropertyType)value, diagnostics, context);
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE:
				return validateShieldedPointLabelType((ShieldedPointLabelType)value, diagnostics, context);
			case AAAPackage.SIMPLE_GRAPHIC_PROPERTY_TYPE:
				return validateSimpleGraphicPropertyType((SimpleGraphicPropertyType)value, diagnostics, context);
			case AAAPackage.SIMPLE_GRAPHIC_TYPE:
				return validateSimpleGraphicType((SimpleGraphicType)value, diagnostics, context);
			case AAAPackage.SKELETON_LINE_PROPERTY_TYPE:
				return validateSkeletonLinePropertyType((SkeletonLinePropertyType)value, diagnostics, context);
			case AAAPackage.SKELETON_LINE_TYPE:
				return validateSkeletonLineType((SkeletonLineType)value, diagnostics, context);
			case AAAPackage.SLOPE_HATCH_LINES_PROPERTY_TYPE:
				return validateSlopeHatchLinesPropertyType((SlopeHatchLinesPropertyType)value, diagnostics, context);
			case AAAPackage.SLOPE_HATCH_LINES_TYPE:
				return validateSlopeHatchLinesType((SlopeHatchLinesType)value, diagnostics, context);
			case AAAPackage.SOLID_FILL_PROPERTY_TYPE:
				return validateSolidFillPropertyType((SolidFillPropertyType)value, diagnostics, context);
			case AAAPackage.SOLID_FILL_TYPE:
				return validateSolidFillType((SolidFillType)value, diagnostics, context);
			case AAAPackage.SOLID_OR_DASHED_STROKE_PROPERTY_TYPE:
				return validateSolidOrDashedStrokePropertyType((SolidOrDashedStrokePropertyType)value, diagnostics, context);
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE:
				return validateSolidOrDashedStrokeType((SolidOrDashedStrokeType)value, diagnostics, context);
			case AAAPackage.SOLID_SECTION_PROPERTY_TYPE:
				return validateSolidSectionPropertyType((SolidSectionPropertyType)value, diagnostics, context);
			case AAAPackage.SOLID_SECTION_TYPE:
				return validateSolidSectionType((SolidSectionType)value, diagnostics, context);
			case AAAPackage.SOLID_STROKE_PROPERTY_TYPE:
				return validateSolidStrokePropertyType((SolidStrokePropertyType)value, diagnostics, context);
			case AAAPackage.SOLID_STROKE_TYPE:
				return validateSolidStrokeType((SolidStrokeType)value, diagnostics, context);
			case AAAPackage.SOME_PROPERTY_TYPE:
				return validateSomePropertyType((SomePropertyType)value, diagnostics, context);
			case AAAPackage.SOME_TYPE:
				return validateSomeType((SomeType)value, diagnostics, context);
			case AAAPackage.STEP_PROPERTY_TYPE:
				return validateStepPropertyType((StepPropertyType)value, diagnostics, context);
			case AAAPackage.STEP_TYPE:
				return validateStepType((StepType)value, diagnostics, context);
			case AAAPackage.STEP_TYPE1:
				return validateStepType1((StepType1)value, diagnostics, context);
			case AAAPackage.STROKE_PROPERTY_TYPE:
				return validateStrokePropertyType((StrokePropertyType)value, diagnostics, context);
			case AAAPackage.STROKE_TYPE:
				return validateStrokeType((StrokeType)value, diagnostics, context);
			case AAAPackage.STROKE_TYPE1:
				return validateStrokeType1((StrokeType1)value, diagnostics, context);
			case AAAPackage.STROKE_TYPE2:
				return validateStrokeType2((StrokeType2)value, diagnostics, context);
			case AAAPackage.STROKE_TYPE3:
				return validateStrokeType3((StrokeType3)value, diagnostics, context);
			case AAAPackage.STROKE_TYPE4:
				return validateStrokeType4((StrokeType4)value, diagnostics, context);
			case AAAPackage.STROKE_TYPE5:
				return validateStrokeType5((StrokeType5)value, diagnostics, context);
			case AAAPackage.STYLE_PROPERTY_TYPE:
				return validateStylePropertyType((StylePropertyType)value, diagnostics, context);
			case AAAPackage.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case AAAPackage.STYLE_TYPE1:
				return validateStyleType1((StyleType1)value, diagnostics, context);
			case AAAPackage.SYMBOLIZER_PREDICATE_TYPE:
				return validateSymbolizerPredicateType((SymbolizerPredicateType)value, diagnostics, context);
			case AAAPackage.SYMBOLIZER_PROPERTY_TYPE:
				return validateSymbolizerPropertyType((SymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.SYMBOLIZER_TYPE:
				return validateSymbolizerType((SymbolizerType)value, diagnostics, context);
			case AAAPackage.SYMBOLIZER_TYPE1:
				return validateSymbolizerType1((SymbolizerType1)value, diagnostics, context);
			case AAAPackage.SYMBOLIZER_TYPE2:
				return validateSymbolizerType2((SymbolizerType2)value, diagnostics, context);
			case AAAPackage.SYMBOLOGY_CATALOG_PROPERTY_TYPE:
				return validateSymbologyCatalogPropertyType((SymbologyCatalogPropertyType)value, diagnostics, context);
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE:
				return validateSymbologyCatalogType((SymbologyCatalogType)value, diagnostics, context);
			case AAAPackage.TAG_PROPERTY_TYPE:
				return validateTagPropertyType((TagPropertyType)value, diagnostics, context);
			case AAAPackage.TAG_SET_PROPERTY_TYPE:
				return validateTagSetPropertyType((TagSetPropertyType)value, diagnostics, context);
			case AAAPackage.TAG_SET_TYPE:
				return validateTagSetType((TagSetType)value, diagnostics, context);
			case AAAPackage.TAG_TYPE:
				return validateTagType((TagType)value, diagnostics, context);
			case AAAPackage.TAG_TYPE1:
				return validateTagType1((TagType1)value, diagnostics, context);
			case AAAPackage.TARGET_COLOR_TYPE:
				return validateTargetColorType((TargetColorType)value, diagnostics, context);
			case AAAPackage.TEXT_BODY_FILL_TYPE:
				return validateTextBodyFillType((TextBodyFillType)value, diagnostics, context);
			case AAAPackage.TEXT_GRAPHIC_PROPERTY_TYPE:
				return validateTextGraphicPropertyType((TextGraphicPropertyType)value, diagnostics, context);
			case AAAPackage.TEXT_GRAPHIC_TYPE:
				return validateTextGraphicType((TextGraphicType)value, diagnostics, context);
			case AAAPackage.TEXT_SECTION_PROPERTY_TYPE:
				return validateTextSectionPropertyType((TextSectionPropertyType)value, diagnostics, context);
			case AAAPackage.TEXT_SECTION_TYPE:
				return validateTextSectionType((TextSectionType)value, diagnostics, context);
			case AAAPackage.TEXT_SYMBOLIZER_PROPERTY_TYPE:
				return validateTextSymbolizerPropertyType((TextSymbolizerPropertyType)value, diagnostics, context);
			case AAAPackage.TEXT_SYMBOLIZER_TYPE:
				return validateTextSymbolizerType((TextSymbolizerType)value, diagnostics, context);
			case AAAPackage.THEN_TYPE:
				return validateThenType((ThenType)value, diagnostics, context);
			case AAAPackage.TOP_EDGE_TYPE:
				return validateTopEdgeType((TopEdgeType)value, diagnostics, context);
			case AAAPackage.TUBE_PROPERTY_TYPE:
				return validateTubePropertyType((TubePropertyType)value, diagnostics, context);
			case AAAPackage.TUBE_TYPE:
				return validateTubeType((TubeType)value, diagnostics, context);
			case AAAPackage.VARIABLE_PROPERTY_TYPE:
				return validateVariablePropertyType((VariablePropertyType)value, diagnostics, context);
			case AAAPackage.VARIABLE_STEP_PROPERTY_TYPE:
				return validateVariableStepPropertyType((VariableStepPropertyType)value, diagnostics, context);
			case AAAPackage.VARIABLE_STEP_TYPE:
				return validateVariableStepType((VariableStepType)value, diagnostics, context);
			case AAAPackage.VARIABLE_TYPE:
				return validateVariableType((VariableType)value, diagnostics, context);
			case AAAPackage.VARIABLE_TYPE1:
				return validateVariableType1((VariableType1)value, diagnostics, context);
			case AAAPackage.VARIABLE_TYPE2:
				return validateVariableType2((VariableType2)value, diagnostics, context);
			case AAAPackage.VARIABLE_TYPE3:
				return validateVariableType3((VariableType3)value, diagnostics, context);
			case AAAPackage.VARIANT_GEOMETRY_PROPERTY_TYPE:
				return validateVariantGeometryPropertyType((VariantGeometryPropertyType)value, diagnostics, context);
			case AAAPackage.VARIANT_GEOMETRY_TYPE:
				return validateVariantGeometryType((VariantGeometryType)value, diagnostics, context);
			case AAAPackage.VENDOR_SPECIFIC_TYPE:
				return validateVendorSpecificType((VendorSpecificType)value, diagnostics, context);
			case AAAPackage.ADJUSTMENT_TYPE:
				return validateAdjustmentType((AdjustmentType)value, diagnostics, context);
			case AAAPackage.BASIC_OBJECT_TYPE_TYPE:
				return validateBasicObjectTypeType((BasicObjectTypeType)value, diagnostics, context);
			case AAAPackage.BOUNDARY_OVERLAP_TREATMENT_TYPE:
				return validateBoundaryOverlapTreatmentType((BoundaryOverlapTreatmentType)value, diagnostics, context);
			case AAAPackage.DATA_TYPE_TYPE:
				return validateDataTypeType((DataTypeType)value, diagnostics, context);
			case AAAPackage.FONT_STYLE_TYPE:
				return validateFontStyleType((FontStyleType)value, diagnostics, context);
			case AAAPackage.FONT_WEIGHT_TYPE:
				return validateFontWeightType((FontWeightType)value, diagnostics, context);
			case AAAPackage.GEOMETRY_TYPE_TYPE:
				return validateGeometryTypeType((GeometryTypeType)value, diagnostics, context);
			case AAAPackage.GEOMETRY_UNION_TYPE:
				return validateGeometryUnionType((GeometryUnionType)value, diagnostics, context);
			case AAAPackage.HORIZONTAL_ALIGNMENT_TYPE:
				return validateHorizontalAlignmentType((HorizontalAlignmentType)value, diagnostics, context);
			case AAAPackage.LINE_CAPS_TYPE:
				return validateLineCapsType((LineCapsType)value, diagnostics, context);
			case AAAPackage.LINE_JOIN_TYPE:
				return validateLineJoinType((LineJoinType)value, diagnostics, context);
			case AAAPackage.NEIGHBOR_SEL_MODE_TYPE:
				return validateNeighborSelModeType((NeighborSelModeType)value, diagnostics, context);
			case AAAPackage.PRESENTATION_LOGIC_TYPE:
				return validatePresentationLogicType((PresentationLogicType)value, diagnostics, context);
			case AAAPackage.REGULARITY_TYPE:
				return validateRegularityType((RegularityType)value, diagnostics, context);
			case AAAPackage.RELATE_TYPE:
				return validateRelateType((RelateType)value, diagnostics, context);
			case AAAPackage.RELATIVE_ROTATION_TYPE:
				return validateRelativeRotationType((RelativeRotationType)value, diagnostics, context);
			case AAAPackage.TEXT_DECORATION_TYPE:
				return validateTextDecorationType((TextDecorationType)value, diagnostics, context);
			case AAAPackage.UNIT_OF_MEASURE_TYPE:
				return validateUnitOfMeasureType((UnitOfMeasureType)value, diagnostics, context);
			case AAAPackage.VERTICAL_ALIGNMENT_TYPE:
				return validateVerticalAlignmentType((VerticalAlignmentType)value, diagnostics, context);
			case AAAPackage.ADJUSTMENT_TYPE_OBJECT:
				return validateAdjustmentTypeObject((AdjustmentType)value, diagnostics, context);
			case AAAPackage.BASIC_OBJECT_TYPE_TYPE_OBJECT:
				return validateBasicObjectTypeTypeObject((BasicObjectTypeType)value, diagnostics, context);
			case AAAPackage.BOUNDARY_OVERLAP_TREATMENT_TYPE_OBJECT:
				return validateBoundaryOverlapTreatmentTypeObject((BoundaryOverlapTreatmentType)value, diagnostics, context);
			case AAAPackage.DASHARRAY_TYPE:
				return validateDasharrayType((List<?>)value, diagnostics, context);
			case AAAPackage.DASHARRAY_TYPE_BASE:
				return validateDasharrayTypeBase((List<?>)value, diagnostics, context);
			case AAAPackage.DATA_TYPE_TYPE_OBJECT:
				return validateDataTypeTypeObject((DataTypeType)value, diagnostics, context);
			case AAAPackage.FONT_STYLE_TYPE_OBJECT:
				return validateFontStyleTypeObject((FontStyleType)value, diagnostics, context);
			case AAAPackage.FONT_WEIGHT_TYPE_OBJECT:
				return validateFontWeightTypeObject((FontWeightType)value, diagnostics, context);
			case AAAPackage.GEOMETRY_TYPE_TYPE_OBJECT:
				return validateGeometryTypeTypeObject((GeometryTypeType)value, diagnostics, context);
			case AAAPackage.GEOMETRY_UNION_TYPE_OBJECT:
				return validateGeometryUnionTypeObject((GeometryUnionType)value, diagnostics, context);
			case AAAPackage.HORIZONTAL_ALIGNMENT_TYPE_OBJECT:
				return validateHorizontalAlignmentTypeObject((HorizontalAlignmentType)value, diagnostics, context);
			case AAAPackage.LINE_CAPS_TYPE_OBJECT:
				return validateLineCapsTypeObject((LineCapsType)value, diagnostics, context);
			case AAAPackage.LINE_JOIN_TYPE_OBJECT:
				return validateLineJoinTypeObject((LineJoinType)value, diagnostics, context);
			case AAAPackage.NEIGHBOR_SEL_MODE_TYPE_OBJECT:
				return validateNeighborSelModeTypeObject((NeighborSelModeType)value, diagnostics, context);
			case AAAPackage.PATTERN_TYPE:
				return validatePatternType((List<?>)value, diagnostics, context);
			case AAAPackage.PATTERN_TYPE_BASE:
				return validatePatternTypeBase((List<?>)value, diagnostics, context);
			case AAAPackage.PRESENTATION_LOGIC_TYPE_OBJECT:
				return validatePresentationLogicTypeObject((PresentationLogicType)value, diagnostics, context);
			case AAAPackage.REGULARITY_TYPE_OBJECT:
				return validateRegularityTypeObject((RegularityType)value, diagnostics, context);
			case AAAPackage.RELATE_TYPE_OBJECT:
				return validateRelateTypeObject((RelateType)value, diagnostics, context);
			case AAAPackage.RELATIVE_ROTATION_TYPE_OBJECT:
				return validateRelativeRotationTypeObject((RelativeRotationType)value, diagnostics, context);
			case AAAPackage.TEXT_DECORATION_TYPE_OBJECT:
				return validateTextDecorationTypeObject((TextDecorationType)value, diagnostics, context);
			case AAAPackage.UNIT_OF_MEASURE_TYPE_OBJECT:
				return validateUnitOfMeasureTypeObject((UnitOfMeasureType)value, diagnostics, context);
			case AAAPackage.VERTICAL_ALIGNMENT_TYPE_OBJECT:
				return validateVerticalAlignmentTypeObject((VerticalAlignmentType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalFilterType(AdditionalFilterType additionalFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalFilterType1(AdditionalFilterType1 additionalFilterType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalFilterType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalSymbolizersPropertyType(AdditionalSymbolizersPropertyType additionalSymbolizersPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalSymbolizersPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalSymbolizersType(AdditionalSymbolizersType additionalSymbolizersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalSymbolizersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalSymbolizersType1(AdditionalSymbolizersType1 additionalSymbolizersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalSymbolizersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaGraphicPropertyType(AreaGraphicPropertyType areaGraphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaGraphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaGraphicType(AreaGraphicType areaGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaSymbolizerPropertyType(AreaSymbolizerPropertyType areaSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaSymbolizerType(AreaSymbolizerType areaSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundBorderType(BackgroundBorderType backgroundBorderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backgroundBorderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundFillType(BackgroundFillType backgroundFillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backgroundFillType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBottomEdgeType(BottomEdgeType bottomEdgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bottomEdgeType, diagnostics, context);
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
	public boolean validateBoundaryType1(BoundaryType1 boundaryType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundaryType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryType2(BoundaryType2 boundaryType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundaryType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingBoxPointPropertyType(BoundingBoxPointPropertyType boundingBoxPointPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingBoxPointPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingBoxPointType(BoundingBoxPointType boundingBoxPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingBoxPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterPointPropertyType(CenterPointPropertyType centerPointPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerPointPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCenterPointType(CenterPointType centerPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centerPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircularArcPropertyType(CircularArcPropertyType circularArcPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circularArcPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircularArcType(CircularArcType circularArcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circularArcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosePropertyType(ClosePropertyType closePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloseType(CloseType closeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorCMYKPropertyType(ColorCMYKPropertyType colorCMYKPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorCMYKPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorCMYKType(ColorCMYKType colorCMYKType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorCMYKType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorPropertyType(ColorPropertyType colorPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBPropertyType(ColorRGBPropertyType colorRGBPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorRGBPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorRGBType(ColorRGBType colorRGBType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorRGBType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType(ColorType colorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType1(ColorType1 colorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorType2(ColorType2 colorType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeGraphicPropertyType(CompositeGraphicPropertyType compositeGraphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeGraphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeGraphicType(CompositeGraphicType compositeGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundStrokePropertyType(CompoundStrokePropertyType compoundStrokePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundStrokePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundStrokeSectionPropertyType(CompoundStrokeSectionPropertyType compoundStrokeSectionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundStrokeSectionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundStrokeSectionType(CompoundStrokeSectionType compoundStrokeSectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundStrokeSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundStrokeType(CompoundStrokeType compoundStrokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundStrokeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentStepPropertyType(CurrentStepPropertyType currentStepPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentStepPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentStepType(CurrentStepType currentStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurvetoPropertyType(CurvetoPropertyType curvetoPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curvetoPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurvetoType(CurvetoType curvetoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curvetoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDashedStrokePropertyType(DashedStrokePropertyType dashedStrokePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dashedStrokePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDashedStrokeType(DashedStrokeType dashedStrokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dashedStrokeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignRulePropertyType(DesignRulePropertyType designRulePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designRulePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignRuleType(DesignRuleType designRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designRuleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignRuleType1(DesignRuleType1 designRuleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designRuleType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplacementPropertyType(DisplacementPropertyType displacementPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(displacementPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplacementType(DisplacementType displacementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(displacementType, diagnostics, context);
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
	public boolean validateElementPropertyType(ElementPropertyType elementPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementType(ElementType elementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementType1(ElementType1 elementType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElseType(ElseType elseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmitPropertyType(EmitPropertyType emitPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emitPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmitType(EmitType emitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmitType1(EmitType1 emitType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emitType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEveryPropertyType(EveryPropertyType everyPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(everyPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEveryType(EveryType everyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(everyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionPropertyType(ExpressionPropertyType expressionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionType(ExpressionType expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionType1(ExpressionType1 expressionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureTypeStepPropertyType(FeatureTypeStepPropertyType featureTypeStepPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureTypeStepPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureTypeStepType(FeatureTypeStepType featureTypeStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureTypeStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillPropertyType(FillPropertyType fillPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fillPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillType(FillType fillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fillType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilteredSymbolizerPropertyType(FilteredSymbolizerPropertyType filteredSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filteredSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilteredSymbolizerType(FilteredSymbolizerType filteredSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filteredSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterPropertyType(FilterPropertyType filterPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType(FilterType filterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType1(FilterType1 filterType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstStepPropertyType(FirstStepPropertyType firstStepPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstStepPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstStepType(FirstStepType firstStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstStepType1(FirstStepType1 firstStepType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstStepType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontPropertyType(FontPropertyType fontPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontType(FontType fontType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontType1(FontType1 fontType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForPropertyType(ForPropertyType forPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForType(ForType forType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGapPropertyType(GapPropertyType gapPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gapPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGapType(GapType gapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryType(GeometryType geometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryType1(GeometryType1 geometryType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryType2(GeometryType2 geometryType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicFillPropertyType(GraphicFillPropertyType graphicFillPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicFillPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicFillType(GraphicFillType graphicFillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicFillType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicPropertyType(GraphicPropertyType graphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicType(GraphicType graphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicType1(GraphicType1 graphicType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicType2(GraphicType2 graphicType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicType3(GraphicType3 graphicType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaloColorType(HaloColorType haloColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haloColorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaloPropertyType(HaloPropertyType haloPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haloPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaloType(HaloType haloType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haloType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaloType1(HaloType1 haloType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haloType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHaloType2(HaloType2 haloType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(haloType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchDefinitionLongestSidePropertyType(HatchDefinitionLongestSidePropertyType hatchDefinitionLongestSidePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchDefinitionLongestSidePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchDefinitionPropertyType(HatchDefinitionPropertyType hatchDefinitionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchDefinitionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchFillLongestSidePropertyType(HatchFillLongestSidePropertyType hatchFillLongestSidePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchFillLongestSidePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchFillLongestSideType(HatchFillLongestSideType hatchFillLongestSideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchFillLongestSideType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchFillPropertyType(HatchFillPropertyType hatchFillPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchFillPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchFillType(HatchFillType hatchFillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchFillType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchLinesLongestSidePropertyType(HatchLinesLongestSidePropertyType hatchLinesLongestSidePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchLinesLongestSidePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchLinesLongestSideType(HatchLinesLongestSideType hatchLinesLongestSideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchLinesLongestSideType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchLinesPropertyType(HatchLinesPropertyType hatchLinesPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchLinesPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchLinesType(HatchLinesType hatchLinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchLinesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfPropertyType(IfPropertyType ifPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfType(IfType ifType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteriorType(InteriorType interiorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interiorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteriorType1(InteriorType1 interiorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interiorType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInType(InType inType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInType1(InType1 inType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelPropertyType(LabelPropertyType labelPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelTextType(LabelTextType labelTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelTextType1(LabelTextType1 labelTextType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelTextType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType(LabelType labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType1(LabelType1 labelType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType2(LabelType2 labelType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType3(LabelType3 labelType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerPropertyType(LayerPropertyType layerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerType(LayerType layerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerType1(LayerType1 layerType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineGraphicPropertyType(LineGraphicPropertyType lineGraphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineGraphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineGraphicType(LineGraphicType lineGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineLabelPropertyType(LineLabelPropertyType lineLabelPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineLabelPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineLabelType(LineLabelType lineLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineLabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinePlacedGraphicPropertyType(LinePlacedGraphicPropertyType linePlacedGraphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linePlacedGraphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinePlacedGraphicType(LinePlacedGraphicType linePlacedGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linePlacedGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSymbolizerPropertyType(LineSymbolizerPropertyType lineSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSymbolizerType(LineSymbolizerType lineSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinetoPropertyType(LinetoPropertyType linetoPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linetoPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinetoType(LinetoType linetoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linetoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralPropertyType(LiteralPropertyType literalPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralType(LiteralType literalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumAdjacentLineStringPropertyType(MaximumAdjacentLineStringPropertyType maximumAdjacentLineStringPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maximumAdjacentLineStringPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumAdjacentLineStringType(MaximumAdjacentLineStringType maximumAdjacentLineStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maximumAdjacentLineStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumAdjacentSurfacePropertyType(MaximumAdjacentSurfacePropertyType maximumAdjacentSurfacePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maximumAdjacentSurfacePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumAdjacentSurfaceType(MaximumAdjacentSurfaceType maximumAdjacentSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maximumAdjacentSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureLiteralPropertyType(MeasureLiteralPropertyType measureLiteralPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureLiteralPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureLiteralType(MeasureLiteralType measureLiteralType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureLiteralType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberType(MemberType memberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovetoPropertyType(MovetoPropertyType movetoPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movetoPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovetoType(MovetoType movetoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movetoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeighborhoodFilterType(NeighborhoodFilterType neighborhoodFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(neighborhoodFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullColorPropertyType(NullColorPropertyType nullColorPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullColorPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullColorType(NullColorType nullColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullColorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullSymbolizerPropertyType(NullSymbolizerPropertyType nullSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullSymbolizerType(NullSymbolizerType nullSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandType(OperandType operandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationPropertyType(OperationPropertyType operationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathElementPropertyType(PathElementPropertyType pathElementPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathElementPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathElementType(PathElementType pathElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathPropertyType(PathPropertyType pathPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathType(PathType pathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerpendicularOffsetPropertyType(PerpendicularOffsetPropertyType perpendicularOffsetPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perpendicularOffsetPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerpendicularOffsetType(PerpendicularOffsetType perpendicularOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perpendicularOffsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementRulePropertyType(PlacementRulePropertyType placementRulePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementRulePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementRuleType(PlacementRuleType placementRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementRuleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementType(PlacementType placementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointLabelPropertyType(PointLabelPropertyType pointLabelPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointLabelPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointLabelType(PointLabelType pointLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointLabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointsInAreaDefinitionPropertyType(PointsInAreaDefinitionPropertyType pointsInAreaDefinitionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointsInAreaDefinitionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointsInAreaPropertyType(PointsInAreaPropertyType pointsInAreaPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointsInAreaPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointsInAreaType(PointsInAreaType pointsInAreaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointsInAreaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointsOnLinePropertyType(PointsOnLinePropertyType pointsOnLinePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointsOnLinePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointsOnLineType(PointsOnLineType pointsOnLineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointsOnLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointSymbolizerPropertyType(PointSymbolizerPropertyType pointSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointSymbolizerType(PointSymbolizerType pointSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostGraphicType(PostGraphicType postGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicateType(PredicateType predicateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predicateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicateType1(PredicateType1 predicateType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predicateType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreGraphicType(PreGraphicType preGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyPropertyType(PropertyPropertyType propertyPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePureSymbolizerPropertyType(PureSymbolizerPropertyType pureSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pureSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePureSymbolizerType(PureSymbolizerType pureSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pureSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePureSymbolizerType1(PureSymbolizerType1 pureSymbolizerType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pureSymbolizerType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantifierPropertyType(QuantifierPropertyType quantifierPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantifierPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantifierType(QuantifierType quantifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateFilterType(RelateFilterType relateFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relateFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateGeometryPropertyType(RelateGeometryPropertyType relateGeometryPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relateGeometryPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateGeometryType(RelateGeometryType relateGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relateGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateTopologyPropertyType(RelateTopologyPropertyType relateTopologyPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relateTopologyPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateTopologyType(RelateTopologyType relateTopologyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relateTopologyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnType(ReturnType returnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRulePropertyType(RulePropertyType rulePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rulePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleSetPropertyType(RuleSetPropertyType ruleSetPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleSetPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleSetType(RuleSetType ruleSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleSetType1(RuleSetType1 ruleSetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleSetType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRulesToConsiderType(RulesToConsiderType rulesToConsiderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rulesToConsiderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleType(RuleType ruleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleType1(RuleType1 ruleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSatisfiesType(SatisfiesType satisfiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(satisfiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionType(SectionType sectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfStepPropertyType(SelfStepPropertyType selfStepPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selfStepPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfStepType(SelfStepType selfStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selfStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShieldedPointLabelPropertyType(ShieldedPointLabelPropertyType shieldedPointLabelPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shieldedPointLabelPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShieldedPointLabelType(ShieldedPointLabelType shieldedPointLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shieldedPointLabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleGraphicPropertyType(SimpleGraphicPropertyType simpleGraphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleGraphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleGraphicType(SimpleGraphicType simpleGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkeletonLinePropertyType(SkeletonLinePropertyType skeletonLinePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skeletonLinePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkeletonLineType(SkeletonLineType skeletonLineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(skeletonLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlopeHatchLinesPropertyType(SlopeHatchLinesPropertyType slopeHatchLinesPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slopeHatchLinesPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlopeHatchLinesType(SlopeHatchLinesType slopeHatchLinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slopeHatchLinesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidFillPropertyType(SolidFillPropertyType solidFillPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidFillPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidFillType(SolidFillType solidFillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidFillType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidOrDashedStrokePropertyType(SolidOrDashedStrokePropertyType solidOrDashedStrokePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidOrDashedStrokePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidOrDashedStrokeType(SolidOrDashedStrokeType solidOrDashedStrokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidOrDashedStrokeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidSectionPropertyType(SolidSectionPropertyType solidSectionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidSectionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidSectionType(SolidSectionType solidSectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidStrokePropertyType(SolidStrokePropertyType solidStrokePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidStrokePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidStrokeType(SolidStrokeType solidStrokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidStrokeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSomePropertyType(SomePropertyType somePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(somePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSomeType(SomeType someType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(someType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepPropertyType(StepPropertyType stepPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepType(StepType stepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepType1(StepType1 stepType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokePropertyType(StrokePropertyType strokePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType(StrokeType strokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType1(StrokeType1 strokeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType2(StrokeType2 strokeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType3(StrokeType3 strokeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType4(StrokeType4 strokeType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType5(StrokeType5 strokeType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeType5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylePropertyType(StylePropertyType stylePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylePropertyType, diagnostics, context);
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
	public boolean validateStyleType1(StyleType1 styleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolizerPredicateType(SymbolizerPredicateType symbolizerPredicateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolizerPredicateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolizerPropertyType(SymbolizerPropertyType symbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolizerType(SymbolizerType symbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolizerType1(SymbolizerType1 symbolizerType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolizerType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolizerType2(SymbolizerType2 symbolizerType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolizerType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbologyCatalogPropertyType(SymbologyCatalogPropertyType symbologyCatalogPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbologyCatalogPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbologyCatalogType(SymbologyCatalogType symbologyCatalogType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbologyCatalogType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagPropertyType(TagPropertyType tagPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagSetPropertyType(TagSetPropertyType tagSetPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagSetPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagSetType(TagSetType tagSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagType(TagType tagType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagType1(TagType1 tagType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetColorType(TargetColorType targetColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetColorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextBodyFillType(TextBodyFillType textBodyFillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textBodyFillType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextGraphicPropertyType(TextGraphicPropertyType textGraphicPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textGraphicPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextGraphicType(TextGraphicType textGraphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textGraphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextSectionPropertyType(TextSectionPropertyType textSectionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textSectionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextSectionType(TextSectionType textSectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textSectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextSymbolizerPropertyType(TextSymbolizerPropertyType textSymbolizerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textSymbolizerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextSymbolizerType(TextSymbolizerType textSymbolizerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textSymbolizerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThenType(ThenType thenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopEdgeType(TopEdgeType topEdgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTubePropertyType(TubePropertyType tubePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tubePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTubeType(TubeType tubeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tubeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariablePropertyType(VariablePropertyType variablePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variablePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableStepPropertyType(VariableStepPropertyType variableStepPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableStepPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableStepType(VariableStepType variableStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType(VariableType variableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType1(VariableType1 variableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType2(VariableType2 variableType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType3(VariableType3 variableType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantGeometryPropertyType(VariantGeometryPropertyType variantGeometryPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantGeometryPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantGeometryType(VariantGeometryType variantGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variantGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorSpecificType(VendorSpecificType vendorSpecificType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorSpecificType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdjustmentType(AdjustmentType adjustmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicObjectTypeType(BasicObjectTypeType basicObjectTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryOverlapTreatmentType(BoundaryOverlapTreatmentType boundaryOverlapTreatmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType(DataTypeType dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStyleType(FontStyleType fontStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontWeightType(FontWeightType fontWeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryTypeType(GeometryTypeType geometryTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryUnionType(GeometryUnionType geometryUnionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalAlignmentType(HorizontalAlignmentType horizontalAlignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineCapsType(LineCapsType lineCapsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineJoinType(LineJoinType lineJoinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeighborSelModeType(NeighborSelModeType neighborSelModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationLogicType(PresentationLogicType presentationLogicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularityType(RegularityType regularityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateType(RelateType relateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeRotationType(RelativeRotationType relativeRotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextDecorationType(TextDecorationType textDecorationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasureType(UnitOfMeasureType unitOfMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalAlignmentType(VerticalAlignmentType verticalAlignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdjustmentTypeObject(AdjustmentType adjustmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicObjectTypeTypeObject(BasicObjectTypeType basicObjectTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryOverlapTreatmentTypeObject(BoundaryOverlapTreatmentType boundaryOverlapTreatmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDasharrayType(List<?> dasharrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDasharrayTypeBase_ItemType(dasharrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDasharrayType_MinLength(dasharrayType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Dasharray Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDasharrayType_MinLength(List<?> dasharrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = dasharrayType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(AAAPackage.eINSTANCE.getDasharrayType(), dasharrayType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDasharrayTypeBase(List<?> dasharrayTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDasharrayTypeBase_ItemType(dasharrayTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Dasharray Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDasharrayTypeBase_ItemType(List<?> dasharrayTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = dasharrayTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(item)) {
				result &= xmlTypeValidator.validateDouble((Double)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.DOUBLE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTypeObject(DataTypeType dataTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStyleTypeObject(FontStyleType fontStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontWeightTypeObject(FontWeightType fontWeightTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryTypeTypeObject(GeometryTypeType geometryTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryUnionTypeObject(GeometryUnionType geometryUnionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalAlignmentTypeObject(HorizontalAlignmentType horizontalAlignmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineCapsTypeObject(LineCapsType lineCapsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineJoinTypeObject(LineJoinType lineJoinTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeighborSelModeTypeObject(NeighborSelModeType neighborSelModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternType(List<?> patternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePatternTypeBase_ItemType(patternType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatternType_MinLength(patternType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Pattern Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternType_MinLength(List<?> patternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = patternType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(AAAPackage.eINSTANCE.getPatternType(), patternType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternTypeBase(List<?> patternTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePatternTypeBase_ItemType(patternTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Pattern Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternTypeBase_ItemType(List<?> patternTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = patternTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(item)) {
				result &= xmlTypeValidator.validateDouble((Double)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.DOUBLE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationLogicTypeObject(PresentationLogicType presentationLogicTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularityTypeObject(RegularityType regularityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelateTypeObject(RelateType relateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeRotationTypeObject(RelativeRotationType relativeRotationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextDecorationTypeObject(TextDecorationType textDecorationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasureTypeObject(UnitOfMeasureType unitOfMeasureTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalAlignmentTypeObject(VerticalAlignmentType verticalAlignmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //AAAValidator
