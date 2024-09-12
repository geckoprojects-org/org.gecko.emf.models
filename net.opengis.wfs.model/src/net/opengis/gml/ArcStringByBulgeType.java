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
package net.opengis.gml;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc String By Bulge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This variant of the arc computes the mid points of the arcs instead of storing the coordinates directly. The control point sequence consists of the start and end points of each arc plus the bulge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getBulge <em>Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getNormal <em>Normal</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link net.opengis.gml.ArcStringByBulgeType#getNumArc <em>Num Arc</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType()
 * @model extendedMetaData="name='ArcStringByBulgeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ArcStringByBulgeType extends AbstractCurveSegmentType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.DirectPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_Pos()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<DirectPositionType> getPos();

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty 
	 * 			is the predefined property which can be used by GML Application Schemas whenever a GML Feature has a property with a value that 
	 * 			is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_PointProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<PointPropertyType> getPointProperty();

	/**
	 * Returns the value of the '<em><b>Point Rep</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.1.0. Use "pointProperty" instead. Included for backwards compatibility with GML 3.0.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Rep</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_PointRep()
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
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_PosList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.ArcStringByBulgeType#getPosList <em>Pos List</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.1.0. Use "posList" instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.ArcStringByBulgeType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Bulge</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bulge controls the offset of each arc's midpoint. The "bulge" is the real number multiplier for the normal that determines the offset direction of the midpoint of each arc. The length of the bulge sequence is exactly 1 less than the length of the control point array, since a bulge is needed for each pair of adjacent points in the control point array. The bulge is not given by a distance, since it is simply a multiplier for the normal.
	 * The midpoint of the resulting arc is given by: midPoint = ((startPoint + endPoint)/2.0) + bulge*normal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulge</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_Bulge()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='bulge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Double> getBulge();

	/**
	 * Returns the value of the '<em><b>Normal</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.VectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute "normal" is a vector normal (perpendicular) to the chord of the arc, the line joining the first and last
	 * point of the arc. In a 2D coordinate system, there are only two possible directions for the normal, and it is often given as a signed real, indicating its length, with a positive sign indicating a left turn angle from the chord line, and a negative sign indicating a right turn from the chord. In 3D, the normal determines the plane of the arc, along with the start and endPoint of the arc.
	 * The normal is usually a unit vector, but this is not absolutely necessary. If the normal is a zero vector, the geometric object becomes equivalent to the straight line between the two end points. The length of the normal sequence is exactly the same as for the bulge sequence, 1 less than the control point sequence length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_Normal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='normal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VectorType> getNormal();

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"circularArc2PointWithBulge"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute "interpolation" specifies the curve interpolation mechanism used for this segment. This mechanism
	 * uses the control points and control parameters to determine the position of this curve segment. For an ArcStringByBulge the interpolation is fixed as "circularArc2PointWithBulge".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_Interpolation()
	 * @model default="circularArc2PointWithBulge" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	CurveInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.ArcStringByBulgeType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(CurveInterpolationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.ArcStringByBulgeType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.ArcStringByBulgeType#getInterpolation <em>Interpolation</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Num Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of arcs in the arc string can be explicitly stated in this attribute. The number of control points in the arc string must be numArc + 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Arc</em>' attribute.
	 * @see #setNumArc(BigInteger)
	 * @see net.opengis.gml.GMLPackage#getArcStringByBulgeType_NumArc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='numArc'"
	 * @generated
	 */
	BigInteger getNumArc();

	/**
	 * Sets the value of the '{@link net.opengis.gml.ArcStringByBulgeType#getNumArc <em>Num Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Arc</em>' attribute.
	 * @see #getNumArc()
	 * @generated
	 */
	void setNumArc(BigInteger value);

} // ArcStringByBulgeType
