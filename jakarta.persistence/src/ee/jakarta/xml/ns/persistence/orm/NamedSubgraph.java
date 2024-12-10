/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package ee.jakarta.xml.ns.persistence.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Subgraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         @Target({}) @Retention(RUNTIME)
 *         public @interface NamedSubgraph {
 *           String name();
 *           Class<?> type() default void.class;
 *           NamedAttributeNode[] attributeNodes();
 *         }
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getNamedAttributeNode <em>Named Attribute Node</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getClass_ <em>Class</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedSubgraph()
 * @model extendedMetaData="name='named-subgraph' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NamedSubgraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Attribute Node</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.orm.NamedAttributeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Attribute Node</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedSubgraph_NamedAttributeNode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='named-attribute-node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamedAttributeNode> getNamedAttributeNode();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedSubgraph_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.orm.OrmPackage#getNamedSubgraph_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.orm.NamedSubgraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedSubgraph
