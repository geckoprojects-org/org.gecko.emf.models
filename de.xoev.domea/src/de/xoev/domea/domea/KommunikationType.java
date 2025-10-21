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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kommunikation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Typ enthält Angaben zur Erreichbarkeit über elektronische Kommunikationskanäle (z. B. Telefon, E-Mail).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.KommunikationType#isIstDienstlich <em>Ist Dienstlich</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KommunikationType#isIstInstitution <em>Ist Institution</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getKommunikationType()
 * @model extendedMetaData="name='KommunikationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KommunikationType extends basisnachricht.KommunikationType {
	/**
	 * Returns the value of the '<em><b>Ist Dienstlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit IstDienstlich kann angegeben werden, ob es sich um dienstliche oder private Kommunikationsdaten handelt. Handelt es sich um dienstliche Kommunikationsdaten, so ist der Wert "1" anzugeben. Handelt es sich um private Kommunikationsdaten, so ist der Wert "0" anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ist Dienstlich</em>' attribute.
	 * @see #isSetIstDienstlich()
	 * @see #unsetIstDienstlich()
	 * @see #setIstDienstlich(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getKommunikationType_IstDienstlich()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IstDienstlich' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIstDienstlich();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KommunikationType#isIstDienstlich <em>Ist Dienstlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist Dienstlich</em>' attribute.
	 * @see #isSetIstDienstlich()
	 * @see #unsetIstDienstlich()
	 * @see #isIstDienstlich()
	 * @generated
	 */
	void setIstDienstlich(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.KommunikationType#isIstDienstlich <em>Ist Dienstlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIstDienstlich()
	 * @see #isIstDienstlich()
	 * @see #setIstDienstlich(boolean)
	 * @generated
	 */
	void unsetIstDienstlich();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.KommunikationType#isIstDienstlich <em>Ist Dienstlich</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ist Dienstlich</em>' attribute is set.
	 * @see #unsetIstDienstlich()
	 * @see #isIstDienstlich()
	 * @see #setIstDienstlich(boolean)
	 * @generated
	 */
	boolean isSetIstDienstlich();

	/**
	 * Returns the value of the '<em><b>Ist Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit IstInstitution kann angegeben werden, ob es sich um Kommunikationsdaten einer Institution handelt oder nicht. Handelt es sich um eine Institution, so ist der Wert "1" anzugeben. Handelt es sich um keine Institution, so ist der Wert "0" anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ist Institution</em>' attribute.
	 * @see #isSetIstInstitution()
	 * @see #unsetIstInstitution()
	 * @see #setIstInstitution(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getKommunikationType_IstInstitution()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IstInstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIstInstitution();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KommunikationType#isIstInstitution <em>Ist Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist Institution</em>' attribute.
	 * @see #isSetIstInstitution()
	 * @see #unsetIstInstitution()
	 * @see #isIstInstitution()
	 * @generated
	 */
	void setIstInstitution(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.KommunikationType#isIstInstitution <em>Ist Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIstInstitution()
	 * @see #isIstInstitution()
	 * @see #setIstInstitution(boolean)
	 * @generated
	 */
	void unsetIstInstitution();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.KommunikationType#isIstInstitution <em>Ist Institution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ist Institution</em>' attribute is set.
	 * @see #unsetIstInstitution()
	 * @see #isIstInstitution()
	 * @see #setIstInstitution(boolean)
	 * @generated
	 */
	boolean isSetIstInstitution();

} // KommunikationType
