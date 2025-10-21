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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenabruf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hinweis auf einen Datenabruf, mit welchem der Autor der Nachricht Nachweisdaten aus anderen Register / von anderen Stellen abgerufen oder aus einem elektronischen Ausweisdokument (nPA/eAT) ausgelesen hat.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getId <em>Id</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getZeitstempel <em>Zeitstempel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getQuelle <em>Quelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getArtDesAbrufs <em>Art Des Abrufs</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getAbgerufenFuer <em>Abgerufen Fuer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getStatusDatenabruf <em>Status Datenabruf</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType()
 * @model extendedMetaData="name='DatenabrufType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DatenabrufType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige Identifikation des durchgeführten Datenabrufs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType_Id()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Zeitstempel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkt, zu welchem die Daten abgerufen wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitstempel</em>' attribute.
	 * @see #setZeitstempel(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType_Zeitstempel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='zeitstempel' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitstempel();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getZeitstempel <em>Zeitstempel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitstempel</em>' attribute.
	 * @see #getZeitstempel()
	 * @generated
	 */
	void setZeitstempel(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Quelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle (z. B. ein Melderegister), zu welchem die Daten abgerufen wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quelle</em>' attribute.
	 * @see #setQuelle(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType_Quelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='quelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getQuelle <em>Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quelle</em>' attribute.
	 * @see #getQuelle()
	 * @generated
	 */
	void setQuelle(String value);

	/**
	 * Returns the value of the '<em><b>Art Des Abrufs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Art des Abrufs (z. B. Meldedatenabruf nach Paragraf 38 BMG).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Des Abrufs</em>' attribute.
	 * @see #setArtDesAbrufs(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType_ArtDesAbrufs()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='artDesAbrufs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtDesAbrufs();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getArtDesAbrufs <em>Art Des Abrufs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Des Abrufs</em>' attribute.
	 * @see #getArtDesAbrufs()
	 * @generated
	 */
	void setArtDesAbrufs(String value);

	/**
	 * Returns the value of the '<em><b>Abgerufen Fuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person, zu welcher Daten abgerufen wurden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abgerufen Fuer</em>' attribute.
	 * @see #setAbgerufenFuer(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType_AbgerufenFuer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='abgerufenFuer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbgerufenFuer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getAbgerufenFuer <em>Abgerufen Fuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abgerufen Fuer</em>' attribute.
	 * @see #getAbgerufenFuer()
	 * @generated
	 */
	void setAbgerufenFuer(String value);

	/**
	 * Returns the value of the '<em><b>Status Datenabruf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status des Datenabrufs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Datenabruf</em>' containment reference.
	 * @see #setStatusDatenabruf(StatusDatenabrufType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenabrufType_StatusDatenabruf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='statusDatenabruf' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusDatenabrufType getStatusDatenabruf();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getStatusDatenabruf <em>Status Datenabruf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Datenabruf</em>' containment reference.
	 * @see #getStatusDatenabruf()
	 * @generated
	 */
	void setStatusDatenabruf(StatusDatenabrufType value);

} // DatenabrufType
