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
 * A representation of the model object '<em><b>Coordinate System Axis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.CoordinateSystemAxisType#getAxisAbbrev <em>Axis Abbrev</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinateSystemAxisType#getAxisDirection <em>Axis Direction</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinateSystemAxisType#getRangeMeaning <em>Range Meaning</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinateSystemAxisType#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType()
 * @model extendedMetaData="name='CoordinateSystemAxisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CoordinateSystemAxisType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Axis Abbrev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:axisAbbrev is the abbreviation used for this coordinate system axis; this abbreviation is also used to identify the coordinates in the coordinate tuple. The codeSpace attribute may reference a source of more information on a set of standardized abbreviations, or on this abbreviation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Abbrev</em>' containment reference.
	 * @see #setAxisAbbrev(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType_AxisAbbrev()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axisAbbrev' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getAxisAbbrev();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getAxisAbbrev <em>Axis Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Abbrev</em>' containment reference.
	 * @see #getAxisAbbrev()
	 * @generated
	 */
	void setAxisAbbrev(CodeType value);

	/**
	 * Returns the value of the '<em><b>Axis Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:axisDirection is the direction of this coordinate system axis (or in the case of Cartesian projected coordinates, the direction of this coordinate system axis at the origin).
	 * Within any set of coordinate system axes, only one of each pair of terms may be used. For earth-fixed CRSs, this direction is often approximate and intended to provide a human interpretable meaning to the axis. When a geodetic datum is used, the precise directions of the axes may therefore vary slightly from this approximate direction.
	 * The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Direction</em>' containment reference.
	 * @see #setAxisDirection(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType_AxisDirection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axisDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getAxisDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getAxisDirection <em>Axis Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Direction</em>' containment reference.
	 * @see #getAxisDirection()
	 * @generated
	 */
	void setAxisDirection(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #setMinimumValue(double)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType_MinimumValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minimumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinimumValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(double)
	 * @generated
	 */
	void unsetMinimumValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMinimumValue <em>Minimum Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Value</em>' attribute is set.
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(double)
	 * @generated
	 */
	boolean isSetMinimumValue();

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:minimumValue and gml:maximumValue properties allow the specification of minimum and maximum value normally allowed for this axis, in the unit of measure for the axis. For a continuous angular axis such as longitude, the values wrap-around at this value. Also, values beyond this minimum/maximum can be used for specified purposes, such as in a bounding box. A value of minus infinity shall be allowed for the gml:minimumValue element, a value of plus infiniy for the gml:maximumValue element. If these elements are omitted, the value is unspecified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #isSetMaximumValue()
	 * @see #unsetMaximumValue()
	 * @see #setMaximumValue(double)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType_MaximumValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maximumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximumValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #isSetMaximumValue()
	 * @see #unsetMaximumValue()
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumValue()
	 * @see #getMaximumValue()
	 * @see #setMaximumValue(double)
	 * @generated
	 */
	void unsetMaximumValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getMaximumValue <em>Maximum Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Value</em>' attribute is set.
	 * @see #unsetMaximumValue()
	 * @see #getMaximumValue()
	 * @see #setMaximumValue(double)
	 * @generated
	 */
	boolean isSetMaximumValue();

	/**
	 * Returns the value of the '<em><b>Range Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:rangeMeaning describes the meaning of axis value range specified by gml:minimumValue and gml:maximumValue. This element shall be omitted when both gml:minimumValue and gml:maximumValue are omitted. This element should be included when gml:minimumValue and/or gml:maximumValue are included. If this element is omitted when the gml:minimumValue and/or gml:maximumValue are included, the meaning is unspecified. The codeSpace attribute shall reference a source of information specifying the values and meanings of all the allowed string values for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Meaning</em>' containment reference.
	 * @see #setRangeMeaning(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType_RangeMeaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rangeMeaning' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getRangeMeaning();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getRangeMeaning <em>Range Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Meaning</em>' containment reference.
	 * @see #getRangeMeaning()
	 * @generated
	 */
	void setRangeMeaning(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The uom attribute provides an identifier of the unit of measure used for this coordinate system axis. The value of this coordinate in a coordinate tuple shall be recorded using this unit of measure, whenever those coordinates use a coordinate reference system that uses a coordinate system that uses this axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see #setUom(String)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinateSystemAxisType_Uom()
	 * @model dataType="net.opengis.gml.gml.UomIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='uom'"
	 * @generated
	 */
	String getUom();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinateSystemAxisType#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

} // CoordinateSystemAxisType
