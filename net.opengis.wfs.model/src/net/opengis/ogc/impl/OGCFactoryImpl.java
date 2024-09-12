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
package net.opengis.ogc.impl;

import javax.xml.namespace.QName;

import net.opengis.ogc.*;

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
public class OGCFactoryImpl extends EFactoryImpl implements OGCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OGCFactory init() {
		try {
			OGCFactory theOGCFactory = (OGCFactory)EPackage.Registry.INSTANCE.getEFactory(OGCPackage.eNS_URI);
			if (theOGCFactory != null) {
				return theOGCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OGCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCFactoryImpl() {
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
			case OGCPackage.ARITHMETIC_OPERATORS_TYPE: return createArithmeticOperatorsType();
			case OGCPackage.BBOX_TYPE: return createBBOXType();
			case OGCPackage.BINARY_COMPARISON_OP_TYPE: return createBinaryComparisonOpType();
			case OGCPackage.BINARY_LOGIC_OP_TYPE: return createBinaryLogicOpType();
			case OGCPackage.BINARY_OPERATOR_TYPE: return createBinaryOperatorType();
			case OGCPackage.BINARY_SPATIAL_OP_TYPE: return createBinarySpatialOpType();
			case OGCPackage.COMPARISON_OPERATORS_TYPE: return createComparisonOperatorsType();
			case OGCPackage.DISTANCE_BUFFER_TYPE: return createDistanceBufferType();
			case OGCPackage.DISTANCE_TYPE: return createDistanceType();
			case OGCPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OGCPackage.EID_TYPE: return createEIDType();
			case OGCPackage.FEATURE_ID_TYPE: return createFeatureIdType();
			case OGCPackage.FID_TYPE: return createFIDType();
			case OGCPackage.FILTER_CAPABILITIES_TYPE: return createFilterCapabilitiesType();
			case OGCPackage.FILTER_TYPE: return createFilterType();
			case OGCPackage.FUNCTION_NAMES_TYPE: return createFunctionNamesType();
			case OGCPackage.FUNCTION_NAME_TYPE: return createFunctionNameType();
			case OGCPackage.FUNCTIONS_TYPE: return createFunctionsType();
			case OGCPackage.FUNCTION_TYPE: return createFunctionType();
			case OGCPackage.GEOMETRY_OPERANDS_TYPE: return createGeometryOperandsType();
			case OGCPackage.GML_OBJECT_ID_TYPE: return createGmlObjectIdType();
			case OGCPackage.ID_CAPABILITIES_TYPE: return createIdCapabilitiesType();
			case OGCPackage.LITERAL_TYPE: return createLiteralType();
			case OGCPackage.LOGICAL_OPERATORS_TYPE: return createLogicalOperatorsType();
			case OGCPackage.LOWER_BOUNDARY_TYPE: return createLowerBoundaryType();
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE: return createPropertyIsBetweenType();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE: return createPropertyIsLikeType();
			case OGCPackage.PROPERTY_IS_NULL_TYPE: return createPropertyIsNullType();
			case OGCPackage.PROPERTY_NAME_TYPE: return createPropertyNameType();
			case OGCPackage.SCALAR_CAPABILITIES_TYPE: return createScalarCapabilitiesType();
			case OGCPackage.SIMPLE_ARITHMETIC_TYPE: return createSimpleArithmeticType();
			case OGCPackage.SORT_BY_TYPE: return createSortByType();
			case OGCPackage.SORT_PROPERTY_TYPE: return createSortPropertyType();
			case OGCPackage.SPATIAL_CAPABILITIES_TYPE: return createSpatialCapabilitiesType();
			case OGCPackage.SPATIAL_OPERATORS_TYPE: return createSpatialOperatorsType();
			case OGCPackage.SPATIAL_OPERATOR_TYPE: return createSpatialOperatorType();
			case OGCPackage.UNARY_LOGIC_OP_TYPE: return createUnaryLogicOpType();
			case OGCPackage.UPPER_BOUNDARY_TYPE: return createUpperBoundaryType();
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
			case OGCPackage.COMPARISON_OPERATOR_TYPE:
				return createComparisonOperatorTypeFromString(eDataType, initialValue);
			case OGCPackage.SORT_ORDER_TYPE:
				return createSortOrderTypeFromString(eDataType, initialValue);
			case OGCPackage.SPATIAL_OPERATOR_NAME_TYPE:
				return createSpatialOperatorNameTypeFromString(eDataType, initialValue);
			case OGCPackage.COMPARISON_OPERATOR_TYPE_OBJECT:
				return createComparisonOperatorTypeObjectFromString(eDataType, initialValue);
			case OGCPackage.GEOMETRY_OPERAND_TYPE:
				return createGeometryOperandTypeFromString(eDataType, initialValue);
			case OGCPackage.SORT_ORDER_TYPE_OBJECT:
				return createSortOrderTypeObjectFromString(eDataType, initialValue);
			case OGCPackage.SPATIAL_OPERATOR_NAME_TYPE_OBJECT:
				return createSpatialOperatorNameTypeObjectFromString(eDataType, initialValue);
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
			case OGCPackage.COMPARISON_OPERATOR_TYPE:
				return convertComparisonOperatorTypeToString(eDataType, instanceValue);
			case OGCPackage.SORT_ORDER_TYPE:
				return convertSortOrderTypeToString(eDataType, instanceValue);
			case OGCPackage.SPATIAL_OPERATOR_NAME_TYPE:
				return convertSpatialOperatorNameTypeToString(eDataType, instanceValue);
			case OGCPackage.COMPARISON_OPERATOR_TYPE_OBJECT:
				return convertComparisonOperatorTypeObjectToString(eDataType, instanceValue);
			case OGCPackage.GEOMETRY_OPERAND_TYPE:
				return convertGeometryOperandTypeToString(eDataType, instanceValue);
			case OGCPackage.SORT_ORDER_TYPE_OBJECT:
				return convertSortOrderTypeObjectToString(eDataType, instanceValue);
			case OGCPackage.SPATIAL_OPERATOR_NAME_TYPE_OBJECT:
				return convertSpatialOperatorNameTypeObjectToString(eDataType, instanceValue);
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
	public ArithmeticOperatorsType createArithmeticOperatorsType() {
		ArithmeticOperatorsTypeImpl arithmeticOperatorsType = new ArithmeticOperatorsTypeImpl();
		return arithmeticOperatorsType;
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
	public BinaryOperatorType createBinaryOperatorType() {
		BinaryOperatorTypeImpl binaryOperatorType = new BinaryOperatorTypeImpl();
		return binaryOperatorType;
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
	public DistanceType createDistanceType() {
		DistanceTypeImpl distanceType = new DistanceTypeImpl();
		return distanceType;
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
	public EIDType createEIDType() {
		EIDTypeImpl eidType = new EIDTypeImpl();
		return eidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureIdType createFeatureIdType() {
		FeatureIdTypeImpl featureIdType = new FeatureIdTypeImpl();
		return featureIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FIDType createFIDType() {
		FIDTypeImpl fidType = new FIDTypeImpl();
		return fidType;
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
	public FunctionNamesType createFunctionNamesType() {
		FunctionNamesTypeImpl functionNamesType = new FunctionNamesTypeImpl();
		return functionNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionNameType createFunctionNameType() {
		FunctionNameTypeImpl functionNameType = new FunctionNameTypeImpl();
		return functionNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionsType createFunctionsType() {
		FunctionsTypeImpl functionsType = new FunctionsTypeImpl();
		return functionsType;
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
	public GmlObjectIdType createGmlObjectIdType() {
		GmlObjectIdTypeImpl gmlObjectIdType = new GmlObjectIdTypeImpl();
		return gmlObjectIdType;
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
	public PropertyNameType createPropertyNameType() {
		PropertyNameTypeImpl propertyNameType = new PropertyNameTypeImpl();
		return propertyNameType;
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
	public SimpleArithmeticType createSimpleArithmeticType() {
		SimpleArithmeticTypeImpl simpleArithmeticType = new SimpleArithmeticTypeImpl();
		return simpleArithmeticType;
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
	public ComparisonOperatorType createComparisonOperatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonOperatorType result = ComparisonOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorTypeToString(EDataType eDataType, Object instanceValue) {
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
	public SpatialOperatorNameType createSpatialOperatorNameTypeFromString(EDataType eDataType, String initialValue) {
		SpatialOperatorNameType result = SpatialOperatorNameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialOperatorNameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType createComparisonOperatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createComparisonOperatorTypeFromString(OGCPackage.Literals.COMPARISON_OPERATOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComparisonOperatorTypeToString(OGCPackage.Literals.COMPARISON_OPERATOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createGeometryOperandTypeFromString(EDataType eDataType, String initialValue) {
		return (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeometryOperandTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortOrderType createSortOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSortOrderTypeFromString(OGCPackage.Literals.SORT_ORDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortOrderTypeToString(OGCPackage.Literals.SORT_ORDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialOperatorNameType createSpatialOperatorNameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpatialOperatorNameTypeFromString(OGCPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialOperatorNameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpatialOperatorNameTypeToString(OGCPackage.Literals.SPATIAL_OPERATOR_NAME_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCPackage getOGCPackage() {
		return (OGCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OGCPackage getPackage() {
		return OGCPackage.eINSTANCE;
	}

} //OGCFactoryImpl
