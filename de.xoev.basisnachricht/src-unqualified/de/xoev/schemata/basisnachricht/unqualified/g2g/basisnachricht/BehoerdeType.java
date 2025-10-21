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
package de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behoerde Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Typ enthält Angaben zur Identifikation einer Behörde / öffentlichen Stelle in einem Verzeichnisdienst sowie ihrer Erreichbarkeit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 * </ul>
 *
 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getBehoerdeType()
 * @model extendedMetaData="name='BehoerdeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BehoerdeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Verzeichnisdienst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Verzeichnisdienstes (bspw. DVDV), in welchem die Behörde / öffentliche Stelle unter der nachfolgend angegebenen Kennung eingetragen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verzeichnisdienst</em>' containment reference.
	 * @see #setVerzeichnisdienst(CodeVerzeichnisdienstType)
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getBehoerdeType_Verzeichnisdienst()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verzeichnisdienst'"
	 * @generated
	 */
	CodeVerzeichnisdienstType getVerzeichnisdienst();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verzeichnisdienst</em>' containment reference.
	 * @see #getVerzeichnisdienst()
	 * @generated
	 */
	void setVerzeichnisdienst(CodeVerzeichnisdienstType value);

	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält die eindeutige Kennzeichnung der Behörde / öffentlichen Stelle innerhalb des angegebenen Verzeichnisdienstes. Für den Verzeichnisdienst „DVDV“ enthält die Kennzeichnung das „Präfix“ und die „Kennung“ getrennt durch das Zeichen ':', also bspw. 'psw:01003110'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' attribute.
	 * @see #setKennung(String)
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getBehoerdeType_Kennung()
	 * @model dataType="de.xoev.kosit.datentyp._201903.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='kennung'"
	 * @generated
	 */
	String getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getKennung <em>Kennung</em>}' attribute.
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
	 * Dieses Element enthält den Namen der Behörde / öffentlichen Stelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getBehoerdeType_Name()
	 * @model dataType="de.xoev.kosit.datentyp._201903.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BehoerdeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element werden Angaben zur Erreichbarkeit übermittelt, mit denen die Behörde / öffentliche Stelle über Telefon, E-Mail etc. erreicht werden kann. Diese Angaben können z. B. verwendet werden, um in Einzelfällen Rückfragen zu stellen oder Problemklärungen durchzuführen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getBehoerdeType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit'"
	 * @generated
	 */
	EList<KommunikationType> getErreichbarkeit();

} // BehoerdeType
