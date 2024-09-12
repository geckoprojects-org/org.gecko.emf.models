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
package net.opengis.fes.impl;

import java.util.ArrayList;
import java.util.List;

import net.opengis.fes.*;

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
public class FESFactoryImpl extends EFactoryImpl implements FESFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FESFactory init() {
		try {
			FESFactory theFESFactory = (FESFactory)EPackage.Registry.INSTANCE.getEFactory(FESPackage.eNS_URI);
			if (theFESFactory != null) {
				return theFESFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FESFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FESFactoryImpl() {
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
			case FESPackage.ADDITIONAL_OPERATORS_TYPE: return createAdditionalOperatorsType();
			case FESPackage.ARGUMENTS_TYPE: return createArgumentsType();
			case FESPackage.ARGUMENT_TYPE: return createArgumentType();
			case FESPackage.AVAILABLE_FUNCTIONS_TYPE: return createAvailableFunctionsType();
			case FESPackage.AVAILABLE_FUNCTION_TYPE: return createAvailableFunctionType();
			case FESPackage.BBOX_TYPE: return createBBOXType();
			case FESPackage.BINARY_COMPARISON_OP_TYPE: return createBinaryComparisonOpType();
			case FESPackage.BINARY_LOGIC_OP_TYPE: return createBinaryLogicOpType();
			case FESPackage.BINARY_SPATIAL_OP_TYPE: return createBinarySpatialOpType();
			case FESPackage.BINARY_TEMPORAL_OP_TYPE: return createBinaryTemporalOpType();
			case FESPackage.COMPARISON_OPERATORS_TYPE: return createComparisonOperatorsType();
			case FESPackage.COMPARISON_OPERATOR_TYPE: return createComparisonOperatorType();
			case FESPackage.CONFORMANCE_TYPE: return createConformanceType();
			case FESPackage.DISTANCE_BUFFER_TYPE: return createDistanceBufferType();
			case FESPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FESPackage.EXTENDED_CAPABILITIES_TYPE: return createExtendedCapabilitiesType();
			case FESPackage.EXTENSION_OPERATOR_TYPE: return createExtensionOperatorType();
			case FESPackage.FILTER_CAPABILITIES_TYPE: return createFilterCapabilitiesType();
			case FESPackage.FILTER_TYPE: return createFilterType();
			case FESPackage.FUNCTION_TYPE: return createFunctionType();
			case FESPackage.GEOMETRY_OPERANDS_TYPE: return createGeometryOperandsType();
			case FESPackage.GEOMETRY_OPERAND_TYPE: return createGeometryOperandType();
			case FESPackage.ID_CAPABILITIES_TYPE: return createIdCapabilitiesType();
			case FESPackage.LITERAL_TYPE: return createLiteralType();
			case FESPackage.LOGICAL_OPERATORS_TYPE: return createLogicalOperatorsType();
			case FESPackage.LOWER_BOUNDARY_TYPE: return createLowerBoundaryType();
			case FESPackage.MEASURE_TYPE: return createMeasureType();
			case FESPackage.PROPERTY_IS_BETWEEN_TYPE: return createPropertyIsBetweenType();
			case FESPackage.PROPERTY_IS_LIKE_TYPE: return createPropertyIsLikeType();
			case FESPackage.PROPERTY_IS_NIL_TYPE: return createPropertyIsNilType();
			case FESPackage.PROPERTY_IS_NULL_TYPE: return createPropertyIsNullType();
			case FESPackage.RESOURCE_IDENTIFIER_TYPE: return createResourceIdentifierType();
			case FESPackage.RESOURCE_ID_TYPE: return createResourceIdType();
			case FESPackage.SCALAR_CAPABILITIES_TYPE: return createScalarCapabilitiesType();
			case FESPackage.SORT_BY_TYPE: return createSortByType();
			case FESPackage.SORT_PROPERTY_TYPE: return createSortPropertyType();
			case FESPackage.SPATIAL_CAPABILITIES_TYPE: return createSpatialCapabilitiesType();
			case FESPackage.SPATIAL_OPERATORS_TYPE: return createSpatialOperatorsType();
			case FESPackage.SPATIAL_OPERATOR_TYPE: return createSpatialOperatorType();
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE: return createTemporalCapabilitiesType();
			case FESPackage.TEMPORAL_OPERANDS_TYPE: return createTemporalOperandsType();
			case FESPackage.TEMPORAL_OPERAND_TYPE: return createTemporalOperandType();
			case FESPackage.TEMPORAL_OPERATORS_TYPE: return createTemporalOperatorsType();
			case FESPackage.TEMPORAL_OPERATOR_TYPE: return createTemporalOperatorType();
			case FESPackage.UNARY_LOGIC_OP_TYPE: return createUnaryLogicOpType();
			case FESPackage.UPPER_BOUNDARY_TYPE: return createUpperBoundaryType();
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
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0:
				return createComparisonOperatorNameTypeMember0FromString(eDataType, initialValue);
			case FESPackage.MATCH_ACTION_TYPE:
				return createMatchActionTypeFromString(eDataType, initialValue);
			case FESPackage.SORT_ORDER_TYPE:
				return createSortOrderTypeFromString(eDataType, initialValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0:
				return createSpatialOperatorNameTypeMember0FromString(eDataType, initialValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0:
				return createTemporalOperatorNameTypeMember0FromString(eDataType, initialValue);
			case FESPackage.VERSION_ACTION_TOKENS:
				return createVersionActionTokensFromString(eDataType, initialValue);
			case FESPackage.ALIASES_TYPE:
				return createAliasesTypeFromString(eDataType, initialValue);
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE:
				return createComparisonOperatorNameTypeFromString(eDataType, initialValue);
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0_OBJECT:
				return createComparisonOperatorNameTypeMember0ObjectFromString(eDataType, initialValue);
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE_MEMBER1:
				return createComparisonOperatorNameTypeMember1FromString(eDataType, initialValue);
			case FESPackage.MATCH_ACTION_TYPE_OBJECT:
				return createMatchActionTypeObjectFromString(eDataType, initialValue);
			case FESPackage.SCHEMA_ELEMENT:
				return createSchemaElementFromString(eDataType, initialValue);
			case FESPackage.SORT_ORDER_TYPE_OBJECT:
				return createSortOrderTypeObjectFromString(eDataType, initialValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE:
				return createSpatialOperatorNameTypeFromString(eDataType, initialValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0_OBJECT:
				return createSpatialOperatorNameTypeMember0ObjectFromString(eDataType, initialValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE_MEMBER1:
				return createSpatialOperatorNameTypeMember1FromString(eDataType, initialValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE:
				return createTemporalOperatorNameTypeFromString(eDataType, initialValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0_OBJECT:
				return createTemporalOperatorNameTypeMember0ObjectFromString(eDataType, initialValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER1:
				return createTemporalOperatorNameTypeMember1FromString(eDataType, initialValue);
			case FESPackage.TYPE_NAMES_LIST_TYPE:
				return createTypeNamesListTypeFromString(eDataType, initialValue);
			case FESPackage.TYPE_NAMES_TYPE:
				return createTypeNamesTypeFromString(eDataType, initialValue);
			case FESPackage.UOM_IDENTIFIER:
				return createUomIdentifierFromString(eDataType, initialValue);
			case FESPackage.UOM_SYMBOL:
				return createUomSymbolFromString(eDataType, initialValue);
			case FESPackage.UOM_URI:
				return createUomURIFromString(eDataType, initialValue);
			case FESPackage.VERSION_ACTION_TOKENS_OBJECT:
				return createVersionActionTokensObjectFromString(eDataType, initialValue);
			case FESPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
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
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0:
				return convertComparisonOperatorNameTypeMember0ToString(eDataType, instanceValue);
			case FESPackage.MATCH_ACTION_TYPE:
				return convertMatchActionTypeToString(eDataType, instanceValue);
			case FESPackage.SORT_ORDER_TYPE:
				return convertSortOrderTypeToString(eDataType, instanceValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0:
				return convertSpatialOperatorNameTypeMember0ToString(eDataType, instanceValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0:
				return convertTemporalOperatorNameTypeMember0ToString(eDataType, instanceValue);
			case FESPackage.VERSION_ACTION_TOKENS:
				return convertVersionActionTokensToString(eDataType, instanceValue);
			case FESPackage.ALIASES_TYPE:
				return convertAliasesTypeToString(eDataType, instanceValue);
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE:
				return convertComparisonOperatorNameTypeToString(eDataType, instanceValue);
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0_OBJECT:
				return convertComparisonOperatorNameTypeMember0ObjectToString(eDataType, instanceValue);
			case FESPackage.COMPARISON_OPERATOR_NAME_TYPE_MEMBER1:
				return convertComparisonOperatorNameTypeMember1ToString(eDataType, instanceValue);
			case FESPackage.MATCH_ACTION_TYPE_OBJECT:
				return convertMatchActionTypeObjectToString(eDataType, instanceValue);
			case FESPackage.SCHEMA_ELEMENT:
				return convertSchemaElementToString(eDataType, instanceValue);
			case FESPackage.SORT_ORDER_TYPE_OBJECT:
				return convertSortOrderTypeObjectToString(eDataType, instanceValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE:
				return convertSpatialOperatorNameTypeToString(eDataType, instanceValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0_OBJECT:
				return convertSpatialOperatorNameTypeMember0ObjectToString(eDataType, instanceValue);
			case FESPackage.SPATIAL_OPERATOR_NAME_TYPE_MEMBER1:
				return convertSpatialOperatorNameTypeMember1ToString(eDataType, instanceValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE:
				return convertTemporalOperatorNameTypeToString(eDataType, instanceValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0_OBJECT:
				return convertTemporalOperatorNameTypeMember0ObjectToString(eDataType, instanceValue);
			case FESPackage.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER1:
				return convertTemporalOperatorNameTypeMember1ToString(eDataType, instanceValue);
			case FESPackage.TYPE_NAMES_LIST_TYPE:
				return convertTypeNamesListTypeToString(eDataType, instanceValue);
			case FESPackage.TYPE_NAMES_TYPE:
				return convertTypeNamesTypeToString(eDataType, instanceValue);
			case FESPackage.UOM_IDENTIFIER:
				return convertUomIdentifierToString(eDataType, instanceValue);
			case FESPackage.UOM_SYMBOL:
				return convertUomSymbolToString(eDataType, instanceValue);
			case FESPackage.UOM_URI:
				return convertUomURIToString(eDataType, instanceValue);
			case FESPackage.VERSION_ACTION_TOKENS_OBJECT:
				return convertVersionActionTokensObjectToString(eDataType, instanceValue);
			case FESPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
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
	public AdditionalOperatorsType createAdditionalOperatorsType() {
		AdditionalOperatorsTypeImpl additionalOperatorsType = new AdditionalOperatorsTypeImpl();
		return additionalOperatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentsType createArgumentsType() {
		ArgumentsTypeImpl argumentsType = new ArgumentsTypeImpl();
		return argumentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArgumentType createArgumentType() {
		ArgumentTypeImpl argumentType = new ArgumentTypeImpl();
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvailableFunctionsType createAvailableFunctionsType() {
		AvailableFunctionsTypeImpl availableFunctionsType = new AvailableFunctionsTypeImpl();
		return availableFunctionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvailableFunctionType createAvailableFunctionType() {
		AvailableFunctionTypeImpl availableFunctionType = new AvailableFunctionTypeImpl();
		return availableFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BBOXType createBBOXType() {
		BBOXTypeImpl bboxType = new BBOXTypeImpl();
		return bboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryComparisonOpType createBinaryComparisonOpType() {
		BinaryComparisonOpTypeImpl binaryComparisonOpType = new BinaryComparisonOpTypeImpl();
		return binaryComparisonOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicOpType createBinaryLogicOpType() {
		BinaryLogicOpTypeImpl binaryLogicOpType = new BinaryLogicOpTypeImpl();
		return binaryLogicOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinarySpatialOpType createBinarySpatialOpType() {
		BinarySpatialOpTypeImpl binarySpatialOpType = new BinarySpatialOpTypeImpl();
		return binarySpatialOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryTemporalOpType createBinaryTemporalOpType() {
		BinaryTemporalOpTypeImpl binaryTemporalOpType = new BinaryTemporalOpTypeImpl();
		return binaryTemporalOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperatorsType createComparisonOperatorsType() {
		ComparisonOperatorsTypeImpl comparisonOperatorsType = new ComparisonOperatorsTypeImpl();
		return comparisonOperatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperatorType createComparisonOperatorType() {
		ComparisonOperatorTypeImpl comparisonOperatorType = new ComparisonOperatorTypeImpl();
		return comparisonOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformanceType createConformanceType() {
		ConformanceTypeImpl conformanceType = new ConformanceTypeImpl();
		return conformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceBufferType createDistanceBufferType() {
		DistanceBufferTypeImpl distanceBufferType = new DistanceBufferTypeImpl();
		return distanceBufferType;
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
	public ExtendedCapabilitiesType createExtendedCapabilitiesType() {
		ExtendedCapabilitiesTypeImpl extendedCapabilitiesType = new ExtendedCapabilitiesTypeImpl();
		return extendedCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionOperatorType createExtensionOperatorType() {
		ExtensionOperatorTypeImpl extensionOperatorType = new ExtensionOperatorTypeImpl();
		return extensionOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterCapabilitiesType createFilterCapabilitiesType() {
		FilterCapabilitiesTypeImpl filterCapabilitiesType = new FilterCapabilitiesTypeImpl();
		return filterCapabilitiesType;
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
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryOperandsType createGeometryOperandsType() {
		GeometryOperandsTypeImpl geometryOperandsType = new GeometryOperandsTypeImpl();
		return geometryOperandsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryOperandType createGeometryOperandType() {
		GeometryOperandTypeImpl geometryOperandType = new GeometryOperandTypeImpl();
		return geometryOperandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdCapabilitiesType createIdCapabilitiesType() {
		IdCapabilitiesTypeImpl idCapabilitiesType = new IdCapabilitiesTypeImpl();
		return idCapabilitiesType;
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
	public LogicalOperatorsType createLogicalOperatorsType() {
		LogicalOperatorsTypeImpl logicalOperatorsType = new LogicalOperatorsTypeImpl();
		return logicalOperatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowerBoundaryType createLowerBoundaryType() {
		LowerBoundaryTypeImpl lowerBoundaryType = new LowerBoundaryTypeImpl();
		return lowerBoundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsBetweenType createPropertyIsBetweenType() {
		PropertyIsBetweenTypeImpl propertyIsBetweenType = new PropertyIsBetweenTypeImpl();
		return propertyIsBetweenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsLikeType createPropertyIsLikeType() {
		PropertyIsLikeTypeImpl propertyIsLikeType = new PropertyIsLikeTypeImpl();
		return propertyIsLikeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsNilType createPropertyIsNilType() {
		PropertyIsNilTypeImpl propertyIsNilType = new PropertyIsNilTypeImpl();
		return propertyIsNilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyIsNullType createPropertyIsNullType() {
		PropertyIsNullTypeImpl propertyIsNullType = new PropertyIsNullTypeImpl();
		return propertyIsNullType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceIdentifierType createResourceIdentifierType() {
		ResourceIdentifierTypeImpl resourceIdentifierType = new ResourceIdentifierTypeImpl();
		return resourceIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceIdType createResourceIdType() {
		ResourceIdTypeImpl resourceIdType = new ResourceIdTypeImpl();
		return resourceIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarCapabilitiesType createScalarCapabilitiesType() {
		ScalarCapabilitiesTypeImpl scalarCapabilitiesType = new ScalarCapabilitiesTypeImpl();
		return scalarCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortByType createSortByType() {
		SortByTypeImpl sortByType = new SortByTypeImpl();
		return sortByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortPropertyType createSortPropertyType() {
		SortPropertyTypeImpl sortPropertyType = new SortPropertyTypeImpl();
		return sortPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialCapabilitiesType createSpatialCapabilitiesType() {
		SpatialCapabilitiesTypeImpl spatialCapabilitiesType = new SpatialCapabilitiesTypeImpl();
		return spatialCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialOperatorsType createSpatialOperatorsType() {
		SpatialOperatorsTypeImpl spatialOperatorsType = new SpatialOperatorsTypeImpl();
		return spatialOperatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialOperatorType createSpatialOperatorType() {
		SpatialOperatorTypeImpl spatialOperatorType = new SpatialOperatorTypeImpl();
		return spatialOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCapabilitiesType createTemporalCapabilitiesType() {
		TemporalCapabilitiesTypeImpl temporalCapabilitiesType = new TemporalCapabilitiesTypeImpl();
		return temporalCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperandsType createTemporalOperandsType() {
		TemporalOperandsTypeImpl temporalOperandsType = new TemporalOperandsTypeImpl();
		return temporalOperandsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperandType createTemporalOperandType() {
		TemporalOperandTypeImpl temporalOperandType = new TemporalOperandTypeImpl();
		return temporalOperandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperatorsType createTemporalOperatorsType() {
		TemporalOperatorsTypeImpl temporalOperatorsType = new TemporalOperatorsTypeImpl();
		return temporalOperatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperatorType createTemporalOperatorType() {
		TemporalOperatorTypeImpl temporalOperatorType = new TemporalOperatorTypeImpl();
		return temporalOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryLogicOpType createUnaryLogicOpType() {
		UnaryLogicOpTypeImpl unaryLogicOpType = new UnaryLogicOpTypeImpl();
		return unaryLogicOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperBoundaryType createUpperBoundaryType() {
		UpperBoundaryTypeImpl upperBoundaryType = new UpperBoundaryTypeImpl();
		return upperBoundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorNameTypeMember0 createComparisonOperatorNameTypeMember0FromString(EDataType eDataType, String initialValue) {
		ComparisonOperatorNameTypeMember0 result = ComparisonOperatorNameTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorNameTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchActionType createMatchActionTypeFromString(EDataType eDataType, String initialValue) {
		MatchActionType result = MatchActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrderType createSortOrderTypeFromString(EDataType eDataType, String initialValue) {
		SortOrderType result = SortOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialOperatorNameTypeMember0 createSpatialOperatorNameTypeMember0FromString(EDataType eDataType, String initialValue) {
		SpatialOperatorNameTypeMember0 result = SpatialOperatorNameTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialOperatorNameTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperatorNameTypeMember0 createTemporalOperatorNameTypeMember0FromString(EDataType eDataType, String initialValue) {
		TemporalOperatorNameTypeMember0 result = TemporalOperatorNameTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalOperatorNameTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionActionTokens createVersionActionTokensFromString(EDataType eDataType, String initialValue) {
		VersionActionTokens result = VersionActionTokens.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionActionTokensToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createAliasesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAliasesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createComparisonOperatorNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createComparisonOperatorNameTypeMember0FromString(FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createComparisonOperatorNameTypeMember1FromString(FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER1, initialValue);
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
	public String convertComparisonOperatorNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertComparisonOperatorNameTypeMember0ToString(FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertComparisonOperatorNameTypeMember1ToString(FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER1, instanceValue);
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
	public ComparisonOperatorNameTypeMember0 createComparisonOperatorNameTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createComparisonOperatorNameTypeMember0FromString(FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorNameTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComparisonOperatorNameTypeMember0ToString(FESPackage.Literals.COMPARISON_OPERATOR_NAME_TYPE_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createComparisonOperatorNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchActionType createMatchActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMatchActionTypeFromString(FESPackage.Literals.MATCH_ACTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMatchActionTypeToString(FESPackage.Literals.MATCH_ACTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSchemaElementFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemaElementToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrderType createSortOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSortOrderTypeFromString(FESPackage.Literals.SORT_ORDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortOrderTypeToString(FESPackage.Literals.SORT_ORDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSpatialOperatorNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createSpatialOperatorNameTypeMember0FromString(FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createSpatialOperatorNameTypeMember1FromString(FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER1, initialValue);
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
	public String convertSpatialOperatorNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertSpatialOperatorNameTypeMember0ToString(FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertSpatialOperatorNameTypeMember1ToString(FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER1, instanceValue);
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
	public SpatialOperatorNameTypeMember0 createSpatialOperatorNameTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createSpatialOperatorNameTypeMember0FromString(FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialOperatorNameTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpatialOperatorNameTypeMember0ToString(FESPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSpatialOperatorNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialOperatorNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTemporalOperatorNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTemporalOperatorNameTypeMember0FromString(FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTemporalOperatorNameTypeMember1FromString(FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER1, initialValue);
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
	public String convertTemporalOperatorNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertTemporalOperatorNameTypeMember0ToString(FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertTemporalOperatorNameTypeMember1ToString(FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER1, instanceValue);
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
	public TemporalOperatorNameTypeMember0 createTemporalOperatorNameTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createTemporalOperatorNameTypeMember0FromString(FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalOperatorNameTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTemporalOperatorNameTypeMember0ToString(FESPackage.Literals.TEMPORAL_OPERATOR_NAME_TYPE_MEMBER0, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTemporalOperatorNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalOperatorNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createTypeNamesListTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createTypeNamesTypeFromString(FESPackage.Literals.TYPE_NAMES_TYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNamesListTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTypeNamesTypeToString(FESPackage.Literals.TYPE_NAMES_TYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTypeNamesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createSchemaElementFromString(FESPackage.Literals.SCHEMA_ELEMENT, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
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
	public String convertTypeNamesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FESPackage.Literals.SCHEMA_ELEMENT.isInstance(instanceValue)) {
			try {
				String value = convertSchemaElementToString(FESPackage.Literals.SCHEMA_ELEMENT, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
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
	public String createUomIdentifierFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createUomSymbolFromString(FESPackage.Literals.UOM_SYMBOL, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUomURIFromString(FESPackage.Literals.UOM_URI, initialValue);
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
	public String convertUomIdentifierToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FESPackage.Literals.UOM_SYMBOL.isInstance(instanceValue)) {
			try {
				String value = convertUomSymbolToString(FESPackage.Literals.UOM_SYMBOL, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FESPackage.Literals.UOM_URI.isInstance(instanceValue)) {
			try {
				String value = convertUomURIToString(FESPackage.Literals.UOM_URI, instanceValue);
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
	public String createUomSymbolFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUomSymbolToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUomURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUomURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionActionTokens createVersionActionTokensObjectFromString(EDataType eDataType, String initialValue) {
		return createVersionActionTokensFromString(FESPackage.Literals.VERSION_ACTION_TOKENS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionActionTokensObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersionActionTokensToString(FESPackage.Literals.VERSION_ACTION_TOKENS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVersionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createVersionActionTokensFromString(FESPackage.Literals.VERSION_ACTION_TOKENS, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
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
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FESPackage.Literals.VERSION_ACTION_TOKENS.isInstance(instanceValue)) {
			try {
				String value = convertVersionActionTokensToString(FESPackage.Literals.VERSION_ACTION_TOKENS, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
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
	@Override
	public FESPackage getFESPackage() {
		return (FESPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FESPackage getPackage() {
		return FESPackage.eINSTANCE;
	}

} //FESFactoryImpl
