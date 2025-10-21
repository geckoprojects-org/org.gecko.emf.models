/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.xoev.xfamilie.dsrv._1.dsrv;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsrv Statusantwortrvbea0403 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getAbfrageID <em>Abfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getRueckmeldung <em>Rueckmeldung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvStatusantwortrvbea0403Type()
 * @model extendedMetaData="name='dsrv.statusantwortrvbea.0403_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DsrvStatusantwortrvbea0403Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige ID, mit der sämtliche Antworten zu dieser Abfrage versehen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abfrage ID</em>' attribute.
	 * @see #setAbfrageID(String)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvStatusantwortrvbea0403Type_AbfrageID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='abfrageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbfrageID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getAbfrageID <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abfrage ID</em>' attribute.
	 * @see #getAbfrageID()
	 * @generated
	 */
	void setAbfrageID(String value);

	/**
	 * Returns the value of the '<em><b>Rueckmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls keine oder mehrere Personen zu einer Anfrage gefunden werden kann, wird lediglich eine kurze Rückmeldung gegeben. Falls eine Person eindeutig identifiziert werden konnte, wird eine Rückmeldung zur Person und den Arbeitgebern gegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rueckmeldung</em>' containment reference.
	 * @see #setRueckmeldung(AnyTypeFamilieDSRVType)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDsrvStatusantwortrvbea0403Type_Rueckmeldung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rueckmeldung' namespace='##targetNamespace'"
	 * @generated
	 */
	AnyTypeFamilieDSRVType getRueckmeldung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type#getRueckmeldung <em>Rueckmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rueckmeldung</em>' containment reference.
	 * @see #getRueckmeldung()
	 * @generated
	 */
	void setRueckmeldung(AnyTypeFamilieDSRVType value);

} // DsrvStatusantwortrvbea0403Type
