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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweise Kinderwunsch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisAktuellerWohnsitz <em>Nachweis Aktueller Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisEheurkunde <em>Nachweis Eheurkunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getDauerAngelegtePartnerschaft <em>Dauer Angelegte Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getKostenuebernahmeerklaerungNegativbescheid <em>Kostenuebernahmeerklaerung Negativbescheid</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNotwendigkeitsbescheinigungDesArztes <em>Notwendigkeitsbescheinigung Des Arztes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getBehandlungsplanKostenvoranschlag <em>Behandlungsplan Kostenvoranschlag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getErklaerungReproduktionseinrichtung <em>Erklaerung Reproduktionseinrichtung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType()
 * @model extendedMetaData="name='NachweiseKinderwunschType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweiseKinderwunschType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachweis Aktueller Wohnsitz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Aktueller Wohnsitz</em>' containment reference.
	 * @see #setNachweisAktuellerWohnsitz(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_NachweisAktuellerWohnsitz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisAktuellerWohnsitz' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getNachweisAktuellerWohnsitz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisAktuellerWohnsitz <em>Nachweis Aktueller Wohnsitz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Aktueller Wohnsitz</em>' containment reference.
	 * @see #getNachweisAktuellerWohnsitz()
	 * @generated
	 */
	void setNachweisAktuellerWohnsitz(NachweisType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Eheurkunde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Eheurkunde</em>' containment reference.
	 * @see #setNachweisEheurkunde(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_NachweisEheurkunde()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisEheurkunde' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getNachweisEheurkunde();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisEheurkunde <em>Nachweis Eheurkunde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Eheurkunde</em>' containment reference.
	 * @see #getNachweisEheurkunde()
	 * @generated
	 */
	void setNachweisEheurkunde(NachweisType value);

	/**
	 * Returns the value of the '<em><b>Dauer Angelegte Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dauer Angelegte Partnerschaft</em>' containment reference.
	 * @see #setDauerAngelegtePartnerschaft(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_DauerAngelegtePartnerschaft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dauerAngelegtePartnerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getDauerAngelegtePartnerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getDauerAngelegtePartnerschaft <em>Dauer Angelegte Partnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer Angelegte Partnerschaft</em>' containment reference.
	 * @see #getDauerAngelegtePartnerschaft()
	 * @generated
	 */
	void setDauerAngelegtePartnerschaft(NachweisType value);

	/**
	 * Returns the value of the '<em><b>Kostenuebernahmeerklaerung Negativbescheid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kostenuebernahmeerklaerung Negativbescheid</em>' containment reference.
	 * @see #setKostenuebernahmeerklaerungNegativbescheid(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_KostenuebernahmeerklaerungNegativbescheid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kostenuebernahmeerklaerungNegativbescheid' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getKostenuebernahmeerklaerungNegativbescheid();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getKostenuebernahmeerklaerungNegativbescheid <em>Kostenuebernahmeerklaerung Negativbescheid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kostenuebernahmeerklaerung Negativbescheid</em>' containment reference.
	 * @see #getKostenuebernahmeerklaerungNegativbescheid()
	 * @generated
	 */
	void setKostenuebernahmeerklaerungNegativbescheid(NachweisType value);

	/**
	 * Returns the value of the '<em><b>Notwendigkeitsbescheinigung Des Arztes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notwendigkeitsbescheinigung Des Arztes</em>' containment reference.
	 * @see #setNotwendigkeitsbescheinigungDesArztes(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_NotwendigkeitsbescheinigungDesArztes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notwendigkeitsbescheinigungDesArztes' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getNotwendigkeitsbescheinigungDesArztes();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNotwendigkeitsbescheinigungDesArztes <em>Notwendigkeitsbescheinigung Des Arztes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notwendigkeitsbescheinigung Des Arztes</em>' containment reference.
	 * @see #getNotwendigkeitsbescheinigungDesArztes()
	 * @generated
	 */
	void setNotwendigkeitsbescheinigungDesArztes(NachweisType value);

	/**
	 * Returns the value of the '<em><b>Behandlungsplan Kostenvoranschlag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behandlungsplan Kostenvoranschlag</em>' containment reference.
	 * @see #setBehandlungsplanKostenvoranschlag(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_BehandlungsplanKostenvoranschlag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behandlungsplanKostenvoranschlag' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getBehandlungsplanKostenvoranschlag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getBehandlungsplanKostenvoranschlag <em>Behandlungsplan Kostenvoranschlag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behandlungsplan Kostenvoranschlag</em>' containment reference.
	 * @see #getBehandlungsplanKostenvoranschlag()
	 * @generated
	 */
	void setBehandlungsplanKostenvoranschlag(NachweisType value);

	/**
	 * Returns the value of the '<em><b>Erklaerung Reproduktionseinrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erklaerung Reproduktionseinrichtung</em>' containment reference.
	 * @see #setErklaerungReproduktionseinrichtung(NachweisType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getNachweiseKinderwunschType_ErklaerungReproduktionseinrichtung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erklaerungReproduktionseinrichtung' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisType getErklaerungReproduktionseinrichtung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getErklaerungReproduktionseinrichtung <em>Erklaerung Reproduktionseinrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erklaerung Reproduktionseinrichtung</em>' containment reference.
	 * @see #getErklaerungReproduktionseinrichtung()
	 * @generated
	 */
	void setErklaerungReproduktionseinrichtung(NachweisType value);

} // NachweiseKinderwunschType
