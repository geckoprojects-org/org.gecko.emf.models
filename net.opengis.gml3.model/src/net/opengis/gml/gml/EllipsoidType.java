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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipsoid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.EllipsoidType#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EllipsoidType#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getEllipsoidType()
 * @model extendedMetaData="name='EllipsoidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EllipsoidType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Semi Major Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:semiMajorAxis specifies the length of the semi-major axis of the ellipsoid, with its units. Uses the MeasureType with the restriction that the unit of measure referenced by uom must be suitable for a length, such as metres or feet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semi Major Axis</em>' containment reference.
	 * @see #setSemiMajorAxis(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getEllipsoidType_SemiMajorAxis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='semiMajorAxis' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getSemiMajorAxis();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EllipsoidType#getSemiMajorAxis <em>Semi Major Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Major Axis</em>' containment reference.
	 * @see #getSemiMajorAxis()
	 * @generated
	 */
	void setSemiMajorAxis(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Second Defining Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:secondDefiningParameter is a property containing the definition of the second parameter that defines the shape of an ellipsoid. An ellipsoid requires two defining parameters: semi-major axis and inverse flattening or semi-major axis and semi-minor axis. When the reference body is a sphere rather than an ellipsoid, only a single defining parameter is required, namely the radius of the sphere; in that case, the semi-major axis "degenerates" into the radius of the sphere.
	 * The inverseFlattening element contains the inverse flattening value of the ellipsoid. This value is a scale factor (or ratio). It uses gml:LengthType with the restriction that the unit of measure referenced by the uom attribute must be suitable for a scale factor, such as percent, permil, or parts-per-million.
	 * The semiMinorAxis element contains the length of the semi-minor axis of the ellipsoid. When the isSphere element is included, the ellipsoid is degenerate and is actually a sphere. The sphere is completely defined by the semi-major axis, which is the radius of the sphere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #setSecondDefiningParameter(SecondDefiningParameterType)
	 * @see net.opengis.gml.gml.GMLPackage#getEllipsoidType_SecondDefiningParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='secondDefiningParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondDefiningParameterType getSecondDefiningParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EllipsoidType#getSecondDefiningParameter <em>Second Defining Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Defining Parameter</em>' containment reference.
	 * @see #getSecondDefiningParameter()
	 * @generated
	 */
	void setSecondDefiningParameter(SecondDefiningParameterType value);

} // EllipsoidType
