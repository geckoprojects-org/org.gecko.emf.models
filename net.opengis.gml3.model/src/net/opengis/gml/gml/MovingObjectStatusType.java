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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moving Object Status Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getPosition <em>Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getLocationReference <em>Location Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getLocationGroup <em>Location Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getBearing <em>Bearing</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getElevation <em>Elevation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getStatus <em>Status</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MovingObjectStatusType#getStatusReference <em>Status Reference</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType()
 * @model extendedMetaData="name='MovingObjectStatusType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MovingObjectStatusType extends AbstractTimeSliceType {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(GeometryPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Position()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(DirectPositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Pos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getPos();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:locationName property element is a convenience property where the text value describes the location of the feature. If the location names are selected from a controlled list, then the list shall be identified in the codeSpace attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Name</em>' containment reference.
	 * @see #setLocationName(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_LocationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getLocationName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getLocationName <em>Location Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Name</em>' containment reference.
	 * @see #getLocationName()
	 * @generated
	 */
	void setLocationName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Location Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:locationReference property element is a convenience property where the text value referenced by the xlink:href attribute describes the location of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Reference</em>' containment reference.
	 * @see #setLocationReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_LocationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getLocationReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getLocationReference <em>Location Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Reference</em>' containment reference.
	 * @see #getLocationReference()
	 * @generated
	 */
	void setLocationReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Location Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_LocationGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='location:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationGroup();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Location()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace' group='location:group'"
	 * @generated
	 */
	LocationPropertyType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Speed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speed' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getSpeed();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Bearing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearing</em>' containment reference.
	 * @see #setBearing(DirectionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Bearing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bearing' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionPropertyType getBearing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getBearing <em>Bearing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearing</em>' containment reference.
	 * @see #getBearing()
	 * @generated
	 */
	void setBearing(DirectionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceleration</em>' containment reference.
	 * @see #setAcceleration(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Acceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getAcceleration();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getAcceleration <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceleration</em>' containment reference.
	 * @see #getAcceleration()
	 * @generated
	 */
	void setAcceleration(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' containment reference.
	 * @see #setElevation(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Elevation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elevation' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getElevation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getElevation <em>Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' containment reference.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getStatus();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Status Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reference</em>' containment reference.
	 * @see #setStatusReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getMovingObjectStatusType_StatusReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getStatusReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MovingObjectStatusType#getStatusReference <em>Status Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reference</em>' containment reference.
	 * @see #getStatusReference()
	 * @generated
	 */
	void setStatusReference(ReferenceType value);

} // MovingObjectStatusType
