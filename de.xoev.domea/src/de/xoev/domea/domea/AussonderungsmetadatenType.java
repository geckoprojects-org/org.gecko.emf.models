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
 * A representation of the model object '<em><b>Aussonderungsmetadaten Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Aussonderungsmetadaten fasst die Informationen zu einem abschließend bearbeiteten Schriftgutobjekt (Vorgang oder Akte) zusammen, die für seine Aufbewahrung und Aussonderung relevant sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAussonderungsart <em>Aussonderungsart</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlag <em>Bewertungsvorschlag</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlagBegruendung <em>Bewertungsvorschlag Begruendung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsende <em>Aufbewahrungsende</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsmetadatenType#getTransferfristende <em>Transferfristende</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType()
 * @model extendedMetaData="name='AussonderungsmetadatenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AussonderungsmetadatenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aufbewahrungsdauer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aufbewahrungsdauer legt fest, wie viele Jahre eine Akte oder ein Vorgang nach der Verfügung zur Akte (zdA-Verfügung) innerhalb der aktenführenden Stelle aufzubewahren ist oder ob die Aufbewahrung unbefristet erfolgen soll. Nach Ablauf der Aufbewahrungsfrist erfolgt die Aussonderung in Abhängigkeit von der Aussonderungsart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufbewahrungsdauer</em>' containment reference.
	 * @see #setAufbewahrungsdauer(AufbewahrungsdauerType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_Aufbewahrungsdauer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aufbewahrungsdauer' namespace='##targetNamespace'"
	 * @generated
	 */
	AufbewahrungsdauerType getAufbewahrungsdauer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufbewahrungsdauer</em>' containment reference.
	 * @see #getAufbewahrungsdauer()
	 * @generated
	 */
	void setAufbewahrungsdauer(AufbewahrungsdauerType value);

	/**
	 * Returns the value of the '<em><b>Aussonderungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aussonderungsart gibt für eine Akte oder einen Vorgang das Ergebnis der archivischen Bewertung an.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussonderungsart</em>' containment reference.
	 * @see #setAussonderungsart(AussonderungsartType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_Aussonderungsart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aussonderungsart' namespace='##targetNamespace'"
	 * @generated
	 */
	AussonderungsartType getAussonderungsart();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAussonderungsart <em>Aussonderungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussonderungsart</em>' containment reference.
	 * @see #getAussonderungsart()
	 * @generated
	 */
	void setAussonderungsart(AussonderungsartType value);

	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kennung enthält bei der Durchführung einer Aussonderung die Archivkennung, bei einer Abgabe die Kennung des Schriftgutobjekts aus dem System der übernehmenden Behörde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' attribute.
	 * @see #setKennung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_Kennung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Kennung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getKennung <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennung</em>' attribute.
	 * @see #getKennung()
	 * @generated
	 */
	void setKennung(String value);

	/**
	 * Returns the value of the '<em><b>Bewertungsvorschlag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Bewertungsvorschlag ist ein Hinweis des Bearbeiters eines Schriftgutobjekts an das zuständige Archiv.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bewertungsvorschlag</em>' containment reference.
	 * @see #setBewertungsvorschlag(BewertungsvorschlagCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_Bewertungsvorschlag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bewertungsvorschlag' namespace='##targetNamespace'"
	 * @generated
	 */
	BewertungsvorschlagCodeType getBewertungsvorschlag();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlag <em>Bewertungsvorschlag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bewertungsvorschlag</em>' containment reference.
	 * @see #getBewertungsvorschlag()
	 * @generated
	 */
	void setBewertungsvorschlag(BewertungsvorschlagCodeType value);

	/**
	 * Returns the value of the '<em><b>Bewertungsvorschlag Begruendung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Element BewertungsvorschlagBegruendung enthält die Beweggründe für den Bewertungsvorschlag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bewertungsvorschlag Begruendung</em>' attribute.
	 * @see #setBewertungsvorschlagBegruendung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_BewertungsvorschlagBegruendung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BewertungsvorschlagBegruendung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBewertungsvorschlagBegruendung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlagBegruendung <em>Bewertungsvorschlag Begruendung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bewertungsvorschlag Begruendung</em>' attribute.
	 * @see #getBewertungsvorschlagBegruendung()
	 * @generated
	 */
	void setBewertungsvorschlagBegruendung(String value);

	/**
	 * Returns the value of the '<em><b>Aufbewahrungsende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Aufbewahrungsende gibt taggenau das Ende der Aufbewahrungsfrist an.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufbewahrungsende</em>' attribute.
	 * @see #setAufbewahrungsende(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_Aufbewahrungsende()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Aufbewahrungsende' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAufbewahrungsende();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsende <em>Aufbewahrungsende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufbewahrungsende</em>' attribute.
	 * @see #getAufbewahrungsende()
	 * @generated
	 */
	void setAufbewahrungsende(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Transferfristende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Transferfristende gibt taggenau das Ende der Transferfrist an.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transferfristende</em>' attribute.
	 * @see #setTransferfristende(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsmetadatenType_Transferfristende()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='Transferfristende' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTransferfristende();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getTransferfristende <em>Transferfristende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transferfristende</em>' attribute.
	 * @see #getTransferfristende()
	 * @generated
	 */
	void setTransferfristende(XMLGregorianCalendar value);

} // AussonderungsmetadatenType
