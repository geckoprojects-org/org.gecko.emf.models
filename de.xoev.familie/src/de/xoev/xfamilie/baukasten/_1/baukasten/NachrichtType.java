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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basistyp für alle Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getNachrichtenkopf <em>Nachrichtenkopf</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getZusatzparametergruppe <em>Zusatzparametergruppe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukthersteller <em>Produkthersteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getStandard <em>Standard</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getTest <em>Test</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType()
 * @model extendedMetaData="name='NachrichtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachrichtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachrichtenkopf</em>' containment reference.
	 * @see #setNachrichtenkopf(NachrichtenkopfType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Nachrichtenkopf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtenkopf' namespace='##targetNamespace'"
	 * @generated
	 */
	NachrichtenkopfType getNachrichtenkopf();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getNachrichtenkopf <em>Nachrichtenkopf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichtenkopf</em>' containment reference.
	 * @see #getNachrichtenkopf()
	 * @generated
	 */
	void setNachrichtenkopf(NachrichtenkopfType value);

	/**
	 * Returns the value of the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Zusatzparametergruppe darf nur dazu genutzt werden, weitere (z.B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in XFamilie spezifizierten Metadaten nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzparametergruppe</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Zusatzparametergruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zusatzparametergruppe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZusatzparametergruppeType> getZusatzparametergruppe();

	/**
	 * Returns the value of the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut ist der Name des Produktes (der Software) einzutragen, mit dem diese Nachricht erstellt worden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkt</em>' attribute.
	 * @see #setProdukt(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Produkt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='produkt'"
	 * @generated
	 */
	String getProdukt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukt <em>Produkt</em>}' attribute.
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
	 * In diesem Attribut ist der Name der Firma oder der Organisation einzutragen, die für das DV-Verfahren verantwortlich ist, mit dem diese Nachricht erstellt worden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkthersteller</em>' attribute.
	 * @see #setProdukthersteller(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Produkthersteller()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='produkthersteller'"
	 * @generated
	 */
	String getProdukthersteller();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukthersteller <em>Produkthersteller</em>}' attribute.
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
	 * In diesem Attribut sollen ergänzende Hinweise zu dem Produkt, mit dem diese Nachricht erstellt worden ist, eingetragen werden. Dies sind Angaben, die für eine möglichst präzise Identifikation im Fehlerfall hilfreich sind, wie zum Beispiel Version und Patchlevel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produktversion</em>' attribute.
	 * @see #setProduktversion(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Produktversion()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='attribute' name='produktversion'"
	 * @generated
	 */
	String getProduktversion();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProduktversion <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produktversion</em>' attribute.
	 * @see #getProduktversion()
	 * @generated
	 */
	void setProduktversion(String value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * The default value is <code>"XFamilie"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element/Attribut ist nur Wert „XFamilie“ zulässig (fixed-Wert).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see #isSetStandard()
	 * @see #unsetStandard()
	 * @see #setStandard(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Standard()
	 * @model default="XFamilie" unsettable="true" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='standard'"
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getStandard <em>Standard</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandard()
	 * @see #getStandard()
	 * @see #setStandard(String)
	 * @generated
	 */
	void unsetStandard();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getStandard <em>Standard</em>}' attribute is set.
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
	 * Dieses Attribut ist optional. Ist es vorhanden, so sagt dies aus, dass es sich um eine Nachricht handelt, die (aus Sicht des Autors der Nachricht) nicht im normalen Produktivbetrieb behandelt werden soll. Über den Inhalt des Attributes wird nichts weiter ausgesagt, dies kann bilateral zwischen den Kommunikationspartnern vereinbart werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Test()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird die Version von XFamilie übermittelt, aus dem die Nachricht stammt. Die Versionsbezeichnung wird durch XFamilie als fixed-Value auf Schemaebene festgelegt (z. B. 1.2.0).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getNachrichtType_Version()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // NachrichtType
