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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getAngabenSozialversicherung <em>Angaben Sozialversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isKirchensteuerpflicht <em>Kirchensteuerpflicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getVerschiebetatbestaende <em>Verschiebetatbestaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getNachweisEinkommenssteuerbescheid <em>Nachweis Einkommenssteuerbescheid</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType()
 * @model extendedMetaData="name='SelbststaendigkeitGewerbeLandForstwirtschaft.VorGeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angaben Sozialversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Einkommen aus einer Tätigkeit in einem Gewerbebetrieb vor Geburt des Kindes erzielt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Sozialversicherung</em>' containment reference.
	 * @see #setAngabenSozialversicherung(AngabenSozialversicherungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_AngabenSozialversicherung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenSozialversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenSozialversicherungType getAngabenSozialversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getAngabenSozialversicherung <em>Angaben Sozialversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Sozialversicherung</em>' containment reference.
	 * @see #getAngabenSozialversicherung()
	 * @generated
	 */
	void setAngabenSozialversicherung(AngabenSozialversicherungType value);

	/**
	 * Returns the value of the '<em><b>Kirchensteuerpflicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Kirchensteuerpflicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kirchensteuerpflicht</em>' attribute.
	 * @see #isSetKirchensteuerpflicht()
	 * @see #unsetKirchensteuerpflicht()
	 * @see #setKirchensteuerpflicht(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Kirchensteuerpflicht()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='kirchensteuerpflicht' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKirchensteuerpflicht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isKirchensteuerpflicht <em>Kirchensteuerpflicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kirchensteuerpflicht</em>' attribute.
	 * @see #isSetKirchensteuerpflicht()
	 * @see #unsetKirchensteuerpflicht()
	 * @see #isKirchensteuerpflicht()
	 * @generated
	 */
	void setKirchensteuerpflicht(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isKirchensteuerpflicht <em>Kirchensteuerpflicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKirchensteuerpflicht()
	 * @see #isKirchensteuerpflicht()
	 * @see #setKirchensteuerpflicht(boolean)
	 * @generated
	 */
	void unsetKirchensteuerpflicht();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isKirchensteuerpflicht <em>Kirchensteuerpflicht</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kirchensteuerpflicht</em>' attribute is set.
	 * @see #unsetKirchensteuerpflicht()
	 * @see #isKirchensteuerpflicht()
	 * @see #setKirchensteuerpflicht(boolean)
	 * @generated
	 */
	boolean isSetKirchensteuerpflicht();

	/**
	 * Returns the value of the '<em><b>Verschiebetatbestaende</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Verschiebebeständen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verschiebetatbestaende</em>' containment reference.
	 * @see #setVerschiebetatbestaende(SelbststaendigkeitVerschiebetatbestaendeType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Verschiebetatbestaende()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verschiebetatbestaende' namespace='##targetNamespace'"
	 * @generated
	 */
	SelbststaendigkeitVerschiebetatbestaendeType getVerschiebetatbestaende();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#getVerschiebetatbestaende <em>Verschiebetatbestaende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verschiebetatbestaende</em>' containment reference.
	 * @see #getVerschiebetatbestaende()
	 * @generated
	 */
	void setVerschiebetatbestaende(SelbststaendigkeitVerschiebetatbestaendeType value);

	/**
	 * Returns the value of the '<em><b>Steuerfreibetrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steuerfreibetrag nach Paragraf 3 Nr. 26 EStG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerfreibetrag</em>' attribute.
	 * @see #isSetSteuerfreibetrag()
	 * @see #unsetSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_Steuerfreibetrag()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='steuerfreibetrag' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSteuerfreibetrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerfreibetrag</em>' attribute.
	 * @see #isSetSteuerfreibetrag()
	 * @see #unsetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @generated
	 */
	void setSteuerfreibetrag(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @generated
	 */
	void unsetSteuerfreibetrag();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType#isSteuerfreibetrag <em>Steuerfreibetrag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steuerfreibetrag</em>' attribute is set.
	 * @see #unsetSteuerfreibetrag()
	 * @see #isSteuerfreibetrag()
	 * @see #setSteuerfreibetrag(boolean)
	 * @generated
	 */
	boolean isSetSteuerfreibetrag();

	/**
	 * Returns the value of the '<em><b>Nachweis Einkommenssteuerbescheid</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Einkommenssteuerbescheid</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType_NachweisEinkommenssteuerbescheid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisEinkommenssteuerbescheid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisEinkommenssteuerbescheid();

} // SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType
