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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachweisdokument Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Metainformationen eines Nachweisdokuments. Der Inhalt wird in einem Attachment übertragen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDokumentid <em>Dokumentid</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getKategorie <em>Kategorie</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisdokumentType()
 * @model extendedMetaData="name='NachweisdokumentType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachweisdokumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dokumentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Innerhalb der Transport-Kontextes eindeutige Kennung des Dokuments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dokumentid</em>' attribute.
	 * @see #setDokumentid(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisdokumentType_Dokumentid()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='dokumentid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDokumentid();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDokumentid <em>Dokumentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dokumentid</em>' attribute.
	 * @see #getDokumentid()
	 * @generated
	 */
	void setDokumentid(String value);

	/**
	 * Returns the value of the '<em><b>Dateiname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Dateiname des Dokuments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateiname</em>' attribute.
	 * @see #setDateiname(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisdokumentType_Dateiname()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='dateiname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDateiname();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDateiname <em>Dateiname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateiname</em>' attribute.
	 * @see #getDateiname()
	 * @generated
	 */
	void setDateiname(String value);

	/**
	 * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Mime-Type des Dokuments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mimetype</em>' attribute.
	 * @see #setMimetype(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisdokumentType_Mimetype()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='mimetype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimetype();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(String value);

	/**
	 * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kategorie des Dokuments. Beispiel: "Antrag im Original". Anmerkung: Für eine spätere Fassung von XFamilie ist geplant, die Kategorisierung durch eine Codeliste zu unterstützen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kategorie</em>' attribute.
	 * @see #setKategorie(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachweisdokumentType_Kategorie()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='kategorie' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKategorie();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getKategorie <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kategorie</em>' attribute.
	 * @see #getKategorie()
	 * @generated
	 */
	void setKategorie(String value);

} // NachweisdokumentType
