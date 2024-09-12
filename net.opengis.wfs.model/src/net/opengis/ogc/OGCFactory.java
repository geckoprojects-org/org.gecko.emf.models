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
package net.opengis.ogc;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.OGCPackage
 * @generated
 */
@ProviderType
public interface OGCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OGCFactory eINSTANCE = net.opengis.ogc.impl.OGCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arithmetic Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Operators Type</em>'.
	 * @generated
	 */
	ArithmeticOperatorsType createArithmeticOperatorsType();

	/**
	 * Returns a new object of class '<em>BBOX Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BBOX Type</em>'.
	 * @generated
	 */
	BBOXType createBBOXType();

	/**
	 * Returns a new object of class '<em>Binary Comparison Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Comparison Op Type</em>'.
	 * @generated
	 */
	BinaryComparisonOpType createBinaryComparisonOpType();

	/**
	 * Returns a new object of class '<em>Binary Logic Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Logic Op Type</em>'.
	 * @generated
	 */
	BinaryLogicOpType createBinaryLogicOpType();

	/**
	 * Returns a new object of class '<em>Binary Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operator Type</em>'.
	 * @generated
	 */
	BinaryOperatorType createBinaryOperatorType();

	/**
	 * Returns a new object of class '<em>Binary Spatial Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Spatial Op Type</em>'.
	 * @generated
	 */
	BinarySpatialOpType createBinarySpatialOpType();

	/**
	 * Returns a new object of class '<em>Comparison Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Operators Type</em>'.
	 * @generated
	 */
	ComparisonOperatorsType createComparisonOperatorsType();

	/**
	 * Returns a new object of class '<em>Distance Buffer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Buffer Type</em>'.
	 * @generated
	 */
	DistanceBufferType createDistanceBufferType();

	/**
	 * Returns a new object of class '<em>Distance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Type</em>'.
	 * @generated
	 */
	DistanceType createDistanceType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>EID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EID Type</em>'.
	 * @generated
	 */
	EIDType createEIDType();

	/**
	 * Returns a new object of class '<em>Feature Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Id Type</em>'.
	 * @generated
	 */
	FeatureIdType createFeatureIdType();

	/**
	 * Returns a new object of class '<em>FID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FID Type</em>'.
	 * @generated
	 */
	FIDType createFIDType();

	/**
	 * Returns a new object of class '<em>Filter Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Capabilities Type</em>'.
	 * @generated
	 */
	FilterCapabilitiesType createFilterCapabilitiesType();

	/**
	 * Returns a new object of class '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Type</em>'.
	 * @generated
	 */
	FilterType createFilterType();

	/**
	 * Returns a new object of class '<em>Function Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Names Type</em>'.
	 * @generated
	 */
	FunctionNamesType createFunctionNamesType();

	/**
	 * Returns a new object of class '<em>Function Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Name Type</em>'.
	 * @generated
	 */
	FunctionNameType createFunctionNameType();

	/**
	 * Returns a new object of class '<em>Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functions Type</em>'.
	 * @generated
	 */
	FunctionsType createFunctionsType();

	/**
	 * Returns a new object of class '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Type</em>'.
	 * @generated
	 */
	FunctionType createFunctionType();

	/**
	 * Returns a new object of class '<em>Geometry Operands Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry Operands Type</em>'.
	 * @generated
	 */
	GeometryOperandsType createGeometryOperandsType();

	/**
	 * Returns a new object of class '<em>Gml Object Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gml Object Id Type</em>'.
	 * @generated
	 */
	GmlObjectIdType createGmlObjectIdType();

	/**
	 * Returns a new object of class '<em>Id Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Capabilities Type</em>'.
	 * @generated
	 */
	IdCapabilitiesType createIdCapabilitiesType();

	/**
	 * Returns a new object of class '<em>Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Type</em>'.
	 * @generated
	 */
	LiteralType createLiteralType();

	/**
	 * Returns a new object of class '<em>Logical Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Operators Type</em>'.
	 * @generated
	 */
	LogicalOperatorsType createLogicalOperatorsType();

	/**
	 * Returns a new object of class '<em>Lower Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Boundary Type</em>'.
	 * @generated
	 */
	LowerBoundaryType createLowerBoundaryType();

	/**
	 * Returns a new object of class '<em>Property Is Between Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Is Between Type</em>'.
	 * @generated
	 */
	PropertyIsBetweenType createPropertyIsBetweenType();

	/**
	 * Returns a new object of class '<em>Property Is Like Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Is Like Type</em>'.
	 * @generated
	 */
	PropertyIsLikeType createPropertyIsLikeType();

	/**
	 * Returns a new object of class '<em>Property Is Null Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Is Null Type</em>'.
	 * @generated
	 */
	PropertyIsNullType createPropertyIsNullType();

	/**
	 * Returns a new object of class '<em>Property Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Name Type</em>'.
	 * @generated
	 */
	PropertyNameType createPropertyNameType();

	/**
	 * Returns a new object of class '<em>Scalar Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Capabilities Type</em>'.
	 * @generated
	 */
	ScalarCapabilitiesType createScalarCapabilitiesType();

	/**
	 * Returns a new object of class '<em>Simple Arithmetic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Arithmetic Type</em>'.
	 * @generated
	 */
	SimpleArithmeticType createSimpleArithmeticType();

	/**
	 * Returns a new object of class '<em>Sort By Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort By Type</em>'.
	 * @generated
	 */
	SortByType createSortByType();

	/**
	 * Returns a new object of class '<em>Sort Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Property Type</em>'.
	 * @generated
	 */
	SortPropertyType createSortPropertyType();

	/**
	 * Returns a new object of class '<em>Spatial Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Capabilities Type</em>'.
	 * @generated
	 */
	SpatialCapabilitiesType createSpatialCapabilitiesType();

	/**
	 * Returns a new object of class '<em>Spatial Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Operators Type</em>'.
	 * @generated
	 */
	SpatialOperatorsType createSpatialOperatorsType();

	/**
	 * Returns a new object of class '<em>Spatial Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Operator Type</em>'.
	 * @generated
	 */
	SpatialOperatorType createSpatialOperatorType();

	/**
	 * Returns a new object of class '<em>Unary Logic Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Logic Op Type</em>'.
	 * @generated
	 */
	UnaryLogicOpType createUnaryLogicOpType();

	/**
	 * Returns a new object of class '<em>Upper Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upper Boundary Type</em>'.
	 * @generated
	 */
	UpperBoundaryType createUpperBoundaryType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OGCPackage getOGCPackage();

} //OGCFactory
