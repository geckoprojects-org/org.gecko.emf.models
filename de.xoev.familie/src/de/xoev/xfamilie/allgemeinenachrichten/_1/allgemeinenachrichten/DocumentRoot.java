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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

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
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenQuittung0011 <em>Allgemeinenachrichten Quittung0011</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenRueckweisung0001 <em>Allgemeinenachrichten Rueckweisung0001</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getDocumentRoot()
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
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Allgemeinenachrichten Quittung0011</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht quittiert die fachlich zuständige Stelle dem Antragsservice, dass sie eine zuvor erhaltene Nachricht erfolgreich erhalten und auf Spezifikationskonformität geprüft hat und somit aus technische Sicht einer Weiterverarbeitung im Fachverfahren der zuständigen Stelle nichts im Wege steht. Die Quittungsnachricht ist von allen fachlichen Bereichen umzusetzen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeinenachrichten Quittung0011</em>' containment reference.
	 * @see #setAllgemeinenachrichtenQuittung0011(AllgemeinenachrichtenQuittung0011Type)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getDocumentRoot_AllgemeinenachrichtenQuittung0011()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='allgemeinenachrichten.quittung.0011' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinenachrichtenQuittung0011Type getAllgemeinenachrichtenQuittung0011();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenQuittung0011 <em>Allgemeinenachrichten Quittung0011</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeinenachrichten Quittung0011</em>' containment reference.
	 * @see #getAllgemeinenachrichtenQuittung0011()
	 * @generated
	 */
	void setAllgemeinenachrichtenQuittung0011(AllgemeinenachrichtenQuittung0011Type value);

	/**
	 * Returns the value of the '<em><b>Allgemeinenachrichten Rueckweisung0001</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht wird eine an den Leser gerichtete Ursprungsnachricht als fehlerhaft an den Autor zurückgewiesen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeinenachrichten Rueckweisung0001</em>' containment reference.
	 * @see #setAllgemeinenachrichtenRueckweisung0001(AllgemeinenachrichtenRueckweisung0001Type)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getDocumentRoot_AllgemeinenachrichtenRueckweisung0001()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='allgemeinenachrichten.rueckweisung.0001' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinenachrichtenRueckweisung0001Type getAllgemeinenachrichtenRueckweisung0001();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot#getAllgemeinenachrichtenRueckweisung0001 <em>Allgemeinenachrichten Rueckweisung0001</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeinenachrichten Rueckweisung0001</em>' containment reference.
	 * @see #getAllgemeinenachrichtenRueckweisung0001()
	 * @generated
	 */
	void setAllgemeinenachrichtenRueckweisung0001(AllgemeinenachrichtenRueckweisung0001Type value);

} // DocumentRoot
