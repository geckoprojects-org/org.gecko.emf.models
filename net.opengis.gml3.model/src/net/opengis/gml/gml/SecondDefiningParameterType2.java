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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Second Defining Parameter Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.SecondDefiningParameterType2#getInverseFlattening <em>Inverse Flattening</em>}</li>
 *   <li>{@link net.opengis.gml.gml.SecondDefiningParameterType2#getSemiMinorAxis <em>Semi Minor Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.SecondDefiningParameterType2#isIsSphere <em>Is Sphere</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getSecondDefiningParameterType2()
 * @model extendedMetaData="name='SecondDefiningParameter_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecondDefiningParameterType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Inverse Flattening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Flattening</em>' containment reference.
	 * @see #setInverseFlattening(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getSecondDefiningParameterType2_InverseFlattening()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inverseFlattening' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getInverseFlattening();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SecondDefiningParameterType2#getInverseFlattening <em>Inverse Flattening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Flattening</em>' containment reference.
	 * @see #getInverseFlattening()
	 * @generated
	 */
	void setInverseFlattening(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Semi Minor Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Minor Axis</em>' containment reference.
	 * @see #setSemiMinorAxis(LengthType)
	 * @see net.opengis.gml.gml.GMLPackage#getSecondDefiningParameterType2_SemiMinorAxis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semiMinorAxis' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getSemiMinorAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SecondDefiningParameterType2#getSemiMinorAxis <em>Semi Minor Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Minor Axis</em>' containment reference.
	 * @see #getSemiMinorAxis()
	 * @generated
	 */
	void setSemiMinorAxis(LengthType value);

	/**
	 * Returns the value of the '<em><b>Is Sphere</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sphere</em>' attribute.
	 * @see #isSetIsSphere()
	 * @see #unsetIsSphere()
	 * @see #setIsSphere(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getSecondDefiningParameterType2_IsSphere()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isSphere' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsSphere();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SecondDefiningParameterType2#isIsSphere <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sphere</em>' attribute.
	 * @see #isSetIsSphere()
	 * @see #unsetIsSphere()
	 * @see #isIsSphere()
	 * @generated
	 */
	void setIsSphere(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.SecondDefiningParameterType2#isIsSphere <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSphere()
	 * @see #isIsSphere()
	 * @see #setIsSphere(boolean)
	 * @generated
	 */
	void unsetIsSphere();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.SecondDefiningParameterType2#isIsSphere <em>Is Sphere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Sphere</em>' attribute is set.
	 * @see #unsetIsSphere()
	 * @see #isIsSphere()
	 * @see #setIsSphere(boolean)
	 * @generated
	 */
	boolean isSetIsSphere();

} // SecondDefiningParameterType2
