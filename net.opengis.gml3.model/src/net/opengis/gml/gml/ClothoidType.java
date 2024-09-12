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

import java.math.BigDecimal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clothoid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ClothoidType#getRefLocation <em>Ref Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ClothoidType#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ClothoidType#getStartParameter <em>Start Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ClothoidType#getEndParameter <em>End Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ClothoidType#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getClothoidType()
 * @model extendedMetaData="name='ClothoidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClothoidType extends AbstractCurveSegmentType {
	/**
	 * Returns the value of the '<em><b>Ref Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Location</em>' containment reference.
	 * @see #setRefLocation(RefLocationType)
	 * @see net.opengis.gml.gml.GMLPackage#getClothoidType_RefLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	RefLocationType getRefLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ClothoidType#getRefLocation <em>Ref Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Location</em>' containment reference.
	 * @see #getRefLocation()
	 * @generated
	 */
	void setRefLocation(RefLocationType value);

	/**
	 * Returns the value of the '<em><b>Scale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Factor</em>' attribute.
	 * @see #setScaleFactor(BigDecimal)
	 * @see net.opengis.gml.gml.GMLPackage#getClothoidType_ScaleFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='scaleFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getScaleFactor();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ClothoidType#getScaleFactor <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Factor</em>' attribute.
	 * @see #getScaleFactor()
	 * @generated
	 */
	void setScaleFactor(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Start Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Parameter</em>' attribute.
	 * @see #isSetStartParameter()
	 * @see #unsetStartParameter()
	 * @see #setStartParameter(double)
	 * @see net.opengis.gml.gml.GMLPackage#getClothoidType_StartParameter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='startParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStartParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ClothoidType#getStartParameter <em>Start Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Parameter</em>' attribute.
	 * @see #isSetStartParameter()
	 * @see #unsetStartParameter()
	 * @see #getStartParameter()
	 * @generated
	 */
	void setStartParameter(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.ClothoidType#getStartParameter <em>Start Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartParameter()
	 * @see #getStartParameter()
	 * @see #setStartParameter(double)
	 * @generated
	 */
	void unsetStartParameter();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.ClothoidType#getStartParameter <em>Start Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Parameter</em>' attribute is set.
	 * @see #unsetStartParameter()
	 * @see #getStartParameter()
	 * @see #setStartParameter(double)
	 * @generated
	 */
	boolean isSetStartParameter();

	/**
	 * Returns the value of the '<em><b>End Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Parameter</em>' attribute.
	 * @see #isSetEndParameter()
	 * @see #unsetEndParameter()
	 * @see #setEndParameter(double)
	 * @see net.opengis.gml.gml.GMLPackage#getClothoidType_EndParameter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='endParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEndParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ClothoidType#getEndParameter <em>End Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Parameter</em>' attribute.
	 * @see #isSetEndParameter()
	 * @see #unsetEndParameter()
	 * @see #getEndParameter()
	 * @generated
	 */
	void setEndParameter(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.ClothoidType#getEndParameter <em>End Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndParameter()
	 * @see #getEndParameter()
	 * @see #setEndParameter(double)
	 * @generated
	 */
	void unsetEndParameter();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.ClothoidType#getEndParameter <em>End Parameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Parameter</em>' attribute is set.
	 * @see #unsetEndParameter()
	 * @see #getEndParameter()
	 * @see #setEndParameter(double)
	 * @generated
	 */
	boolean isSetEndParameter();

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' attribute.
	 * The default value is <code>"clothoid"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.CurveInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation</em>' attribute.
	 * @see net.opengis.gml.gml.CurveInterpolationType
	 * @see #isSetInterpolation()
	 * @see #unsetInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @see net.opengis.gml.gml.GMLPackage#getClothoidType_Interpolation()
	 * @model default="clothoid" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='interpolation'"
	 * @generated
	 */
	CurveInterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ClothoidType#getInterpolation <em>Interpolation</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.gml.ClothoidType#getInterpolation <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	void unsetInterpolation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.ClothoidType#getInterpolation <em>Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation</em>' attribute is set.
	 * @see #unsetInterpolation()
	 * @see #getInterpolation()
	 * @see #setInterpolation(CurveInterpolationType)
	 * @generated
	 */
	boolean isSetInterpolation();

} // ClothoidType
