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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signatur Siegel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur elektronischen Signatur oder zum elektronischen Siegel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.SignaturSiegelType#isSignaturSiegelEingebettet <em>Signatur Siegel Eingebettet</em>}</li>
 *   <li>{@link de.xoev.domea.domea.SignaturSiegelType#getSignaturSiegelDatei <em>Signatur Siegel Datei</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getSignaturSiegelType()
 * @model extendedMetaData="name='SignaturSiegelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignaturSiegelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signatur Siegel Eingebettet</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die elektronische Signatur oder das elektronische Siegel zum Dokument liegt eingebettet vor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatur Siegel Eingebettet</em>' attribute.
	 * @see #isSetSignaturSiegelEingebettet()
	 * @see #unsetSignaturSiegelEingebettet()
	 * @see #setSignaturSiegelEingebettet(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getSignaturSiegelType_SignaturSiegelEingebettet()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='SignaturSiegelEingebettet' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSignaturSiegelEingebettet();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.SignaturSiegelType#isSignaturSiegelEingebettet <em>Signatur Siegel Eingebettet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatur Siegel Eingebettet</em>' attribute.
	 * @see #isSetSignaturSiegelEingebettet()
	 * @see #unsetSignaturSiegelEingebettet()
	 * @see #isSignaturSiegelEingebettet()
	 * @generated
	 */
	void setSignaturSiegelEingebettet(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.SignaturSiegelType#isSignaturSiegelEingebettet <em>Signatur Siegel Eingebettet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignaturSiegelEingebettet()
	 * @see #isSignaturSiegelEingebettet()
	 * @see #setSignaturSiegelEingebettet(boolean)
	 * @generated
	 */
	void unsetSignaturSiegelEingebettet();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.SignaturSiegelType#isSignaturSiegelEingebettet <em>Signatur Siegel Eingebettet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signatur Siegel Eingebettet</em>' attribute is set.
	 * @see #unsetSignaturSiegelEingebettet()
	 * @see #isSignaturSiegelEingebettet()
	 * @see #setSignaturSiegelEingebettet(boolean)
	 * @generated
	 */
	boolean isSetSignaturSiegelEingebettet();

	/**
	 * Returns the value of the '<em><b>Signatur Siegel Datei</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die elektronische Signatur oder das elektronische Siegel zum Dokument liegt in einer separaten Datei vor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatur Siegel Datei</em>' attribute list.
	 * @see de.xoev.domea.domea.DomeaPackage#getSignaturSiegelType_SignaturSiegelDatei()
	 * @model unique="false" dataType="de.xoev.domea.domea.StringDateinameType"
	 *        extendedMetaData="kind='element' name='SignaturSiegelDatei' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSignaturSiegelDatei();

} // SignaturSiegelType
