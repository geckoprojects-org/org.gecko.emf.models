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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Second Defining Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.SecondDefiningParameterType#getInverseFlattening <em>Inverse Flattening</em>}</li>
 *   <li>{@link net.opengis.gml.SecondDefiningParameterType#getSemiMinorAxis <em>Semi Minor Axis</em>}</li>
 *   <li>{@link net.opengis.gml.SecondDefiningParameterType#getIsSphere <em>Is Sphere</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getSecondDefiningParameterType()
 * @model extendedMetaData="name='SecondDefiningParameterType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SecondDefiningParameterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Inverse Flattening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse flattening value of the ellipsoid. Value is a scale factor (or ratio) that has no physical unit. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a scale factor, such as percent, permil, or parts-per-million. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse Flattening</em>' containment reference.
	 * @see #setInverseFlattening(MeasureType)
	 * @see net.opengis.gml.GMLPackage#getSecondDefiningParameterType_InverseFlattening()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inverseFlattening' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getInverseFlattening();

	/**
	 * Sets the value of the '{@link net.opengis.gml.SecondDefiningParameterType#getInverseFlattening <em>Inverse Flattening</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * Length of the semi-minor axis of the ellipsoid. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a length, such as metres or feet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semi Minor Axis</em>' containment reference.
	 * @see #setSemiMinorAxis(MeasureType)
	 * @see net.opengis.gml.GMLPackage#getSecondDefiningParameterType_SemiMinorAxis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semiMinorAxis' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getSemiMinorAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.SecondDefiningParameterType#getSemiMinorAxis <em>Semi Minor Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Minor Axis</em>' containment reference.
	 * @see #getSemiMinorAxis()
	 * @generated
	 */
	void setSemiMinorAxis(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Is Sphere</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.IsSphereType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Sphere</em>' attribute.
	 * @see net.opengis.gml.IsSphereType
	 * @see #isSetIsSphere()
	 * @see #unsetIsSphere()
	 * @see #setIsSphere(IsSphereType)
	 * @see net.opengis.gml.GMLPackage#getSecondDefiningParameterType_IsSphere()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='isSphere' namespace='##targetNamespace'"
	 * @generated
	 */
	IsSphereType getIsSphere();

	/**
	 * Sets the value of the '{@link net.opengis.gml.SecondDefiningParameterType#getIsSphere <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sphere</em>' attribute.
	 * @see net.opengis.gml.IsSphereType
	 * @see #isSetIsSphere()
	 * @see #unsetIsSphere()
	 * @see #getIsSphere()
	 * @generated
	 */
	void setIsSphere(IsSphereType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.SecondDefiningParameterType#getIsSphere <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSphere()
	 * @see #getIsSphere()
	 * @see #setIsSphere(IsSphereType)
	 * @generated
	 */
	void unsetIsSphere();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.SecondDefiningParameterType#getIsSphere <em>Is Sphere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Sphere</em>' attribute is set.
	 * @see #unsetIsSphere()
	 * @see #getIsSphere()
	 * @see #setIsSphere(IsSphereType)
	 * @generated
	 */
	boolean isSetIsSphere();

} // SecondDefiningParameterType
