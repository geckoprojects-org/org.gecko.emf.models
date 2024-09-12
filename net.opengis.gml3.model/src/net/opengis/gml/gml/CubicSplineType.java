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
 * A representation of the model object '<em><b>Cubic Spline Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getVectorAtStart <em>Vector At Start</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getVectorAtEnd <em>Vector At End</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getDegree <em>Degree</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CubicSplineType#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType()
 * @model extendedMetaData="name='CubicSplineType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CubicSplineType extends AbstractCurveSegmentType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_Group()
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
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_Pos()
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
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_PointProperty()
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
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_PointRep()
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
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_PosList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getPosList <em>Pos List</em>}' containment reference.
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
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Vector At Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector At Start</em>' containment reference.
	 * @see #setVectorAtStart(VectorType)
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_VectorAtStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vectorAtStart' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType getVectorAtStart();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getVectorAtStart <em>Vector At Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector At Start</em>' containment reference.
	 * @see #getVectorAtStart()
	 * @generated
	 */
	void setVectorAtStart(VectorType value);

	/**
	 * Returns the value of the '<em><b>Vector At End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector At End</em>' containment reference.
	 * @see #setVectorAtEnd(VectorType)
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_VectorAtEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vectorAtEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType getVectorAtEnd();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getVectorAtEnd <em>Vector At End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector At End</em>' containment reference.
	 * @see #getVectorAtEnd()
	 * @generated
	 */
	void setVectorAtEnd(VectorType value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #isSetDegree()
	 * @see #unsetDegree()
	 * @see #setDegree(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_Degree()
	 * @model default="3" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='degree'"
	 * @generated
	 */
	BigInteger getDegree();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #isSetDegree()
	 * @see #unsetDegree()
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(BigInteger value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegree()
	 * @see #getDegree()
	 * @see #setDegree(BigInteger)
	 * @generated
	 */
	void unsetDegree();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CubicSplineType#getDegree <em>Degree</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degree</em>' attribute is set.
	 * @see #unsetDegree()
	 * @see #getDegree()
	 * @see #setDegree(BigInteger)
	 * @generated
	 */
	boolean isSetDegree();

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"cubicSpline"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.gml.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @see net.opengis.gml.gml.GMLPackage#getCubicSplineType_Interpolation()
	 * @model default="cubicSpline" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	CurveInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getInterpolation <em>Interpolation</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.gml.CubicSplineType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CubicSplineType#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

} // CubicSplineType
