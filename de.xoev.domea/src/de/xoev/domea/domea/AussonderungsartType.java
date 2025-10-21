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
 * A representation of the model object '<em><b>Aussonderungsart Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Aussonderungsart gibt das Ergebnis der archivischen Bewertung an. Damit eine automatische Selektion der auszusondernden Vorgänge erfolgen kann, muss in DMS / VBS für Akten und Vorgänge ein Metadatum "Aussonderungsart" oder "AussonderungsartKonfigurierbar" vorgegeben werden. Die Aussonderungsart liegt beim zweistufigen Aussonderungsverfahren bereits im DMS / VBS vor (durch Bewertung von Akten und Vorgängen im DMS / VBS oder durch Hinterlegung eines Bewertungskatalogs am Aktenplan) oder sie wird im vierstufigen Aussonderungsverfahren durch die Übernahme des Bewertungsverzeichnisses ins DMS / VBS übernommen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AussonderungsartType#getAussonderungsart <em>Aussonderungsart</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AussonderungsartType#getAussonderungsartKonfigurierbar <em>Aussonderungsart Konfigurierbar</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsartType()
 * @model extendedMetaData="name='AussonderungsartType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AussonderungsartType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aussonderungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aussonderungsart als Wert aus einer vorgegebenen Codeliste.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussonderungsart</em>' containment reference.
	 * @see #setAussonderungsart(AussonderungsartCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsartType_Aussonderungsart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aussonderungsart' namespace='##targetNamespace'"
	 * @generated
	 */
	AussonderungsartCodeType getAussonderungsart();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsartType#getAussonderungsart <em>Aussonderungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussonderungsart</em>' containment reference.
	 * @see #getAussonderungsart()
	 * @generated
	 */
	void setAussonderungsart(AussonderungsartCodeType value);

	/**
	 * Returns the value of the '<em><b>Aussonderungsart Konfigurierbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aussonderungsart als frei konfigurierbarer Wert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussonderungsart Konfigurierbar</em>' attribute.
	 * @see #setAussonderungsartKonfigurierbar(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAussonderungsartType_AussonderungsartKonfigurierbar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AussonderungsartKonfigurierbar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAussonderungsartKonfigurierbar();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AussonderungsartType#getAussonderungsartKonfigurierbar <em>Aussonderungsart Konfigurierbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussonderungsart Konfigurierbar</em>' attribute.
	 * @see #getAussonderungsartKonfigurierbar()
	 * @generated
	 */
	void setAussonderungsartKonfigurierbar(String value);

} // AussonderungsartType
