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
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primaerdokument Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Primärdokument gehört zum eigentlichen Inhalt eines Dokuments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getDateinameOriginal <em>Dateiname Original</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getErsteller <em>Ersteller</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getDatumUhrzeit <em>Datum Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getSignaturSiegel <em>Signatur Siegel</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PrimaerdokumentType#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType()
 * @model extendedMetaData="name='PrimaerdokumentType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PrimaerdokumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dateiname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Dateiname des Primärdokumentes, der z. B. nach dem Muster "xdomeaUUID", "xdomeaUUID.Dateiformat" oder "xdomeaUUID_Dokumentname.Dateiformat" gebildet werden kann. Zur Eindeutigkeit der Dateinamen von Primärdokumenten ist hier stets eine individuelle UUID unabhängig von der UUID des dazugehörigen Dokumentes zu verwenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateiname</em>' attribute.
	 * @see #setDateiname(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_Dateiname()
	 * @model dataType="de.xoev.domea.domea.StringDateinameType" required="true"
	 *        extendedMetaData="kind='element' name='Dateiname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDateiname();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getDateiname <em>Dateiname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateiname</em>' attribute.
	 * @see #getDateiname()
	 * @generated
	 */
	void setDateiname(String value);

	/**
	 * Returns the value of the '<em><b>Dateiname Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name der Datei, wie er vor dem Export aus dem DMS / VBS im System vorlag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateiname Original</em>' attribute.
	 * @see #setDateinameOriginal(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_DateinameOriginal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DateinameOriginal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDateinameOriginal();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getDateinameOriginal <em>Dateiname Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateiname Original</em>' attribute.
	 * @see #getDateinameOriginal()
	 * @generated
	 */
	void setDateinameOriginal(String value);

	/**
	 * Returns the value of the '<em><b>Ersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Ersteller des Primärdokuments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ersteller</em>' attribute.
	 * @see #setErsteller(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_Ersteller()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Ersteller' namespace='##targetNamespace'"
	 * @generated
	 */
	String getErsteller();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getErsteller <em>Ersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ersteller</em>' attribute.
	 * @see #getErsteller()
	 * @generated
	 */
	void setErsteller(String value);

	/**
	 * Returns the value of the '<em><b>Datum Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Erstellungszeitpunkt des Primärdokuments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Uhrzeit</em>' attribute.
	 * @see #setDatumUhrzeit(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_DatumUhrzeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='DatumUhrzeit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatumUhrzeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getDatumUhrzeit <em>Datum Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Uhrzeit</em>' attribute.
	 * @see #getDatumUhrzeit()
	 * @generated
	 */
	void setDatumUhrzeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Signatur Siegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur elektronischen Signatur oder zum elektronischen Siegel, die zum Dokument gehören.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatur Siegel</em>' containment reference.
	 * @see #setSignaturSiegel(SignaturSiegelType)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_SignaturSiegel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SignaturSiegel' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturSiegelType getSignaturSiegel();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getSignaturSiegel <em>Signatur Siegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatur Siegel</em>' containment reference.
	 * @see #getSignaturSiegel()
	 * @generated
	 */
	void setSignaturSiegel(SignaturSiegelType value);

	/**
	 * Returns the value of the '<em><b>Zeitpunkt Letzte Aenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Zeitpunkt der letzten Änderung, die an dem Primärdokument vorgenommen wurde .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitpunkt Letzte Aenderung</em>' attribute.
	 * @see #setZeitpunktLetzteAenderung(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_ZeitpunktLetzteAenderung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ZeitpunktLetzteAenderung' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitpunktLetzteAenderung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitpunkt Letzte Aenderung</em>' attribute.
	 * @see #getZeitpunktLetzteAenderung()
	 * @generated
	 */
	void setZeitpunktLetzteAenderung(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informationen zum Überprüfen eventuell nicht dokumentierter oder nicht berechtigter Änderungen am Objekt. Diese Angaben werden durch das Speichersystem automatisch berechnet und aufgezeichnet. Durch den Abgleich des Hash-Wertes bei der Übernahme in das empfangende System kann sichergestellt werden, dass empfangene und gesendete Dateien identisch sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash</em>' containment reference.
	 * @see #setHash(HashType)
	 * @see de.xoev.domea.domea.DomeaPackage#getPrimaerdokumentType_Hash()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	HashType getHash();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PrimaerdokumentType#getHash <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' containment reference.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(HashType value);

} // PrimaerdokumentType
