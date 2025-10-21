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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld;

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
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungAnforderung0501 <em>Mutterschaftsgeldmeldung Anforderung0501</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungRueckmeldung0502 <em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getDocumentRoot()
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
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldmeldung Anforderung0501</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antrag zur Anforderung von Mutterschaftsgeld.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldmeldung Anforderung0501</em>' containment reference.
	 * @see #setMutterschaftsgeldmeldungAnforderung0501(MutterschaftsgeldmeldungAnforderung0501Type)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getDocumentRoot_MutterschaftsgeldmeldungAnforderung0501()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldmeldung.anforderung.0501' namespace='##targetNamespace'"
	 * @generated
	 */
	MutterschaftsgeldmeldungAnforderung0501Type getMutterschaftsgeldmeldungAnforderung0501();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungAnforderung0501 <em>Mutterschaftsgeldmeldung Anforderung0501</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldmeldung Anforderung0501</em>' containment reference.
	 * @see #getMutterschaftsgeldmeldungAnforderung0501()
	 * @generated
	 */
	void setMutterschaftsgeldmeldungAnforderung0501(MutterschaftsgeldmeldungAnforderung0501Type value);

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeldmeldung Rueckmeldung0502</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rückmeldung zum Muttergeld nach Entbindung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>' containment reference.
	 * @see #setMutterschaftsgeldmeldungRueckmeldung0502(MutterschaftsgeldmeldungRueckmeldung0502Type)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getDocumentRoot_MutterschaftsgeldmeldungRueckmeldung0502()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldmeldung.rueckmeldung.0502' namespace='##targetNamespace'"
	 * @generated
	 */
	MutterschaftsgeldmeldungRueckmeldung0502Type getMutterschaftsgeldmeldungRueckmeldung0502();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot#getMutterschaftsgeldmeldungRueckmeldung0502 <em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>' containment reference.
	 * @see #getMutterschaftsgeldmeldungRueckmeldung0502()
	 * @generated
	 */
	void setMutterschaftsgeldmeldungRueckmeldung0502(MutterschaftsgeldmeldungRueckmeldung0502Type value);

} // DocumentRoot
