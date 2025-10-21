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
package de.xoev.xfamilie.baukasten._1.baukasten;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entgeltdaten Arbeitgeber Dsrv Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Ergebnis eines DSRV-Abrufs von Entgeltdaten eines Arbeitgebers über das Verfahren rvBEA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbfrageID <em>Abfrage ID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbrufergebnisDrv <em>Abrufergebnis Drv</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenArbeitgeberDsrvType()
 * @model extendedMetaData="name='EntgeltdatenArbeitgeber.DsrvType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EntgeltdatenArbeitgeberDsrvType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige ID, mit der sämtliche Antworten zu dieser Abfrage versehen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abfrage ID</em>' attribute.
	 * @see #setAbfrageID(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenArbeitgeberDsrvType_AbfrageID()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='abfrageID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbfrageID();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbfrageID <em>Abfrage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abfrage ID</em>' attribute.
	 * @see #getAbfrageID()
	 * @generated
	 */
	void setAbfrageID(String value);

	/**
	 * Returns the value of the '<em><b>Ifd Nr Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im Kontext der Abfrage (abfrageID) verwendete eindeutige ID des Arbeitgebers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ifd Nr Arbeitgeber</em>' attribute.
	 * @see #setIfdNrArbeitgeber(BigInteger)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenArbeitgeberDsrvType_IfdNrArbeitgeber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ifdNrArbeitgeber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIfdNrArbeitgeber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifd Nr Arbeitgeber</em>' attribute.
	 * @see #getIfdNrArbeitgeber()
	 * @generated
	 */
	void setIfdNrArbeitgeber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Abrufergebnis Drv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Entgeltbescheinigungen dieses Arbeitgebers, sofern dieser am elektronischen Entgeltdatenabruf im rvBEA-Verfahren teilnimmt und die Entgeltdaten erfolgreich übermittelt hat. Die Entgeltbescheinigungen werden als XML-Element DXEB in der Version 1.2.0 geliefert. Das Format dieses Elements ist beschrieben unter https://www.dsrv.info/de/Inhalt/20_Unsere_Verfahren/01_nationaler_Datenaustausch/03_Arbeitgeber/10_Downloads_Services/index_Downloads_Services.html. Der Datensatz DXEB ermöglicht grundsätzlich die Übermittlung aller in der Entgeltbescheinigungsverordnung benannten Elemente. Im Kontext von XFamilie sind mindenstens die folgenden Elemente anzugeben: EB-JAHR: Bescheinigungsjahr EB-MONAT: Bescheinigungsmonat EB-BBEGTAG: Datum des Beschäftigungsbeginns EB-BENDTAG: Datum des Beschäftigungsendes BYGR: Beitragsgruppenschlüssel KENNZGLE: Beschäftigung in der Gleitzone STKL: Steuerklasse FKT: Faktor bei Steuerklasse 4 KINFRB: Anzahl Kinderfreibeträge KZKIST: Kennzeichen Kirchensteuerabzug EBV-BRUTTO: Gesamtbrutto gemäß EBV EBV-STBRLF: Steuerbrutto, laufend EBV-STBRSO: Steuerbrutto, Einmalzahlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abrufergebnis Drv</em>' containment reference.
	 * @see #setAbrufergebnisDrv(EObject)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getEntgeltdatenArbeitgeberDsrvType_AbrufergebnisDrv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abrufergebnis.drv' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAbrufergebnisDrv();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbrufergebnisDrv <em>Abrufergebnis Drv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abrufergebnis Drv</em>' containment reference.
	 * @see #getAbrufergebnisDrv()
	 * @generated
	 */
	void setAbrufergebnisDrv(EObject value);

} // EntgeltdatenArbeitgeberDsrvType
