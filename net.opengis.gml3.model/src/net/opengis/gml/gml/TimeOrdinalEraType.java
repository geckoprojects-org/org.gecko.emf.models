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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Ordinal Era Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalEraType#getRelatedTime <em>Related Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalEraType#getStart <em>Start</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalEraType#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalEraType#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalEraType#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalEraType#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType()
 * @model extendedMetaData="name='TimeOrdinalEraType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeOrdinalEraType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Related Time</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.RelatedTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Time</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType_RelatedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedTimeType> getRelatedTime();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(TimeNodePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeNodePropertyType getStart();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeOrdinalEraType#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(TimeNodePropertyType value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TimeNodePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeNodePropertyType getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeOrdinalEraType#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TimeNodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(TimePeriodPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType_Extent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodPropertyType getExtent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeOrdinalEraType#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(TimePeriodPropertyType value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.TimeOrdinalEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeOrdinalEraPropertyType> getMember();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalEraType_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getGroup();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeOrdinalEraType#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ReferenceType value);

} // TimeOrdinalEraType
