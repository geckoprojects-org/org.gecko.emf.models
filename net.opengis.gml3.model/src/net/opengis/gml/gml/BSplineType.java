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
package net.opengis.gml.gml;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSpline Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getDegree <em>Degree</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getKnot <em>Knot</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#isIsPolynomial <em>Is Polynomial</em>}</li>
 *   <li>{@link net.opengis.gml.gml.BSplineType#getKnotType <em>Knot Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getBSplineType()
 * @model extendedMetaData="name='BSplineType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BSplineType extends AbstractCurveSegmentType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.DirectPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_Pos()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<DirectPositionType> getPos();

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_PointProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<PointPropertyType> getPointProperty();

	/**
	 * Returns the value of the '<em><b>Point Rep</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Rep</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_PointRep()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointRep' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<PointPropertyType> getPointRep();

	/**
	 * Returns the value of the '<em><b>Pos List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos List</em>' containment reference.
	 * @see #setPosList(DirectPositionListType)
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_PosList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BSplineType#getPosList <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos List</em>' containment reference.
	 * @see #getPosList()
	 * @generated
	 */
	void setPosList(DirectPositionListType value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BSplineType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_Degree()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='degree' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDegree();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BSplineType#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Knot</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.KnotPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knot</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_Knot()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='knot' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KnotPropertyType> getKnot();

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"polynomialSpline"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.gml.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_Interpolation()
	 * @model default="polynomialSpline" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	CurveInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BSplineType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.gml.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(CurveInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.BSplineType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.BSplineType#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

	/**
	 * Returns the value of the '<em><b>Is Polynomial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Polynomial</em>' attribute.
	 * @see #isSetIsPolynomial()
	 * @see #unsetIsPolynomial()
	 * @see #setIsPolynomial(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_IsPolynomial()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isPolynomial'"
	 * @generated
	 */
	boolean isIsPolynomial();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BSplineType#isIsPolynomial <em>Is Polynomial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Polynomial</em>' attribute.
	 * @see #isSetIsPolynomial()
	 * @see #unsetIsPolynomial()
	 * @see #isIsPolynomial()
	 * @generated
	 */
	void setIsPolynomial(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.BSplineType#isIsPolynomial <em>Is Polynomial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPolynomial()
	 * @see #isIsPolynomial()
	 * @see #setIsPolynomial(boolean)
	 * @generated
	 */
	void unsetIsPolynomial();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.BSplineType#isIsPolynomial <em>Is Polynomial</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Polynomial</em>' attribute is set.
	 * @see #unsetIsPolynomial()
	 * @see #isIsPolynomial()
	 * @see #setIsPolynomial(boolean)
	 * @generated
	 */
	boolean isSetIsPolynomial();

	/**
	 * Returns the value of the '<em><b>Knot Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.KnotTypesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knot Type</em>' attribute.
	 * @see net.opengis.gml.gml.KnotTypesType
	 * @see #isSetKnotType()
	 * @see #unsetKnotType()
	 * @see #setKnotType(KnotTypesType)
	 * @see net.opengis.gml.gml.GMLPackage#getBSplineType_KnotType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='knotType'"
	 * @generated
	 */
	KnotTypesType getKnotType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BSplineType#getKnotType <em>Knot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knot Type</em>' attribute.
	 * @see net.opengis.gml.gml.KnotTypesType
	 * @see #isSetKnotType()
	 * @see #unsetKnotType()
	 * @see #getKnotType()
	 * @generated
	 */
	void setKnotType(KnotTypesType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.BSplineType#getKnotType <em>Knot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKnotType()
	 * @see #getKnotType()
	 * @see #setKnotType(KnotTypesType)
	 * @generated
	 */
	void unsetKnotType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.BSplineType#getKnotType <em>Knot Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Knot Type</em>' attribute is set.
	 * @see #unsetKnotType()
	 * @see #getKnotType()
	 * @see #setKnotType(KnotTypesType)
	 * @generated
	 */
	boolean isSetKnotType();

} // BSplineType
