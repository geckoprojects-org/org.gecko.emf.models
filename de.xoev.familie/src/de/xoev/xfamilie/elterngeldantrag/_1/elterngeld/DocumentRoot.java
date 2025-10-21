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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAbbruch0206 <em>Elterngeldantrag Abbruch0206</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrage0204 <em>Elterngeldantrag Anfrage0204</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrageabschluss0205 <em>Elterngeldantrag Anfrageabschluss0205</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAntrag0201 <em>Elterngeldantrag Antrag0201</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragStandesamtsmeldung0203 <em>Elterngeldantrag Standesamtsmeldung0203</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragVorabmeldung0202 <em>Elterngeldantrag Vorabmeldung0202</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag Abbruch0206</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elterngeldantrag Abbruch0206</em>' containment reference.
	 * @see #setElterngeldantragAbbruch0206(ElterngeldantragAbbruch0206Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_ElterngeldantragAbbruch0206()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag.abbruch.0206' namespace='##targetNamespace'"
	 * @generated
	 */
	ElterngeldantragAbbruch0206Type getElterngeldantragAbbruch0206();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAbbruch0206 <em>Elterngeldantrag Abbruch0206</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag Abbruch0206</em>' containment reference.
	 * @see #getElterngeldantragAbbruch0206()
	 * @generated
	 */
	void setElterngeldantragAbbruch0206(ElterngeldantragAbbruch0206Type value);

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag Anfrage0204</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elterngeldantrag Anfrage0204</em>' containment reference.
	 * @see #setElterngeldantragAnfrage0204(ElterngeldantragAnfrage0204Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_ElterngeldantragAnfrage0204()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag.anfrage.0204' namespace='##targetNamespace'"
	 * @generated
	 */
	ElterngeldantragAnfrage0204Type getElterngeldantragAnfrage0204();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrage0204 <em>Elterngeldantrag Anfrage0204</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag Anfrage0204</em>' containment reference.
	 * @see #getElterngeldantragAnfrage0204()
	 * @generated
	 */
	void setElterngeldantragAnfrage0204(ElterngeldantragAnfrage0204Type value);

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag Anfrageabschluss0205</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elterngeldantrag Anfrageabschluss0205</em>' containment reference.
	 * @see #setElterngeldantragAnfrageabschluss0205(ElterngeldantragAnfrageabschluss0205Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_ElterngeldantragAnfrageabschluss0205()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag.anfrageabschluss.0205' namespace='##targetNamespace'"
	 * @generated
	 */
	ElterngeldantragAnfrageabschluss0205Type getElterngeldantragAnfrageabschluss0205();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAnfrageabschluss0205 <em>Elterngeldantrag Anfrageabschluss0205</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag Anfrageabschluss0205</em>' containment reference.
	 * @see #getElterngeldantragAnfrageabschluss0205()
	 * @generated
	 */
	void setElterngeldantragAnfrageabschluss0205(ElterngeldantragAnfrageabschluss0205Type value);

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag Antrag0201</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachricht vom Portal an die Elterngeldstelle für einen Elterngeldantrag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elterngeldantrag Antrag0201</em>' containment reference.
	 * @see #setElterngeldantragAntrag0201(ElterngeldantragAntrag0201Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_ElterngeldantragAntrag0201()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag.antrag.0201' namespace='##targetNamespace'"
	 * @generated
	 */
	ElterngeldantragAntrag0201Type getElterngeldantragAntrag0201();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragAntrag0201 <em>Elterngeldantrag Antrag0201</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag Antrag0201</em>' containment reference.
	 * @see #getElterngeldantragAntrag0201()
	 * @generated
	 */
	void setElterngeldantragAntrag0201(ElterngeldantragAntrag0201Type value);

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag Standesamtsmeldung0203</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Ankündigung, dass die Geburtsurkunde durch ELFE beim Standesamt angefordert wurde, erfolgt anhand einer XML-Datei.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elterngeldantrag Standesamtsmeldung0203</em>' containment reference.
	 * @see #setElterngeldantragStandesamtsmeldung0203(ElterngeldantragStandesamtsmeldung0203Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_ElterngeldantragStandesamtsmeldung0203()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag.standesamtsmeldung.0203' namespace='##targetNamespace'"
	 * @generated
	 */
	ElterngeldantragStandesamtsmeldung0203Type getElterngeldantragStandesamtsmeldung0203();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragStandesamtsmeldung0203 <em>Elterngeldantrag Standesamtsmeldung0203</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag Standesamtsmeldung0203</em>' containment reference.
	 * @see #getElterngeldantragStandesamtsmeldung0203()
	 * @generated
	 */
	void setElterngeldantragStandesamtsmeldung0203(ElterngeldantragStandesamtsmeldung0203Type value);

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag Vorabmeldung0202</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Vorabmeldung dient der Informierung der zuständige Stelle über einen Eingang eines Elterngeldantrags im Portal oder Antragsservice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elterngeldantrag Vorabmeldung0202</em>' containment reference.
	 * @see #setElterngeldantragVorabmeldung0202(ElterngeldantragVorabmeldung0202Type)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getDocumentRoot_ElterngeldantragVorabmeldung0202()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag.vorabmeldung.0202' namespace='##targetNamespace'"
	 * @generated
	 */
	ElterngeldantragVorabmeldung0202Type getElterngeldantragVorabmeldung0202();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot#getElterngeldantragVorabmeldung0202 <em>Elterngeldantrag Vorabmeldung0202</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag Vorabmeldung0202</em>' containment reference.
	 * @see #getElterngeldantragVorabmeldung0202()
	 * @generated
	 */
	void setElterngeldantragVorabmeldung0202(ElterngeldantragVorabmeldung0202Type value);

} // DocumentRoot
