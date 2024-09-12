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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 1D coordinate reference system used for the recording of time. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TemporalCRSType#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.TemporalCRSType#getUsesTemporalDatum <em>Uses Temporal Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTemporalCRSType()
 * @model extendedMetaData="name='TemporalCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemporalCRSType extends AbstractReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Uses Temporal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the temporal coordinate system used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Temporal CS</em>' containment reference.
	 * @see #setUsesTemporalCS(TemporalCSRefType)
	 * @see net.opengis.gml.GMLPackage#getTemporalCRSType_UsesTemporalCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesTemporalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalCSRefType getUsesTemporalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TemporalCRSType#getUsesTemporalCS <em>Uses Temporal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Temporal CS</em>' containment reference.
	 * @see #getUsesTemporalCS()
	 * @generated
	 */
	void setUsesTemporalCS(TemporalCSRefType value);

	/**
	 * Returns the value of the '<em><b>Uses Temporal Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the temporal datum used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Temporal Datum</em>' containment reference.
	 * @see #setUsesTemporalDatum(TemporalDatumRefType)
	 * @see net.opengis.gml.GMLPackage#getTemporalCRSType_UsesTemporalDatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesTemporalDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalDatumRefType getUsesTemporalDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TemporalCRSType#getUsesTemporalDatum <em>Uses Temporal Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Temporal Datum</em>' containment reference.
	 * @see #getUsesTemporalDatum()
	 * @generated
	 */
	void setUsesTemporalDatum(TemporalDatumRefType value);

} // TemporalCRSType
