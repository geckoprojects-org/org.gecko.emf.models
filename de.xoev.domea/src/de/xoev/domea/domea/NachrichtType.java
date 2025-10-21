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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basistyp für alle Nachrichten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getNachrichtenkopf <em>Nachrichtenkopf</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getProdukthersteller <em>Produkthersteller</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getStandard <em>Standard</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getTest <em>Test</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType()
 * @model extendedMetaData="name='NachrichtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachrichtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachrichtenkopf für Nachrichten. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichtenkopf</em>' containment reference.
	 * @see #setNachrichtenkopf(NachrichtenkopfType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Nachrichtenkopf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtenkopf' namespace='##targetNamespace'"
	 * @generated
	 */
	NachrichtenkopfType getNachrichtenkopf();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getNachrichtenkopf <em>Nachrichtenkopf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichtenkopf</em>' containment reference.
	 * @see #getNachrichtenkopf()
	 * @generated
	 */
	void setNachrichtenkopf(NachrichtenkopfType value);

	/**
	 * Returns the value of the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut ist der Name des Produktes (der Software) einzutragen, mit dem die Nachricht erstellt worden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkt</em>' attribute.
	 * @see #setProdukt(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Produkt()
	 * @model dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='produkt'"
	 * @generated
	 */
	String getProdukt();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getProdukt <em>Produkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkt</em>' attribute.
	 * @see #getProdukt()
	 * @generated
	 */
	void setProdukt(String value);

	/**
	 * Returns the value of the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird der Name der Organisation / Firma übermittelt, die für das Produkt (die Software) verantwortlich ist, mit dem die Nachricht erstellt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkthersteller</em>' attribute.
	 * @see #setProdukthersteller(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Produkthersteller()
	 * @model dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='produkthersteller'"
	 * @generated
	 */
	String getProdukthersteller();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getProdukthersteller <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkthersteller</em>' attribute.
	 * @see #getProdukthersteller()
	 * @generated
	 */
	void setProdukthersteller(String value);

	/**
	 * Returns the value of the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut werden ergänzende Hinweise zu dem Produkt eingetragen. Dies sind Angaben, die für eine möglichst präzise Identifikation im Fehlerfall hilfreich sind, wie zum Beispiel Version und Patchlevel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produktversion</em>' attribute.
	 * @see #setProduktversion(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Produktversion()
	 * @model dataType="datatypedin.DatatypeC"
	 *        extendedMetaData="kind='attribute' name='produktversion'"
	 * @generated
	 */
	String getProduktversion();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getProduktversion <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produktversion</em>' attribute.
	 * @see #getProduktversion()
	 * @generated
	 */
	void setProduktversion(String value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * The default value is <code>"xdomea"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird der Name des XÖV-Standards angegeben, aus dem die Nachricht stammt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see #isSetStandard()
	 * @see #unsetStandard()
	 * @see #setStandard(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Standard()
	 * @model default="xdomea" unsettable="true" dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='standard'"
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see #isSetStandard()
	 * @see #unsetStandard()
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(String value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.NachrichtType#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandard()
	 * @see #getStandard()
	 * @see #setStandard(String)
	 * @generated
	 */
	void unsetStandard();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.NachrichtType#getStandard <em>Standard</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard</em>' attribute is set.
	 * @see #unsetStandard()
	 * @see #getStandard()
	 * @see #setStandard(String)
	 * @generated
	 */
	boolean isSetStandard();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ist dieses Attribut vorhanden, handelt es sich aus Sicht des Autors um eine Testnachricht, die nicht im normalen Produktivbetrieb verarbeitet werden darf. Autor und Leser können bilateral weitere Absprachen über den konkreten Inhalt des Attributs treffen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Test()
	 * @model dataType="datatypedin.DatatypeC"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"4.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird die Version des XÖV-Standards eingetragen, aus dem die Nachricht stammt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtType_Version()
	 * @model default="4.0.0" unsettable="true" dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.NachrichtType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.NachrichtType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // NachrichtType
