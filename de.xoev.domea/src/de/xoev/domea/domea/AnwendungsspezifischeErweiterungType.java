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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anwendungsspezifische Erweiterung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsnummer <em>Versionsnummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsdatum <em>Versionsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getFeldgruppe <em>Feldgruppe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getFeld <em>Feld</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType()
 * @model extendedMetaData="name='AnwendungsspezifischeErweiterungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnwendungsspezifischeErweiterungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Identifikationskennzeichen der anwendungsspezifischen Erweiterung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' attribute.
	 * @see #setKennung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Kennung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Kennung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getKennung <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennung</em>' attribute.
	 * @see #getKennung()
	 * @generated
	 */
	void setKennung(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name der anwendungsspezifischen Erweiterung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die textuelle Erläuterung zu einer anwendungsspezifischen Erweiterung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Beschreibung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Beschreibung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Versionsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Versionsnummer der anwendungsspezifischen Erweiterung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versionsnummer</em>' attribute.
	 * @see #setVersionsnummer(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Versionsnummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Versionsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsnummer <em>Versionsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versionsnummer</em>' attribute.
	 * @see #getVersionsnummer()
	 * @generated
	 */
	void setVersionsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Versionsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Datum, an dem die Version der anwendungsspezifischen Erweiterung erstellt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versionsdatum</em>' attribute.
	 * @see #setVersionsdatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Versionsdatum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Versionsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getVersionsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsdatum <em>Versionsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versionsdatum</em>' attribute.
	 * @see #getVersionsdatum()
	 * @generated
	 */
	void setVersionsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Feldgruppe</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.FeldgruppeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Feldgruppe, die der anwendungsspezifischen Erweiterung zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feldgruppe</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Feldgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Feldgruppe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldgruppeType> getFeldgruppe();

	/**
	 * Returns the value of the '<em><b>Feld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.FeldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Feld, das der anwendungsspezifischen Erweiterung zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feld</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAnwendungsspezifischeErweiterungType_Feld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Feld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldType> getFeld();

} // AnwendungsspezifischeErweiterungType
